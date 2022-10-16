<%@ page import="com.SmartBudget.dao.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%



 try{
	
	 session.getAttribute("logininfo");
	 LoginInfo login=(LoginInfo)session.getAttribute("logininfo");

	 if(login==null){
		 response.sendRedirect("register.jsp"); 
		 
	 }
	
	
}
catch(Exception ex){
	
	
	
	response.sendRedirect("login.jsp");
	
} 



%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Home </title>
</head>
<body>



Welcome 


</body>
</html>