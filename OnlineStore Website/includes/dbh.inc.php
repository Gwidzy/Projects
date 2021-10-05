<?php

$dbServername = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "itecdb";

$conn = mysqli_connect($dbServername, $dbUsername, $dbPassword, $dbName);

if(!$conn){
    die("Connection failed: " .mysqli_connect_error());
}

?>