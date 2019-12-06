<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleConversionProxyid" scope="session" class="co.edureka.ConversionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleConversionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleConversionProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleConversionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        co.edureka.Conversion getConversion10mtemp = sampleConversionProxyid.getConversion();
if(getConversion10mtemp == null){
%>
<%=getConversion10mtemp %>
<%
}else{
        if(getConversion10mtemp!= null){
        String tempreturnp11 = getConversion10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String feets_1id=  request.getParameter("feets16");
        int feets_1idTemp  = Integer.parseInt(feets_1id);
        int feetToInches13mtemp = sampleConversionProxyid.feetToInches(feets_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(feetToInches13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String mtrs_2id=  request.getParameter("mtrs21");
        int mtrs_2idTemp  = Integer.parseInt(mtrs_2id);
        int mtrsToCms18mtemp = sampleConversionProxyid.mtrsToCms(mtrs_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(mtrsToCms18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String name_3id=  request.getParameter("name26");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        java.lang.String sayHello23mtemp = sampleConversionProxyid.sayHello(name_3idTemp);
if(sayHello23mtemp == null){
%>
<%=sayHello23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
case 28:
        gotMethod = true;
        String email_4id=  request.getParameter("email31");
            java.lang.String email_4idTemp = null;
        if(!email_4id.equals("")){
         email_4idTemp  = email_4id;
        }
        String password_5id=  request.getParameter("password33");
            java.lang.String password_5idTemp = null;
        if(!password_5id.equals("")){
         password_5idTemp  = password_5id;
        }
        java.lang.String registerUser28mtemp = sampleConversionProxyid.registerUser(email_4idTemp,password_5idTemp);
if(registerUser28mtemp == null){
%>
<%=registerUser28mtemp %>
<%
}else{
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerUser28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
}
break;
case 35:
        gotMethod = true;
        String dollars_6id=  request.getParameter("dollars38");
        int dollars_6idTemp  = Integer.parseInt(dollars_6id);
        int dollarsToRupees35mtemp = sampleConversionProxyid.dollarsToRupees(dollars_6idTemp);
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(dollarsToRupees35mtemp));
        %>
        <%= tempResultreturnp36 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>