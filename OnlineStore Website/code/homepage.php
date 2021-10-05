<?php
    session_start();
?>

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
    <title>homepage</title>
</head>

<body>

<div>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean">
        <div class="container"><a class="navbar-brand" href="#">
            <a href = "homepage.php"> <img class="logo_small" src="SB Scheduling.png" /></a></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                <?php
                    if(isset($_SESSION["custEmail"])){
                        echo "<li class='nav-item'><p>Welcome " . $_SESSION["custEmail"] . "</p><li>";
                    }
                ?>
                <?php
                    if(isset($_SESSION["custID"])){
                    echo "<li class= 'nav-item'><a href='profile.php' class='nav-link'>My profile</a></li>";
                    echo "<li class='nav-item'><a href='viewOrder.php' class='nav-link'>Orders</a></li>";
                    echo "<li class='nav-item'><a href='contact.php' class='nav-link'>Contact</a></li>";
                    echo "<li class= 'nav-item'><a  href='includes/logout.inc.php' class='nav-link' onClick= logout()'>Logout</a></li>";
                    }
                ?>
                    
                    
                
                </ul>
            </div>    
        </div>   
    </nav>
</div>

<div class="projects-clean">
    <div class="container">
        <div class="intro">
            <h2 class="text-center">Templates</h2>
            <p class="text-center"></p>
        </div>  
        <div class="row projects">
            
            <div class="col-sm-6 col-lg-4 item">
               <a href="order.php" > <input type = "image" src="temp0.png" class="temp" id="temp0"/> </a>
                <h4 class="name">Blank Template - R40.00</h4>
            </div>
            
            <div class="col-sm-6 col-lg-4 item">
                <a href="order2.php" ><input type = "image" src="temp1.png" class="temp"/>  </a>           
                <h4 class="name">Template 1 - R40.00</h4>
            </div>
            <div class="col-sm-6 col-lg-4 item">
                <a href="order3.php" ><input type = "image" src="temp3.png" class="temp"/></a>
                <h4 class="name">Template 2 - R40.00</h4>
            </div>
            <div class="col-sm-6 col-lg-4 item">
               <a href="order4.php" > <input type = "image" src="temp4.png" class="temp"/></a>
                <h4 class="name">Template 3 - R40.00</h4>
            </div>
            <div class="col-sm-6 col-lg-4 item">
               <a href="order5.php" > <input type = "image" src="temp5.png" class="temp"/></a>
                <h4 class="name">Template 4 - R40.00</h4>
            </div>
            <div class="col-sm-6 col-lg-4 item">
               <a href="order6.php" > <input type = "image" src="temp6.png" class="temp"/></a>
                <h4 class="name">Template 5 - R40.00</h4>
            </div>
        </div>
    </div>
</div>
</body>
</html>