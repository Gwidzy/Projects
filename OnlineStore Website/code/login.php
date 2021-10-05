<!DOCTYPE html>
<html>

    <link rel="stylesheet" href="bootstrap.min.css" />
    <link rel="stylesheet" href="Article-Clean.css" />
    <link rel="stylesheet" href="Contact-Form-Clean.css" />
    <link rel="stylesheet" href="Login-Form-Clean-1.css" />
    <link rel="stylesheet" href="Login-Form-Clean.css" />
    <link rel="stylesheet" href="Login-Form-Dark.css" />
    <link rel="stylesheet" href="Navigation-Clean-1.css" />
    <link rel="stylesheet" href="Navigation-Clean.css" />
    <link rel="stylesheet" href="Profile-Edit-Form.css" />
    <link rel="stylesheet" href="Profile-Edit-Form1.css" />
    <link rel="stylesheet" href="Projects-Clean.css" />
    <link rel="stylesheet" href="styles-1.css" />
    <link rel="stylesheet" href="styles-2.css" />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
</head>

<body>
   
<div class = main>
    <div class="login-dark">
        <form action = "includes/login.inc.php" method="post">
            <h2 class="sr-only">Login Form</h2>
            <img src="SB Scheduling.png" style="width:187px;margin:26px;" />
            <div class="form-group"><input type="email" title = "Enter valid email!" name="email" placeholder="Email" class="form-control" style = "color:black;" /></div>
            <div class="form-group"><input type="password" name="password" placeholder="Password" class="form-control" style = "color:black;"/></div>        
            <div class="form-group"><button class="regButton" type="submit" name ="logSubmit" onClick = "loginError()">Login</button></div>
            <a href="homepage.php" class="forgot">Forgot your email or password?</a>
        
            <?php
        if(isset($_GET["error"])){
            if($_GET["error"] == "emptyinput"){
                echo "<center><p style = 'color:black;'> Email or password cannot be blank!  </p></center>";
            }
            else if($_GET["error"] == "wronglogin"){
                echo "<center> <p style = 'color:black;'> Incorrect login information! </p></center>";
            }
        }
        ?>

        </form>
    </div>
</div>

</body>

</html>