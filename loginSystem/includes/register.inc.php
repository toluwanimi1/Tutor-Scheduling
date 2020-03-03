<?php
if (isset($_POST['register-submit'])) {

    require 'dbh.inc.php';

    //variables
    $username = $_POST['uid'];                //input username username = input
    $email = $_POST['email'];                 //input
    $studentID = $_POST['sid'];                 //input
    $password = $_POST['pwd'];                  //input 
    $passwordRepeat = $_POST['pwd-repeat'];     //input

    if (empty($username) || empty($email) ||empty($studentID) ||empty($password) ||empty($passwordRepeat)) {        //if all fields are empty 
        header("Location: ../register.php?error=emptyfields");                                                      //calls empty fields error from register file
        exit();
    }
    else if (!filter_var($email, FILTER_VALIDATE_EMAIL) && !preg_match("/^[a-zA-Z0-9]*$/", $username)) {           //if the email is not valid and doesnt match username     
        header("Location: ../register.php?error=invalidemailuid");                                                  //call error from register file
        exit();
    }
    else if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {                          // if the email is not valid
        header("Location: ../register.php?error=invalidemail");                     //call invalid email from register file 
        exit();
    }
    else if (!preg_match("/^[a-zA-Z0-9]*$/", $username)) {                          //if the username is not valid 
        header("Location: ../register.php?error=invaliduid");                       //call invalid username from register file 
        exit();
    }
    else if ($password !== $passwordRepeat) {                                       //if the password is not equal to the the repeated password
        header("Location: ../register.php?error=passwordcheck");                    //calls passwords are not the same error from file
        exit();
    }
    else {

        $sql = "SELECT uidUSERS FROM users WHERE uidUsers=? AND sidUsers=?";        //
        $stmt = mysqli_stmt_init($conn);                                            //initializes statement as an object for mysqli stmst prepare
        if (!mysqli_stmt_prepare($stmt, $sql)) {
            header("Location: ../register.php?error=sqlerror");                     
            exit();
        }
        else {
            mysqli_stmt_bind_param($stmt, "ss", $username, $studentID);             //connects variables to a parameter                             
            mysqli_stmt_execute($stmt);
            mysqli_stmt_store_result($stmt);                                        //store results for statement
            $resultCheck = mysqli_stmt_num_rows($stmt);
            if ($resultCheck > 0) {                                                     //if there is more than one occurance of the parameters
                header("Location: ../register.php?error=uidtakensidtaken");             //call error username or id is taken 
                exit();
            }
            else {

                $sql = "INSERT INTO users (uidUsers, emailUsers, sidUsers, pwdUsers) VALUES (?, ?, ?, ?)";
                if (!mysqli_stmt_prepare($stmt, $sql)) {                                                //if sql statement cannot prepare for execution     
                    header("Location: ../register.php?error=sqlerror");                                 //call sql error from file 
                    exit();
                }
                else {
                    $hashedPwd = password_hash($password, PASSWORD_DEFAULT);

                    mysqli_stmt_bind_param($stmt, "ssss", $username, $email, $studentID, $hashedPwd);           //connects variables to a parameter
                    mysqli_stmt_execute($stmt);                                                                 //
                    header("Location: ../register.php?register=success");                                        //calls success message from file 
                    exit();
                }

            }
        }
    }
    mysqli_stmt_close($stmt);               //close variables
    mysqli_close($conn);                    //close connection

}
else {
    header("Location: ../register.php?");
    exit();
}
