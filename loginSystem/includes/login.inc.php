<?php

if (isset($_POST['login-submit'])) {

    require 'dbh.inc.php';                                                          //uses file

    //variables
    $mailuid = $_POST['mailuid'];                                                   //id
    $password = $_POST['pwd'];                                                      //password

    if (empty($mailuid) || empty($password)) {                  
        header("Location: ../index.php?error=emptyfields");                         //error checking for no input
        exit();
    }
    else {
        $sql = "SELECT * FROM users WHERE uidUsers=? OR emailUsers=?;";             //uses user id or email to identify      
        $stmt = mysqli_stmt_init($conn);
        if (!mysqli_stmt_prepare($stmt, $sql)) {                                    //if the connection is succes 
            header("Location: ../index.php?error=sqlerror");                        //calls error from                            
            exit();                                                                 //exit code
        }
        else {

            mysqli_stmt_bind_param($stmt, "ss", $mailuid, $mailuid);
            mysqli_stmt_execute($stmt);
            $result = mysqli_stmt_get_result($stmt);
            if ($row = mysqli_fetch_assoc($result)) {                              //if result is found in row
                $pwdCheck = password_verify($password, $row['pwdUsers']);          //check password to authenticate user
                if ($pwdCheck == false) {                                          //if not found in table 
                    header("Location: ../index.php?error=wrongpassword");          //calls error from file 
                    exit();                                                        //exit code

                }
                else if ($pwdCheck == true) {                                      //if password is succesful found  
                    session_start();                                               //start the session 
                    $_SESSION['userID'] = $row['idUsers'];                         //display user 
                    $_SESSION['userUid'] = $row['uidUsers'];                       

                    header("Location: ../index.php?login=success");                //call success from index file 
                }
                else {
                    header("Location: ../index.php?error=wrongpwd");                //calls wrong password error 
                    exit();                                                         //exit
                }
            }
            else {
                header("Location: ../index.php?error=nouser");                      //user doesnt exits error from index file 
        exit();
            }
        }
    }
}
else {
    header("Location: ../index.php");
        exit();
}
