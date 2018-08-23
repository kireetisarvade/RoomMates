<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
   <meta name="viewporst" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <style type="text/css">
   
   .header{background-color:red}
.footer{bottom:0;position:fixed;width:84.5%;background-color:red;color:yellow;text-color:black"}
</style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
   <div class="container">

  <form class="form-horizontal" action="/ManaRiceWebsiteProject/changepassword.html" method="post">
  <div class="form-group header">
  	<div  class="control-label col-sm-5">
		<h3>MANA RICE</h3>
		<h4>${status}</h4>
	</div>
  </div>
   <div class="form-group" >
      <label class="control-label col-sm-8">Email or Phone</label>  
      <div class="col-sm-4">	  
        <input type="text" class="form-control" name ="mail" style="width:70%" id="email">
      </div>
    </div>
	<div class="form-group">
      <label class="control-label col-sm-8">New Password</label>
	  
      <div class="col-sm-4">
        <input type="password" class="form-control" name="password" style="width:70%" id="pass">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-8">Confirm Password</label>
	  
      <div class="col-sm-4">
        <input type="password" class="form-control" style="width:70%" id="pass">
      </div>
    </div>
      <div class="form-group">        
      <div class="col-sm-offset-8 col-sm-4">
        <button type="submit" class="btn btn-default">Submit</button>
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
  <h4 align="center"  ><a href="https://www.Manarice.com"><font color="black">www.Manarice.com</font></a></h4>
 <h6 align="center">© 2018 Copyright</h6>
 </div>
 </div>
 
  </body>
</html>
