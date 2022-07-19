<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>


<link href="<%=request.getContextPath() %>/css/indexStyleSheet.css" rel="stylesheet" type="text/css">
</head>

<body>
<div id ="allPage"style="width:980px; margin-left:auto; margin-right:auto;">
<header>
<h1>Order</h1>
</header>
<form id= "allform" action = "orderedLaptops" method = "POST">


<h3 class="text-center">Order Information</h3>

<div class="form-group-type">
<label>Laptop Type: </label>
		<br>
		<select style="width:800px; height:30px;" id="laptopId" name="laptopId" required>
		
		  <option selected disabled>--Select the Type--</option>
		  
		  
		  <option value="1">MacBook Pro</option>
	      <option value="2">MackBook Air</option>
	      <option value="3">Chromebook</option>
	      <option value="4">LG Gram</option>
	      <option value="5">Netbook</option>
	      <option value="6">Lenovo</option>
      </select>
      <br>
      <br>
</div>
      
	      
	      
<div class="form-group-size">
<label>Laptop Size: </label>
		<br>
		<select style="width:800px; height:30px;" id="lsize" name="lsize" required>
		  <option selected disabled>--Select the Size--</option>
		  <option value="13 inch">13 inch</option>
	      <option value="15 inch">15 inch</option>
	      <option value="16 inch">16 inch</option>
	      </select>
	      <br>
	      <br>
	      
	      </div>
	      
	      <div class="form-group-num">
	     
	     <label>Number of Laptops (Quantity): </label> <br>
	     <input style="width:398px; height:20px;" size="50" type="text" class="form-control" id="lnum" name="lnum" placeholder = "Quantity" required>
	      <br>
           </div>
           <br>
           
           <label>Amount: </label> <br>
	     <input style="width:398px; height:20px;" size="50" type="text" class="form-control" id="amountPaid" name="amountPaid" placeholder = "amountPaid" required>
	      <br>
           </div>
           
           <br><br>
	     


<div style="margin:auto width: 50%; text-align:center;">
           <button style="font-size:20px; border: solid 2px white; border-radius: 10px; margin-right: 150px; padding:10px 10px;" type="reset">Reset Form</button>
           
           <button style="font-size:20px; border: solid 2px white; border-radius: 10px; margin-right: 150px; padding:10px 10px;" type="submit">Checkout</button>


<br><br>
</div>

</form>
</div>



           </body>
           </html>
