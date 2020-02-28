<?php

$serverName = "localhost";
$dBUserName = "root";
$dBPassWord = "CTEC2302020";
$dBName = "loginsystem";

$conn = mysqli_connect($serverName, $dBUserName, $dBPassWord, $dBName);

if (!$conn) {
    die("Connection failed: ".mysqli_connect_error());
}