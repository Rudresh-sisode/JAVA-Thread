
<%@page import="co.edureka.model.User" %>
<%@page import="co.edureka.db.JDBCHelper" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication code</title>
</head>
<body>
<!-- Expression language only below line -->
<h3>Authenticating user with EMAIL: ${param.txtemail }</h3>

	<%
	 User user=new User();
	 user.email=request.getParameter("txtemail");
	 user.password=request.getParameter("txtPassword");
	
	 JDBCHelper helper=new JDBCHelper();
	 helper.createConnection();
	 boolean auth=helper.authenticateUser(user);
	 
	 helper.closeConnection();
	 
	 if(auth){
		 
		 String name="rudresh sisodiya";
		 String email=user.email;
		 int age=20;
	/*	 
		 Cookie ck1=new Cookie("KeyName",name);
		 Cookie ck2=new Cookie("KeyEmail",email);
		 Cookie ck3=new Cookie("KeyAge",String.valueOf(age));
		 
		 response.addCookie(ck1);
		 response.addCookie(ck2);
		 response.addCookie(ck3);
		 */
		 session.setAttribute("KeyName", name);
		 session.setAttribute("KeyEmail",email);
		 session.setAttribute("KeyAge", age);
		 //below is another way
		 pageContext.setAttribute("KeyName",name,PageContext.SESSION_SCOPE);
		 %>
		 <jsp:forward page="welcome.jsp"/>
		 <h2>login is success !!</h2>
		 
		 <a href="welcome.jsp">Enter home</a>
		 <%}
	 else
	 {%>
	 <h2>Login is unsuccess!!</h2>
	 <%
	// response.sendRedirect("https://www.google.in");
	 }
	 %>
	

</body>
</html>