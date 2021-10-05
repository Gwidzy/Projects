<!DOCTYPE html>
<html>

    <link rel="stylesheet" href="bootstrap.min.css" />
    <link rel="stylesheet" href="Contact-Form-Clean.css" />
    <link rel="stylesheet" href="Login-Form-Clean-1.css" />
    <link rel="stylesheet" href="Login-Form-Clean.css" />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register</title>
</head>

<body>
    <div class="login-clean">
    <form action = "includes/register.inc.php" method="post">
        <h2 class="sr-only">Login Form</h2>
        <img src="SB Scheduling.png" style="width:187px;margin:26px;" />
        <div class="illustration"></div>
        <div class="form-group"><input type="email" name="email" placeholder="Email" class="form-control" style = "color:black;"/></div>
        <div class="form-group"><input type="password" name="password" placeholder="Password" class="form-control" /></div>
        <div class="form-group"><input class="form-control" type="password" name="password-repeat" placeholder="Password (repeat)" /></div>
        <div class="form-group">
        <div class="form-check"><label class="form-check-label"><input class="form-check-input" type="checkbox" />I agree to the <a href = "terms.html">terms and conditions.</a></label></div>
        <button class="regButton" type="submit" name ="regSubmit" onClick ="loginError()">Register</button>
        <a href="login.php" class="already" >You already have an account? Login here.</a>
        </div>
  
        <?php
        if(isset($_GET["error"])){
            if($_GET["error"] == "emptyinput"){
                echo "<p> Fill in all fields! </p>";
                echo "<script> alert('Input cannot be empty!') </script>";
            }
            else if($_GET["error"] == "invalidemail"){
                echo "<p> Insert valid email address! </p>";
                echo "<script> alert('Your email is invalid!') </script>";
            }
            else if($_GET["error"] == "passwordsdontmatch"){
                echo "<p> Your passwords do not match! </p>";
                echo "<script> alert('Your passwords do not match!') </script>";
            }
            else if($_GET["error"] == "stmtfailed"){
                echo "<p> Something went wrong, please try again! </p>";
                echo "<script> alert('There was an issue on our side, please try again!') </script>";
            }
            else if($_GET["error"] == "emailtaken"){
                echo "<p> This email has already been used! </p>";
                echo "<script> alert('Email is already in use!') </script>";
            }
        }
        ?>
    </form>
    </div>
</body>
</html>