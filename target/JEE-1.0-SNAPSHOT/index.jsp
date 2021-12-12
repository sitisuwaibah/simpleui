<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style >
        h1{text-align: center;}
        p{text-align: center;}
    </style>
    <title>JSP - Hello World</title>
</head>
<body>
<%@include file="Menu.html"%>


<h1><i><em><%= "HI HELLO BOUNJOUR EVERYONE ! im "+ session.getAttribute("MyName") %></em></i></h1>
<br/>


<i style="text-align: center">
    <li><a href="hello-servlet">Hello Servlet</a></li>
    <li><a href="MyselfServlet">Myself Servlet</a></li>
    <li><a href="MyStudentServlet">MyStudent Servlet</a></li>
    <li><a href="MyFamilyServlet">MyFamily Servlet</a></li>
</i>
</body>
</html>