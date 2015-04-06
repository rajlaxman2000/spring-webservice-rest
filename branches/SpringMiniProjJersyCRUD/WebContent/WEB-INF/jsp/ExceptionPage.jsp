<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <title>Application Exception Handling page</title>
	</head>
	<body>
	<div style="color: red;">
		<h2>Exception Occured, please try again</h2>
		
		<h3>${exception.exceptionMsg}</h3>
	</div>
	<jsp:include page="/WEB-INF/jsp/menu.jsp"></jsp:include>
	</body>
</html>