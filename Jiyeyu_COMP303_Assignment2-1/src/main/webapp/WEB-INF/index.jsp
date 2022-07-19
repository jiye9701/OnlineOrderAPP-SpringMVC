<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Order</title>


<link href="<%=request.getContextPath() %>/css/indexStyleSheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id ="allPage"style="width:980px; margin-left:auto; margin-right:auto;">

<header>
<h1>Online Laptops Ordering Application</h1>
</header>
<form id="allform" action="information" method="post">
<br>
<div class="form-group-userId" style ="text-align:center;">
<label for="inputuserId"><strong>User ID<br></strong></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="userId" name="userId" placeholder="Enter the User ID" size="100"/><br></div>
<br>

<div class="form-group-password" style ="text-align:center;">
<label for="inputpassword"><strong>Password</strong><br></label><br>
<input style="width:400px; height:20px;" type="password" class="form-control" id="password" name="password" placeholder="Enter the password" size="100"/><br>
</div>

           
           
           <br>
           <br>
                     


<br><br>
<br><br>

<div style="text-align:center;">
           <button style="font-size:20px; border: solid 2px grey; border-radius: 10px; padding:10px 10px; text-align:center;" type="submit" name="Add Users">Login</button>
</div>

           </form>
           
           <br>
<form action="register" method="POST">
<div style="text-align:center;">
           <button style="font-size:20px; border: solid 2px grey; border-radius: 10px; padding:10px 10px;" type="submit">Register</button>
           </div>
           </form>
           <br><br>

           </div>

           
           </body>
           </html>

