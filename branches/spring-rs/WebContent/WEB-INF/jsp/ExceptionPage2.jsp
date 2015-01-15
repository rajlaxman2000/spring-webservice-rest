<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
	    <title>Application Exception Handling page</title>
	</head>
	<body>
	<div>
	<h2>Exception Message can be read below</h2>
	
	<h3>${exception.exceptionMsg}</h3>
	</div>
	<jsp:include page="/WEB-INF/jsp/menu.jsp"></jsp:include>
	</body>
</html>