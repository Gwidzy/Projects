<?php

    require_once 'dbh.inc.php';

    $weeks = $_POST["week"];
    $row1 = $_POST["row1"];
    $row2 = $_POST["row2"];
    $row3 = $_POST["row3"];
    $row4 = $_POST["row4"];
    $row5 = $_POST["row5"];
    $quote = $_POST["quote"];
    $colourScheme = $_POST["colour-Scheme"];           

$sql = "INSERT INTO scheduleinfo (weeks, shedInfoRow1, shedInfoRow2, shedInfoRow3, shedInfoRow4, shedInfoRow5, 
quotes, colourScheme) VALUES ('$weeks', '$row1', '$row2', '$row3', '$row4', '$row5', '$quote', '$colourScheme');";
mysqli_query($conn, $sql);

header("Location: ../orderConfirm.php?order=success");
