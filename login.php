<?php

// Get values passed from form in login.php file
$username = $_POST['username'];
$password = $_POST['password'];

// To prevent mysql injection
$username = stripcslashes($username);
$password = stripcslashes($password);
$username = mysql_real_escape_string($username);
$password = mysql_real_escape_string($password);

// connect to the server and select database
mysql_connect("localhost", "root", "CTEC2302020");
mysql_select_db("login");

// Query the database for user
$result = mysql_query("Select * from users where username = '$username' and password = '$password'") or die("Failed to query Database".mysql_error());
$row = mysql_fetch_array($result);
if ($row['username'] == $username && $row['password'] == $password ){
    echo "Login success!!! Welcome ".$row['username'];
} else {
    echo "Failed to login!";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div id="frm">
        <form action="process.php" method="POST">
            <p>
                <label>Username:</label>
                <input type="text" id="user" name="user"  />
            </p>
            <p>
                <label>Password:</label>
                <input type="password" id="pass" name="pass"  />
            </p>|<p>
                <label>Password:</label>
                <input type="password" id="pass" name="pass"  />
            </p>

        </form>
    </div>

</body>
</html>