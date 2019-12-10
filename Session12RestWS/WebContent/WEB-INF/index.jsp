<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REST Demo</title>
</head>
<body>
	<h3>Welcome</h3>	
	<h3>Consuming Web Service:</h3>
	
	<%
		ClientConfig cConf = new ClientConfig();
		Client client = ClientBuilder.newClient(cConf); 
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session12RESTWS"));
						  // http://localhost:8080/Session12RESTWS/rest/Hello	
		String plainRes = target.path("rest").path("Hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlRes = target.path("rest").path("Hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlRes = target.path("rest").path("Hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonRes = target.path("rest").path("Hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
	
		
		out.print(plainRes+"<br/>");
		out.print(htmlRes+"<br/>");
		out.print(xmlRes+"<br/>");
		out.print(jsonRes+"<br/>");
		
	%>
	
	
	
</body>
</html>