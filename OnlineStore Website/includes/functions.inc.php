<?php

//function that checks if the user has entered any values
function emptyInputRegister($email, $password, $passwordRepeat){
    $result;
    if(empty($email) || empty($password) || empty($passwordRepeat)){
        $result = true;
    }else{
        $result = false;
    }
    return $result;
}

//function to show if the email is invalid or not
function invalidEmail($email){
    $result;
    if(!filter_var($email, FILTER_VALIDATE_EMAIL)){
        $result = true;
    }else{
        $result = false;
    }
    return $result;
}

//function to check that the passwords entered are matching
function passwordMatch($password, $passwordRepeat){
    $result;
    if($password !== $passwordRepeat){
        $result = true;
    }else{
        $result = false;
    }
    return $result;
}

//function that checks if the email has been used before when registering
function emailExists($conn, $email){
    $sql = "SELECT * FROM Customer WHERE custEmail = ?;";
    $stmt = mysqli_stmt_init($conn);

    if(!mysqli_stmt_prepare($stmt,$sql)){
        header("location: ../register.php?error=stmtfailed");
        exit();
    }   

    mysqli_stmt_bind_param($stmt,"s",$email);
    mysqli_stmt_execute($stmt);

    $resultsData = mysqli_stmt_get_result($stmt);

    if($row = mysqli_fetch_assoc($resultsData)){
        return $row;
    }
    else{
        $result = false;
        return $result;
    }
    
    mysqli_stmt_close($stmt);

}

//function that adds a user to the database
function createCustomer($conn, $email, $password){
    $sql = "INSERT INTO Customer (custEmail, custPassword) VALUES(?, ?);";
    $stmt = mysqli_stmt_init($conn);

    if(!mysqli_stmt_prepare($stmt,$sql)){
        header("location: ../register.php?error=stmtfailed");
        exit();
    }

    $hashedPassword = password_hash($password, PASSWORD_DEFAULT);

    mysqli_stmt_bind_param($stmt, "ss", $email,$hashedPassword);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);
    header("location: ../login.php?error=none");
    exit();
}

//function that checks if the login is empty or not
function emptyInputLogin($email, $password){
    $result;
    if(empty($email) || empty($password)){
        $result = true;
    }else{
        $result = false;
    }
    return $result;
}

//function that logs the customer into the website
function loginCustomer($conn, $email, $password){
    $emailExists = emailExists($conn, $email, $email);

    if($emailExists === false){
        header("location: ../login.php?error=wronglogin");
        exit();
    }

    $passwordHashed = $emailExists["custPassword"];
    $checkPassword = password_verify($password,$passwordHashed);

    if($checkPassword === false){
        header("location: ../login.php?error=wronglogin");
        exit();
    }
    else if($checkPassword === true){
        session_start();
        $_SESSION["custID"] = $emailExists["custID"];
        $_SESSION["custEmail"] = $emailExists["custEmail"];
        header("location: ../homepage.php");
        exit();
    }
}
?>