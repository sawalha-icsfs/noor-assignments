
function inputValidation() {
    firstName = document.getElementById("firstName").value;
    lastName = document.getElementById("lastName").value;
    companyFacebook  = document.getElementById("companyFaceBookPage").value;


    if (isNull(firstName)) 
    {  alert("First Name is Required");}
    else if (allLetter(firstName)) {   alert("First Name Should Be Text");}



    if (isNull(lastName)) {
        alert("Last Name is Required");
    }
    else if (allLetter(lastName)) {
        alert("Last Name Should Be Text");


    }
    if (isNull(companyFacebook)) {
       // alert("Last Name is Required");
    }
    else if (!(companyFacebook.startsWith("https://facebook.com"))) {
        alert("Company Facebook :invalid URL ");
   }

}


    function isNull(value) {
        if (value.isNull || value == "") {
            return true;
        }
        return false;

    }

    function allLetter(inputtxt) {
        var letters = /^[A-Za-z]+$/;
        if (inputtxt.match(letters)) {
            return false;
        }


        return true;

    }