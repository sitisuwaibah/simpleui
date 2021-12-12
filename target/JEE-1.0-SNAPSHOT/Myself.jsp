<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/11/2021
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MySelf Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        img {border-radius: 50%;}
    </style>
</head>
<body>

<%@include file="Menu.html"%>
<br>
<img src="deer.JPG" alt="Avatar" style="border-radius: 90%; width:300px; float: right">

<form name="MySelfForm" method="post" action="Myself.jsp">
    <br/>
    <br/>
    Name    : <br/><input type="text" name="myName"><br/>
    Contact : <br/><input type="text" name="myContact"><br/>
    Age     : <br/><input type="text" name="myAge"><br/>
    Hobby   : <br/><input type="text" name="myHobbies"><br/>
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
    String mytext = request.getParameter("myName");
    if(mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyName",request.getParameter("myName"));
        session.setAttribute("MyContact",request.getParameter("myContact"));
        session.setAttribute("MyAge",request.getParameter("myAge"));
        session.setAttribute("MyHobby",request.getParameter("myHobbies"));

        out.println(getMessage());
    }
%>
<h1><i><%= "MY SELF PAGE" %></i></h1>
<div>
<jsp:include page="MyselfServlet"/>
</div>
</body>
</html>
