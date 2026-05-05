package com.student;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

String name=request.getParameter("name");
String course=request.getParameter("course");
String city=request.getParameter("city");

if(name.equals("") || course.equals("") || city.equals(""))
{
PrintWriter out=response.getWriter();
out.println("<h2>All Fields Required</h2>");
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
rd.forward(request,response);
}

}
}