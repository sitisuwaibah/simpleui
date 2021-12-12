package com.example.jee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "MyStudentServlet", value = "/MyStudentServlet")
public class MyStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<body style='background-color:#faebd7; '>");


        HttpSession session = request.getSession();
        String myname = (String) session.getAttribute("MyName");
        String mycontact = (String) session.getAttribute("MyContact");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobby");
        String mymatricno = (String) session.getAttribute("MyMatricNo");
        String myprogramcode = (String) session.getAttribute("MyProgramCode");
        String mypart = (String) session.getAttribute("MyPart");
//        int mypart = (int) session.getAttribute("MyPart");
//        int mypart = Integer.parseInt((String) session.getAttribute("MyPart"));
        String mycampus = (String) session.getAttribute("MyCampus");
        String intake = (String) session.getAttribute("Intake");
        String myVehicleType = (String) session.getAttribute("MyVehicleType");
        String myVehicleBrand = (String) session.getAttribute("MyVehicleBrand");
        String vehicleID = (String) session.getAttribute("VehicleID");



//        MyStudent myStudent= new MyStudent("Siti Suwaibah binti Mohamad", "sitisuwaibah270@gmail.com", "21", "Watch movies",
//                "2021132257", "CS266", 4,"2021/20222","UiTM Jasin Campus Melaka");
        MyStudent myStudent = new MyStudent(myname,mycontact,myage,myhobbies,mymatricno,myprogramcode,mypart,mycampus,intake);

        out.println("<html><body>");
        out.println("<h1>" + "MY STUDENT"+ "</h1>");
        out.println("<h2>" + "Matric Number  : " + myStudent.getMyMatricNo()+ "</h2>");
        out.println("<h2>" + "Programme Code : " + myStudent.getMyProgramCode()+ "</h2>");
        out.println("<h2>" + "Part           : " + myStudent.getMyPart()+ "</h2>");
        out.println("<h2>" + "Campus         : " + myStudent.getMyCampus()+ "</h2>");
        out.println("<h2>" + "Intake         : " + myStudent.getIntake()+ "</h2>");
        out.println("<h2>"+"</h2>");
        out.println(myStudent.PrintInfo());
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
