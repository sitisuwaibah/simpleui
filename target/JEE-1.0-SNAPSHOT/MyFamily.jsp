<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/11/2021
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>My Family Page</title>
    <style>
    </style>
</head>

    <body>
<%@include file="Menu.html"%>
<form name="MyFamilyForm" method="post" action="MyFamily.jsp">
    <br/>
    <br/>
    Dad's Name: <br/><input type="text" name="myDad"><br/>
    Mom's Name: <br/><input type="text" name="myMom"><br/>
    Number of Siblings: <br/><input type="text" name="mySiblings"><br/>
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
    String mytext = request.getParameter("myDad");
    if(mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyDad",request.getParameter("myDad"));
        session.setAttribute("MyMom",request.getParameter("myMom"));
        session.setAttribute("MySiblings",request.getParameter("mySiblings"));

        out.println("Session Created !");
    }
%>
<h1><i><%= "MY FAMILY PAGE" %></i></h1>
<div>
<jsp:include page="MyFamilyServlet"/>
</div>
</body>
</html>
