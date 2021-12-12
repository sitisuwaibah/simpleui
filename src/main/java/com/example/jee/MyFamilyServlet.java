package com.example.jee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFamilyServlet", value = "/MyFamilyServlet")
public class MyFamilyServlet extends HttpServlet {
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
        String mydad = (String) session.getAttribute("MyDad");
        String mymom = (String) session.getAttribute("MyMom");
        String mysiblings = (String) session.getAttribute("MySiblings");

        MyFamily myfamily = new MyFamily(myname,mycontact,myage,myhobbies,mydad,mymom,mysiblings);
//        MyFamily myfamily = new MyFamily("Siti Suwaibah binti Mohamad", "sitisuwaibah270@gmail.com", "21", "watch movie",
//                "2021132257", "CS266", "4","2021/20222","UiTM Jasin Campus Melaka",
//                "Mohamad bin Awang","Saripah binti Mohamad","7");

        out.println("<html><body>");
        out.println("<h1>" + "MY FAMILY "+ "</h1>");
        out.println("<h2>" + "Dad's Name        : " + myfamily.getMyDad()+ "</h2>");
        out.println("<h2>" + "Mom's Name        : " + myfamily.getMyMom()+ "</h2>");
        out.println("<h2>" + "Number Of Siblings: " + myfamily.getMySiblings()+ "</h1>");
        out.println("<h2>"+"</h2>");
//        out.println(myfamily.PrintInfo());
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
