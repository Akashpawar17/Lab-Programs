<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Details</h2>
<h4>User Login:${user.login}</h4>
<h4>User name:${user.name}</h4>
<h4>User Location:${user.location}</h4>
<h4>User Public_Repos:${user.public_repos}</h4>
<img  src="${user.avatar_url}" width="300" height="300">



</body>
</html>