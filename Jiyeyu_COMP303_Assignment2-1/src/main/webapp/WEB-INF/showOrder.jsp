<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
	<h1>Show Order Form</h1>
	</header>
	<table style = padding-left:250;padding-bottom:0; border="2" align = "center">
		<tr>
			<th style="width: 100px; height: 40px; border: 2px solid gray;">Order No</th>
			<th style="width: 100px; height: 40px; border: 2px solid gray;">Laptop ID</th>
			<th style="width: 100px; height: 40px; border: 2px solid gray;">Laptop Size</th>
			<th style="width: 100px; height: 40px; border: 2px solid gray;">Laptop Num</th>
			<th style="width: 100px; height: 40px; border: 2px solid gray;">Amount Paid</th>
			
		</tr>
		<c:forEach var="allOrder" items="${showOrder}">
			<tr>
				<td style="width: 100px; height: 40px; text-align: center;">${allOrder.orderNo}</td>
				<td style="width: 100px; height: 40px; text-align: center;">${allOrder.laptopId}</td>
				<td style="width: 100px; height: 40px; text-align: center;">${allOrder.lsize}</td>
				<td style="width: 100px; height: 40px; text-align: center;">${allOrder.lnum}</td>
				
				<td style="width: 100px; height: 40px; text-align: center;">$${allOrder.amountPaid}</td>
			</tr>
		</c:forEach>
		
	</table>
	
	<br>
	<br>
<form action="../edit2" method="POST" style="text-align:center;">
	<button style="font-size:20px; border: solid 2px grey; border-radius: 10px;">Close</button>
		<br>
	<br>
</form>
</div>
</body>
</html>