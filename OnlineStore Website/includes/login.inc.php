<?php

if(isset($_POST["logSubmit"])){


    $email = $_POST["email"];
    $password = $_POST["password"];           

    echo $email;
    echo $password;

    require_once 'dbh.inc.php';
    require_once 'functions.inc.php';

    if(emptyInputLogin($email, $password) !== false){
        echo "at the empty input login";
        header("location: ../login.php?error=emptyinput");
        exit();
    }

    loginCustomer($conn, $email, $password);
    
}
else{
    header("location: ../login.php");
    exit();
}
?>