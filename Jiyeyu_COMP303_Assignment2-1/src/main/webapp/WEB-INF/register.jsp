<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>


<link href="<%=request.getContextPath() %>/css/indexStyleSheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id ="allPage"style="width:980px; margin-left:auto; margin-right:auto;">

<header>
<h1>Registration</h1>
</header>
<form id="allform" action=regUsers method="post">
<br>
<div class="form-group-userId" style = "margin-left:30px" >
<label for="inputuserId"><strong>User ID<br></strong></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="userId" name="userId" placeholder="Enter the User ID" size="100" required/><br></div>
<br>

<div class="form-group-password" style = "margin-left:30px">
<label for="inputpassword"><strong>Password</strong><br></label><br>
<input style="width:400px; height:20px;" type="password" class="form-control" id="password" name="password" placeholder="Enter the password" size="100" required/><br>
</div>
<br>

<div class="form-group-name" style = "margin-left:30px">
<label for="inputName"><strong>Full Name</strong><br></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id ="firstname" name="firstname" placeholder="First Name" required/>&nbsp;&nbsp;&nbsp;&nbsp;
<input style="width:400px; height:20px" type="text" class="form-control" id= "lastname" name="lastname" placeholder="Last Name" required/><br></div>
<br>

<div class="form-group-phoneNumber" style = "margin-left:30px">
<label for="inputpassword"><strong>Phone Number</strong><br></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="phoneNumber" size="100" required/><br>
</div>
<br>

<div class="form-group-address" style = "margin-left:30px">
<label for="inputpassword"><strong>Address</strong><br></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="address" name="address" placeholder="Address" size="100" required/><br>
</div>
<br>

<div class="form-group-city" style = "margin-left:30px">
<label for="inputpassword"><strong>City</strong><br></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="city" name="city" size="100" required/><br>
</div>
<br>

<div class="form-group-postalcode" style = "margin-left:30px">
<label for="inputpassword"><strong>Postal Code</strong><br></label><br>
<input style="width:400px; height:20px;" type="text" class="form-control" id="postalCode" name="postalCode" size="100" required/><br>
</div>


           
           
           <br>
           <br>
                     


<br><br>
<br><br>

<div style="text-align:center;">
           <button style="font-size:20px; border: solid 2px grey; border-radius: 10px; padding:10px 10px; margin-left: -10px; margin-right: 100px; text-align:center;" type="submit" name="Add Users">Register</button>

           <button style="font-size:20px; border: solid 2px grey; border-radius: 10px; padding:10px 10px;" type="reset">Reset</button>
           </div>
           
           </form>
           <br><br>

           </div>

           
           </body>
           </html>

