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
    <title>contact us</title>

</head>

<body><div>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean">
        <div class="container"><a class="navbar-brand" href="#">
            <a href = "homepage.php"> <img class="logo_small" src="SB Scheduling.png" /></a></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item"><a href="profile.html" class="nav-link">My profile</a></li>
                    <li class="nav-item"><a href="order.html" class="nav-link">Orders</a></li>
                    <li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>
                    <li class="nav-item"><a href="includes/logout.inc.php" class="nav-link">Logout</a></li>
                </ul>
        </div>    
</div>   
</nav>
</div>
<div class="contact-clean">
    <form method="post">
        <h2 class="text-center">Contact us</h2>
        <center>
       <img src="SB Scheduling.png" style="width:187px;margin:26px;" />
        </center>
        <div class="form-group"><input type="text" name="name" placeholder="Name" class="form-control" /></div>
        <div class="form-group"><input type="email" name="email" placeholder="Email" class="form-control is-invalid" /><small class="form-text text-danger">Please enter a correct email address.</small></div>
        <div class="form-group"><textarea rows="14" name="message" placeholder="Message" class="form-control"></textarea></div>
        <div class="form-group"><button class="sendButton" type="submit">Send</button></div>
    </form>
</div>
</body>

</html>            