<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Bootstrap Example</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
     <link rel="stylesheet" type="text/css" href="WebContent/ CSS/custom.css">
  
  <style type="text/css">
 
  .header{background-color:red}
   .con{background-repeat:no-repeat;background-size:cover;background-image:url("WebContent/Images/green.jpg")}
.footer{bottom:0;position:fixed;width:85%;background-color:red;color:yellow}
.span{color:red}
    </style>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   <script type="text/javascript">
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var fnameformat =/^[A-Za-z]+$/;
    var lnameformat =/^[A-Za-z]+$/;
    var passwordformat=/^[A-Za-z0-9]+$/;
           
$(document).ready( function(){
 /*
  $('#fname').keyup(function ()
 {
 if($('#fname').val().length>0)
 {
   $('#fname').html('first name is required');
 } 
 } 
 );
 $('#lname').keyup(function ()
 {
 if($('#lname').val().length>0)
 {
   $('#errLname').html('');
 } 
 } 
 );
 $('#email').keyup(function ()
 {
 if($('#email').val().length>0)
 {
   $('#errEmail').html('');
 } 
 } 
 );

 $('#email').keyup(function ()
 {
 if($('#email').val().length>0)
 {
   $('#errEmail').html('');
 } 
 } 
 );
   */ 
$('#sub').click(function()
{ 
alert($('#fname').val());
 var status=true;
if ($('#fname').val()=="")
{
	 $('#errName').html('first name is required');
	//document.getElementById('errName').innerHTML="First Name is required";
  //alert("first name is required");
  //alert("iiiii");
 status=false;
}
else if(!fnameformat.test($('#fname').val()))
 {
	$('#errName').html('First name should be in characters');
// alert("First name should be in characters");
 status=false;
 }
 
if($('#lname').val()=="")
{
	 $('#errName').html('last name is required');
 //alert("Last name is required");
status=false;
}
else if(!fnameformat.test($('#lname').val()))
{
	$('#errName').html("Last name should be in characters");
status=false;
}
if($('#email').val()=="")
{
	$('#errName').html("Email id is required");
	
//alert("Email id is required");
status=false;
}
else if(!mailformat.test($('#email').val()))
{
	
	$('#errName').html("email Id is invalid");
//alert("email Id is invalid");
status=false;
}
if($('#pass').val()=="")
	{
	$('#errName').html("Password Required");
	//alert("Password Required");
	status=false;
	}
else if(!passwordformat.test($('#pass').val()))
	{
	$('#errName').html("password must be combination of character's and numbers");
	//alert("password must be combination of character's and numbers");
	status=false;
	}
      alert(status);
      if(status==true)
	  {
    	  alert("test");
	    $('#myform').action="/ManaRiceWebsiteProject/Registration.html";
	    $('#myform').method="post";
	   $('#myform').submit();
      }
	  }
); 
 } 
 );
</script>
  
 
  </head>   
  <body class="con">
<div class="container">

<form class="form-horizontal"  id="myform" >
<div class="form-group header" >
  	<div  class="control-label col-sm-5">
		<h3>MANA RICE</h3>
	</div>
  </div>  
  <div class="form-group">
  	<div class="control-label col-sm-11">
		<h3 >Create a New Account</h3>
		<h3>${status}</h3>
	</div>
  </div>
  <div class="form-group">
      <label class="control-label col-sm-8">First Name</label>
	  
      <div class="col-sm-4">
        <input type="text" name="fname" class="form-control" style="width:70%" id="fname">
      </div>
      
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class="span" id ="errName"></span>
      </div>
    </div>
    
    
	
	<div class="form-group">
      <label class="control-label col-sm-8">Last Name:</label>
	  
      <div class="col-sm-4">
        <input type="text" name="lname" class="form-control" style="width:70%" id="lname">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class= "span" id ="errName"></span>
      </div>
    </div>
    
	<div class="form-group">
      <label class="control-label col-sm-8">Email or Phone</label>
	  
    <div class="col-sm-4">
        <input type="text" name="email" class="form-control" style="width:70%" id="email">
      </div>
    </div>
    	
	<div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class="span" id ="errName"></span>
      </div>
    </div>
	
	
	
	<div class="form-group">
      <label class="control-label col-sm-8">Password</label>
	  
      <div class="col-sm-4">
        <input type="password" name="pas"  class="form-control" style="width:70%" id="pass">
      </div>
    </div>
	 <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class= "span" id ="errName"></span>
      </div>
    </div>
	
	<div class="form-group">
      <label class="control-label col-sm-8">Confirm Password</label>
	  
      <div class="col-sm-4">
        <input type="password"  name="cpas"  class="form-control" style="width:70%" id="cpass">
      </div>
    </div>
    
     <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class= "span" id ="errName"></span>
      </div>
    </div>
	
	<div class="form-group">
      <label class="control-label col-sm-8">Gender</label>
	  <div class="col-sm-4">
	  <input type="radio" name="Gender" value="Male" checked> Male
	  <input type="radio" name="Gender" value="FeMale">FeMale
	  </div>
	 </div>
	  <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4"> 
       <span class= "span" id ="errName"></span>
      </div>
    </div>
	 
	 
   
    <div class="form-group">        
      <div class="col-sm-offset-8 col-sm-4">
        <button id ="sub" type="submit" class="btn btn-default">Create Account</button>
      </div>
    </div>
  </form>
    </div>
   <div class="container">
  <div class="footer">
  <h4 align="center" ><a href="https://www.Manarice.com"><font color="black">www.Manarice.com</font></a></h4>
 <h6 align="center">© 2018 Copyright</h6>
 </div>
 </div>
  </body>
</html>
