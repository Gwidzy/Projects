function orderSuccess(){
    alert("Order successfully made!");
}

function invalidLogin(){
    alert("You have entered the incorrect data!");
}

function passwordsMatch(){
    alert("Your passwords do not match!")
}

function emailValidation(){
    var valiEmail = document.forms["login"]['custEmail'].value;
    if(valiEmail == ""){
        alert("You cannot leave email field blank!");
        return false;
    }
}