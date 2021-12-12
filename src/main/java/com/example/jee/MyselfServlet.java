package com.example.jee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyselfServlet", value = "/MyselfServlet")
public class MyselfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<body style='background-color:#faebd7;'>");

        HttpSession session = request.getSession();
        String myname = (String) session.getAttribute("MyName");
        String mycontact = (String) session.getAttribute("MyContact");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobby");


//        Myself myself =  new Myself( "Siti Suwaibah binti Mohamad", "sitisuwaibah270@gmail.com", "21", "watch movie");
        Myself myself = new Myself(myname, mycontact,myage, myhobbies);

        out.println("<html><body>");
        out.println("<h1>" + "MY SELF"+ "</h1>");
        out.println("<h2>" + "Name    : " + myself.getMyName()+ "</h2>");
        out.println("<h2>" + "Contact : " + myself.getMyContact()+ "</h2>");
        out.println("<h2>" + "Age     : "+ myself.getMyAge()+ "</h2>");
        out.println("<h2>" + "Hobby   : " +myself.getMyHobbies()+ "</h2>");
        out.println("<h2>"+"</h2>");
//        out.println(myself.PrintInfo());
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
