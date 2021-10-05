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
    <title>your orders</title>
</head>

<body>
<div>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean">
        <div class="container"><a class="navbar-brand" href="#">
            <a href = "homepage.php"> <img class="logo_small" src="SB Scheduling.png" /></a></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item"><a href="profile.php" class="nav-link">My profile</a></li>
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
                <center><h1 style = "width: 805px;">Orders review:</h1></center>
                </div>
                <table>
                <tr>
                    <td>
                <img class="reviewImage" style = "height: 350px; width:540px;" src="temp3.png"/>
                    </td>
                    
                <?php
                    include_once 'includes/dbh.inc.php';
                    
                    $sql = "SELECT * FROM scheduleinfo;";
                    $results = mysqli_query($conn, $sql);
                    $row = $results->fetch_assoc();
                    
                    $weeks = $row['weeks'];
                    $row1 = $row['shedInfoRow1'];
                    $row2 = $row['shedInfoRow2'];
                    $row3 = $row['shedInfoRow3'];
                    $row4 = $row['shedInfoRow4'];
                    $row5 = $row['shedInfoRow5'];
                    $quote = $row['quotes'];
                    $colourScheme = $row['colourScheme']; 
                ?>
                    <td>
                    <input type="text" readonly = "readonly" value = <?php echo $weeks ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $row1 ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $row2 ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $row3 ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $row4 ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $row5 ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $quote ?> style ="width: 258px;"/>
                    <input type="text" readonly = "readonly" value = <?php echo $colourScheme ?> style ="width: 258px;"/>  
                    </td>
                </tr>                     
                </table>    
            </div>          
        </div>
    </div>
</div>
</body>

</html>