<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 isELIgnored="false"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>${trainee}</h2>
<h2>${remove}</h2>

<p>${tranee.id}</p>
<p>${tranee.name}</p>
<p>${tranee.domian}</p> 
 <p>${tranee.location}</p>
<table border="black">
<h2>Trainee Management System</h2>
<div>
<p><a href="add.jsp" >Add a Trainee<br></p>
<p><a href="index.jsp">Find a Trainee</a><br></p>
<p><a href="remove.jsp">delete a Trainee</a></p>
<p><a href="update.jsp">Modify a Trainee</a></p>
</div>
</table>

</body>
</html>