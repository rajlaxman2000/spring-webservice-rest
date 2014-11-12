<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/menu.jsp"></jsp:include>
	<h2>Below student details added successfully</h2>
	<table>
		<tr>
			<td>ID</td>
		    <td>${student.id}</td>	    
		</tr>
		<tr>
		    <td>First Name</td>
		    <td>${student.firstName}</td>
		</tr>
		<tr>
		    <td>Last Name</td>
		    <td>${student.lastName}</td>
		 </tr>
		 <tr>
		    <td>Email Id</td>
		    <td>${student.emailId}</td>
		 </tr>
		 
		 <tr>
		    <td>Phone Number</td>
		    <td>${student.phoneNumber}</td>
		 </tr>
		 
		 <tr>
		    <td>Address</td>
		    <td>${student.address.drNo}</td>
		    <td>${student.address.street}</td>
		    <td>${student.address.city}</td>
		    <td>${student.address.state}</td>
		    <td>${student.address.country}</td>
		 </tr>		
	</table>  
	</body>
</html>