


var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

 $(document).ready( function(){
 
  $('#fname').keyup(function ()
 {
 if($('#fname').val().length>0)
 {
   $('#errFname').html('');
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
 
   
$('#account').click(function()
{ 
alert($('#fname').val());
 var status=true;
if ($('#fname').val()=="")
{
  $('#errFname').html("first name is required");
  //alert("iiiii");
 status=false;
}
else if(!fnameformat.test($('#fname').val()))
 {
 $('#errFname').html("First name should be in characters");
 status=false;
 }
 
if($('#lname').val()=="")
{
$('#errLname').html("Last name is required");
status=false;
}
else if(!fnameformat.test($('#lname').val()))
{
$('#errLname').html("Last name should be in characters");
status=false;
}

if($('#email').val()=="")
{
$('#errEmail').html("Email id is required");
status=false;
}
else if(!mailformat.test($('#email').val()))
{
$('#errEmail').html("email is invalid");
status=false;
}
		alert(status);
      if(status==true)
	  {
	    $('#myform').action ="Home.html";
		$('#myform').method="post";
		$('#myform').submit();
      }
	  }
); 
 } 
 );