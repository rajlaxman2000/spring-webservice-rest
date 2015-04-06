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
	<h2>Requested Student Information</h2>

	<form:form method="POST" action="editStudent" modelAttribute="student">
	<table>
		<tr>
			<td>Student Id</td>
		    <td>${student.id}</td>	
		    <form:hidden path="id"/>   	    
		</tr>
		<tr>
		    <td>First Name</td>
		    <td><form:input path="firstName" value="${student.firstName}"/></td>
		</tr>
		<tr>
		    <td>Last Name</td>
		    <td><form:input path="lastName" value="${student.lastName}"/></td>
		 </tr>
		 
		 <tr>
		    <td>Email Id</td>
		    <td><form:input path="emailId" value="${student.emailId}"/></td>
		 </tr>
		 
		 <tr>
		    <td>Phone Number</td>
		    <td><form:input path="phoneNumber" value="${student.phoneNumber}"/></td>
		 </tr>
		 
		 <tr>
		    <td>Address</td>
		    <td><form:input  path="address.drNo" value="${student.address.drNo}"/></td>
		    <td><form:input  path="address.street" value="${student.address.street}"/></td>
		    <td><form:input  path="address.city" value="${student.address.city}"/></td>
		    <td><form:input  path="address.state" value="${student.address.state}"/></td>
		    <td><form:input  path="address.country" value="${student.address.country}"/></td>
		 </tr>
		  <tr>
		 	<td colspan="2"><input type="submit" value="Edit"/></td>
		 </tr>
	</table>
	</form:form> 
	<form:form action="delStudent">
		<input type="hidden" name="studentId" id="studentId" value="${student.id}"/>
		<input type="submit" value="Delete"/>
	</form:form>
	</body>
</html>