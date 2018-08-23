<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Bootstrap Example</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   
  <!--  <link rel="stylesheet" type="text/css" href="CSS/Global.css"> -->
   <style type="text/css">
   .con{background-repeat:no-repeat;background-size:cover;background-image:url("Images/green.jpg")}
   .header{background-color:red}
.footer{bottom:0;position:fixed;width:84.5%;background-color:red;color:yellow;text-color:black"}
.span{color:red}
</style>
   
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  /*
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var passwordformat=/^[A-Za-z0-9]+$/;
           
$(document).ready( function()
		{
	    $('#sub').click(function()
			{ 
			if($('#email').val()=="")
			{
				$('#errName').html("Email id is required");
				status=false;
			}
			else if(!mailformat.test($('#email').val()))
			{				
				$('#errName').html("email Id is invalid");
				status=false;
			}
			if($('#pass').val()=="")
				{
				$('#errName').html("Password Required");
				status=false;
				}
			      alert(status);
			      if(status==true)
				  {
			    	  alert("------");
			    	  document.getElementById('#myform').action="/ManaRiceWebsiteProject/login.html";
			    	  document.getElementById('#myform').method="post";
			    	  document.getElementById('#myform').submit();
			      }
			}
	    );
		}
		);*/
	</script>

</head>
<body class="con">
    
<div class="container" >

  <form class="form-horizontal" action="/ManaRiceWebsiteProject/login.html" method="post" >
  <div class="form-group header">
  	<div  class="control-label col-sm-5">
		<h3>MANA RICE</h3>
		<h4>${status}</h4>
	</div>
  </div>
   <div class="form-group" >
   
      <label class="control-label col-sm-8">Email or Phone</label>  
      <div class="col-sm-4">	  
        <input type="text" name ="username" class="form-control" style="width:70%" id="email">
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
        <input type="password" name="password" class="form-control" style="width:70%" id="pass">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-8"></label>	  
      <div class="col-sm-4">
       <span class= "span" id ="errName"></span>
      </div>
    </div>
    
    
    
    <div class="form-group">
      <label class="control-label col-sm-8"></label>
	  
      <div class="col-sm-4">
           <h4><font color="red">${err}</font> </h4>
      </div>
    </div>
      <div class="form-group">        
      <div class="col-sm-offset-8 col-sm-4">
        <button type="submit" id ="sub" class="btn btn-default">Log In</button>
		<button type="button"  class="btn btn-default"><a href="JSPS/CustomerRegistration.jsp">Sign Up</a></button>
     </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-10"><a href="JSPS/Forgot.jsp">Forgot Password ?</a></label>
    </div>
  </form>
  </div>
  <div class="container">
  <form  class="form-horizontal">  
  <div class="form-group">
          
        <input type="text" class="form-control col-sm-9" placeholder="Search"  style="margin-left:100px;width:25%" id="search">
          
        <div class="col-sm-3">       
        
        <button type="button"  class="btn btn-default" style="width:30% ">Search</button>
		</div>
    </div>
    </form>
  </div>
  <!-- 
  <div id="footer">
<h4 style ="color:blue" align ="center"> About Us</h4>
</div>
 -->
 <div class="container">
 
 <div class="footer">
  <h4 align="center"><a href="https://www.Manarice.com"><font color="black">www.Manarice.com</font> </a></h4>
 <h6 align="center">© 2018 Copyright</h6>
 </div>
 </div>
   
  </body>
</html>
