<?php
if (isset($_POST['register-submit'])) {

    require 'dbh.inc.php';

    $username = $_POST['uid'];
    $email = $_POST['email'];
    $studentID = $_POST['sid'];
    $password = $_POST['pwd'];
    $passwordRepeat = $_POST['pwd-repeat'];

    if (empty($username) || empty($email) ||empty($studentID) ||empty($password) ||empty($passwordRepeat)) {
        header("Location: ../register.php?error=emptyfields");
        exit();
    }
    else if (!filter_var($email, FILTER_VALIDATE_EMAIL) && !preg_match("/^[a-zA-Z0-9]*$/", $username)) {
        header("Location: ../register.php?error=invalidemailuid");
        exit();
    }
    else if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        header("Location: ../register.php?error=invalidemail");
        exit();
    }
    else if (!preg_match("/^[a-zA-Z0-9]*$/", $username)) {
        header("Location: ../register.php?error=invaliduid");
        exit();
    }
    else if ($password !== $passwordRepeat) {
        header("Location: ../register.php?error=passwordcheck");
        exit();
    }
    else {

        $sql = "SELECT uidUSERS FROM users WHERE uidUsers=? AND sidUsers=?";
        $stmt = mysqli_stmt_init($conn);
        if (!mysqli_stmt_prepare($stmt, $sql)) {
            header("Location: ../register.php?error=sqlerror");
            exit();
        }
        else {
            mysqli_stmt_bind_param($stmt, "ss", $username, $studentID);
            mysqli_stmt_execute($stmt);
            mysqli_stmt_store_result($stmt);
            $resultCheck = mysqli_stmt_num_rows($stmt);
            if ($resultCheck > 0) {
                header("Location: ../register.php?error=uidtakensidtaken");
                exit();
            }
            else {

                $sql = "INSERT INTO users (uidUsers, emailUsers, sidUsers, pwdUsers) VALUES (?, ?, ?, ?)";
                if (!mysqli_stmt_prepare($stmt, $sql)) {
                    header("Location: ../register.php?error=sqlerror");
                    exit();
                }
                else {
                    $hashedPwd = password_hash($password, PASSWORD_DEFAULT);

                    mysqli_stmt_bind_param($stmt, "ssss", $username, $email, $studentID, $hashedPwd);
                    mysqli_stmt_execute($stmt);
                    header("Location: ../register.php?register=success");
                    exit();
                }

            }
        }
    }
    mysqli_stmt_close($stmt);
    mysqli_close($conn);

}
else {
    header("Location: ../register.php?");
    exit();
}