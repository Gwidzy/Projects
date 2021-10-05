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
    <title>order</title>
</head>

<body><div>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean">
        <div class="container"><a class="navbar-brand" href="#">
            <a href = "homepage.php"> <img class="logo_small" src="SB Scheduling.png" /></a></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item"><a href="profile.html" class="nav-link">My profile</a></li>
                    <li class="nav-item"><a href="viewOrder.php" class="nav-link">Orders</a></li>
                    <li class="nav-item"><a href="contact.php" class="nav-link">Contact</a></li>
                    <li class="nav-item"><a onClick = "logout()" href="login.html" class="nav-link">Logout</a></li>
                </ul>
        </div>    
</div>   
</nav>
</div>
<div class="article-clean">
    <div class="container">
        <div class="row">
            <div class="col-lg-10 col-xl-8 offset-lg-1 offset-xl-2">
                <div class="intro">
                    <center><h1 class="text-center">Order - template 6:</h1></center>
                    <img class="img-fluid" src="temp6.png" /></div>
                    <div class="text">                 
                    </div>
                </div>
            </div>
            <div>
            <center><p class = "description">Please provide the following information:</p></center><center>
        <form action = "includes/order.inc.php" method = "post">
                <input name = "week" type="text" placeholder = "Week:" class = "text-input"/>
                <input name = "row1" type="text" placeholder = "Row 1 information (separated by commas):" class = "text-input"/>
                <input name = "row2" type="text" placeholder = "Row 2 information (separated by commas):" class = "text-input"/>
                <input name = "row3" type="text" placeholder = "Row 3 information (separated by commas):" class = "text-input"/>
                <input name = "row4" type="text" placeholder = "Row 4 information (separated by commas):" class = "text-input"/>
                <input name = "row5" type="text" placeholder = "Row 5 information (separated by commas):" class = "text-input"/>
                <input name = "quote" type="text" placeholder = "Quote:" class = "text-input"/>
                <input name = "colour-Scheme" type="text" placeholder = "Colour scheme:" class = "text-input"/>
            <center><button name = orderSub class="orderButton" type="submit">Order</button>
        </form>
        </div>
    </body>            
</html>