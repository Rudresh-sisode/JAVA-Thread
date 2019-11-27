<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page errorPage="Error.jsp" %>
 <%@ include file="printdate.jsp" %>
 <%@page import="co.edureka.model.Student" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 
 <!-- The aboe single line is include directive only -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>

<h3>Welcom  to jsp demo</h3>

<h3>Jstl demo</h3>

<c:forEach var="i" begin="1" end="10">
<c:out value="${i}"/><br/>
</c:forEach>




<h4>Scriptlet:</h4>
<%
//java code
int a=10;
int b=20;
int c=a+b;
 	if(a>b)
 	{
 		%>
 		<b>A is greater than b</b>
 		<%
 	}
 	else
 	{
 		%>
 		<b> b is greter than a</b>
 		<%
 		}
 		%>
 	
 	


<h3>C is : <%out.print(c); %></h3>
<h4>Declarative</h4>

<%!
double pi=3.14;

double calArea(double radius){
	double area=pi*radius*radius;
	return area;
}

%>
<!-- Action tag only below one line -->
<jsp:include page="printdate.jsp"/>
<h3>Pi is <%out.print(pi); %></h3>
<h3>Area with radius 2.2 is :<% out.print(calArea(2.3)); %></h3>

<h4>Expression</h4>
<h3>Area with radius 11.11 is :<%= calArea(11.11) %></h3>

<%
int[] arr={11,22,33,44,55};
	out.print("<h4>"+arr[3]+"</h4>");




%>
<%
Student sRef=new Student();
sRef.setRoll(101);
sRef.setName("Rudresh");

%>
<h3>Roll no : <%= sRef.getRoll() %></h3>
<h3>Name is : <%= sRef.getName() %></h3>

<jsp:useBean id="stu" class="co.edureka.model.Student"/>
<jsp:setProperty property="roll" name="stu" value="121"/>
<jsp:setProperty property="name" name="stu" value="FIona"/>

<h4>Roll No: <jsp:getProperty property="roll" name="stu"/></h4>
<h4>Name is: <jsp:getProperty property="name" name="stu"/></h4>

</body>
</html>