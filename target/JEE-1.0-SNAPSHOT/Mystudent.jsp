<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/11/2021
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyStudent Page</title>
    <style>

    </style>
</head>
<body>
<%@include file="Menu.html"%>
<br>
<img src="stackbook.gif" alt="Avatar" style="border-radius: 90%; width:300px; float: right">
<form name="MyStudentForm" method="post" action="Mystudent.jsp">
    <br/>
    <br/>
    Matrix Number : <br/><input type="text" name="myMatricNo"><br/>
    Programme Code: <br/><input type="text" name="myrogramCode"><br/>
    Part          : <br/><input type="text" name="myPart"><br/>
    Campus        : <br/><input type="text" name="myCampus"><br/>
    Intake        : <br/><input type="text" name="Intake"><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! String getMessage()
{
    return "Session Created";
}
%>

<%
    String mytext = request.getParameter("myMatricNo");
    if(mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyName",request.getParameter("myName"));
        session.setAttribute("MyMatricNo",request.getParameter("myMatricNo"));
        session.setAttribute("MyProgramCode",request.getParameter("myrogramCode"));
        session.setAttribute("MyPart",request.getParameter("myPart"));
        session.setAttribute("MyCampus",request.getParameter("myCampus"));
        session.setAttribute("Intake",request.getParameter("Intake"));



        out.println("Session Created!");
    }
%>
<h1><i><%= "MY STUDENT PAGE" %></i></h1>
<div>
<jsp:include page="MyStudentServlet"/>
</div>
</body>
</html>
