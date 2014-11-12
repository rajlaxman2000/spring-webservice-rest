<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/menu.jsp"></jsp:include>
	<h2>Please enter the student details below</h2>

	<form:form method="POST" action="addStudent" modelAttribute="student">
	<table>
		<tr>
		    <td>First Name</td>
		    <td><form:input path="firstName"/></td>
		</tr>
		<tr>
		    <td>Last Name</td>
		    <td><form:input path="lastName"/></td>
		 </tr>
		 <tr>
		    <td>Email Id</td>
		    <td><form:input path="emailId"/></td>
		 </tr>
		 <tr>
		    <td>Phone Number</td>
		    <td><form:input path="phoneNumber"/></td>
		 </tr>

		 <tr>
		    <td>Address</td>
		 </tr>
		 <tr>
		 	<td>Dr No:</td>
		    <td><form:input  path="address.drNo" /></td>
		 </tr>
		 	<td>Street Name:</td>
		 	<td><form:input  path="address.street"/></td>
		  <tr>
		  	<td>City</td>
		 	<td><form:input  path="address.city"/></td>
		  </tr>
		  <tr>
		  	<td>State</td>
		 	<td><form:input  path="address.state"/></td>
		  </tr>
		  <tr>
		  	<td>Country</td>
		 	<td><form:input  path="address.country"/></td>
		  </tr>
		  <tr>
		 	<td colspan="2"><input type="submit" value="Add Student"/></td>
		 </tr>
	</table>
	</form:form> 	
	</body>
</html>