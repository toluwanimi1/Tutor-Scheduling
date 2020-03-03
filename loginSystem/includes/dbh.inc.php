<?php

// Creates variables for the server, username, password, and database name
$serverName = "localhost";
$dBUserName = "root";
$dBPassWord = "CTEC2302020";
$dBName = "loginsystem";

// Creates a variable for the connection using the previous variables made for the server, username, password, and database name
$conn = mysqli_connect($serverName, $dBUserName, $dBPassWord, $dBName);

// If the database doesn't connect then an error message will pop up
if (!$conn) {
    die("Connection failed: ".mysqli_connect_error());
}