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
    <title>profile</title>

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
<div class="container profile profile-view" id="profile">
    <div class="row">
        <div class="col-md-12 alert-col relative">
            <div role="alert" class="alert alert-info absolue center"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span>Profile successfully updated!</span></div>
        </div>
    </div>
    <form>
        <div class="form-row profile-row">
            <div class="col-md-4 relative">
                <div class="avatar">
                    <div class="avatar-bg center"></div>
                </div><input type="file" class="form-control" name="avatar-file" /></div>
            <div class="col-md-8">
                <center><h1>Profile</h1></center>
                <hr />
                <div class="form-row">
                    <div class="col-sm-12 col-md-6">
                        <div class="form-group"><label>Firstname</label><input type="text" class="form-control" name="firstname" /></div>
                    </div>
                    <div class="col-sm-12 col-md-6">
                        <div class="form-group"><label>Lastname</label><input type="text" class="form-control" name="lastname" /></div>
                    </div>
                </div>
                <div class="form-group"><label>Email</label><input type="email" class="form-control" autocomplete="off" required name="email" /></div>
                <div class="form-row">
                    <div class="col-sm-12 col-md-6">
                        <div class="form-group"><label>Password</label><input type="password" class="form-control" name="password" autocomplete="off" required /></div>
                    </div>
                    <div class="col-sm-12 col-md-6">
                        <div class="form-group"><label>Confirm Password</label><input type="password" class="form-control" name="confirmpass" autocomplete="off" required /></div>
                    </div>
                </div>
                <hr />
                <div class="form-row">
                    <div class="col-md-12 content-right">
                        <button class="btn btn-primary form-btn" type="submit">SAVE</button>
                        <button class="btn btn-danger form-btn" type="reset">CANCEL</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>

</html>