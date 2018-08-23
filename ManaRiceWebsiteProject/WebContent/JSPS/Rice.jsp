<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Bootstrap Example</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   
  <!--  <link rel="stylesheet" type="text/css" href="CSS/Global.css"> -->
   <style type="text/css">
   ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: yellow;
}

li {
    float: left;
}

li a {
    display: block;
    color: black;
    text-align: center;
    padding: 12px 55px;
    text-decoration: none;
}

li a:hover {
  
}   
   .header{background-color:red}
.footer{bottom:0;position:fixed;width:83.5%;background-color:red;color:yellow;text-color:black}
.divmargin{margin-left:-4px}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>





 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
 <div class="container">

  <form class="form-horizontal" action="/ManaRiceWebsiteProject/login.html" method="post">
  
  	<div  class="header">
		<h3 align="center">MANA RICE</h3>
		<h4 align="right"> ${status} <a href="/ManaRiceWebsiteProject/signout.html">Sign Out</a></h4>	
		<ul>
  <li><a href="/ManaRiceWebsiteProject/JSPS/Wellcome.jsp">Home</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/Rice.jsp">Rice</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/Flour.jsp">Flour's</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/Milk.jsp">Milk</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/FreshVegetables.jsp">Fresh Vegetables</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/AboutUs.jsp">About Us</a></li>
  <li><a href="/ManaRiceWebsiteProject/JSPS/ContactUs.jsp">Contact Us</a></li>
</ul>	
	</div>
</form>
</div>	
<div class="container" style="margin-top:-7px;margin-left:87px">
 <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/BasmatiRice.jpg"  height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/milk.jpg"   height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/ragi.jpg"   height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/ragiflour.jpg"   height="235" width="295">
  </div>
  
  </div>
  <div class="container" style="margin-top:-5px;margin-left:87px">
 <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/sonamasu.jpg"   height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/vegii.jpeg"  height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/vegi.jpeg"   height="235" width="295">
  </div>
  <div class="col-sm-3  divmargin">
          <img src="/ManaRiceWebsiteProject/Images/Wheat.jpg"   height="235" width="295">
  </div>
</div>	
<div class="container">
<h4>Hello</h4>
 </div>
  <div class="container">
 <div class="footer">
 <h4 align="center"  ><a href="https://www.Manarice.com"><font color="black">www.Manarice.com</font></a></h4>
 <h6 align="center">© 2018 Copyright</h6>
 </div>
 </div>
 </body>
</html>
