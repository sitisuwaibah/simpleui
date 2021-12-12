package com.example.jee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyVehicleServlet", value = "/MyVehicleServlet")
public class MyVehicleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        final String MyVehicleType = "Car";
        final String MyVehicleBrand = "Proton Saga";
        final String MyVehicleID = "ALP 2340";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
