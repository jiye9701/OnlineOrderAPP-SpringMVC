<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
<link href="<%=request.getContextPath() %>/css/indexStyleSheet.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id ="allPage"style="width:980px; margin-left:auto; margin-right:auto;">

<header>
<h1>Personal Information </h1>
</header>

<form action="changeInfo" method="POST" style="text-align:center;">
<h3>Change your account</h3>
      <button style="font-size:20px; border: solid 2px grey; border-radius: 10px;" type="submit" name="changeInfo">Change</button>
</form>

<form action="ordering" method="POST" style="text-align:center;">
<h3>Make the Order</h3>
      <button style="font-size:20px; border: solid 2px grey; border-radius: 10px;" type="submit" name="order">Order</button>
</form>

<form action="showOrder" method="POST" style="text-align:center;">
<h3>Display the orders</h3>
      <button style="font-size:20px; border: solid 2px grey; border-radius: 10px;" type="submit" name="display">Display</button>
      <br>
      </form>



<br>
<br>
<form action="admin/showOrder" method="POST" style="text-align:center;">
<h3>Display All orders</h3>
<%-- <c:forEach var="userID" items="${users}"> --%>
<c:if test = "${userID ne 'admin'}"> 
      <button button style="font-size:20px; border: solid 2px grey; border-radius: 10px;" type="submit" name="displayAll">All display</button>
 </c:if>
      <br>
      <br>
<%-- </c:forEach> --%>
</form>
</div>



</body>
</html>
