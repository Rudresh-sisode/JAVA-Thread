<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome boss</title>
</head>
<body>
<h3>Welcome user</h3>
<%

   String dataTime =new Date().toString();
%>
<b>Its: <%=dataTime %></b>


<!-- <h3>Cookes</h3> -->

<h3>Session Data:(Session Tracking)</h3>

<%
/*Cookie[] ckArr=request.getCookies();
for(Cookie ck:ckArr)
{
	out.print("<h4>"+ck.getName()+" - "+ck.getValue()+"</h4>");
}*/

String name=(String)session.getAttribute("KeyName");
String email=(String)session.getAttribute("KeyEmail");
int age=(Integer)session.getAttribute("KeyAge");

String name1=(String)pageContext.getAttribute("KeyName",PageContext.SESSION_SCOPE);



%>
<h3>Name: <%= name %></h3>
<h3>Email: <%= email %></h3>
<h3>Age: <%= age %></h3>

</body>

</html>