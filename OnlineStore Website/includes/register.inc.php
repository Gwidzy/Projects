<?php

if(isset($_POST["regSubmit"])){
    
    $email = $_POST["email"];
    $password = $_POST["password"];
    $passwordRepeat = $_POST["password-repeat"];

    require_once 'dbh.inc.php';
    require_once 'functions.inc.php';

    if(emptyInputRegister($email, $password, $passwordRepeat) !== false){
        header("location: ../register.php?error=emptyinput");
        exit();
    }
    if(invalidEmail($email) !== false){
        header("location: ../register.php?error=invalidemail");
        exit();
    }
   if(emailExists($conn,$email) !== false){
        header("location: ../register.php?error=emailtaken");
        exit();
    }
    if(passwordMatch($password,$passwordRepeat) !== false){
        header("location: ../register.php?error=passwordsdontmatch");
        exit();
    }
    
    createCustomer($conn, $email, $password);

}else{
    header("location: ../register.php");
    exit();
}
