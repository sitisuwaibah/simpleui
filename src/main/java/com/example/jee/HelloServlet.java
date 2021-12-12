package com.example.jee;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init()
    {
        message = "<b>"+"<br>"+" Hye! My Name is Suwaibah"+"</b>";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<body style='background-color:#faebd7;'>");

        out.println("<html><body>");
        for(int i =0; i<10; i++)
        {
            out.println( message + "<br>");
        }
        out.println("</body></html>");
    }
    public void destroy()
    {}
}