package com.student;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");

String name=request.getParameter("name");
String course=request.getParameter("course");
String city=request.getParameter("city");

PrintWriter out=response.getWriter();

out.println("<html><body style='font-family:Arial;background:#d4fc79;'>");

out.println("<div style='width:420px;margin:80px auto;background:white;padding:30px;border-radius:15px;text-align:center;box-shadow:0 0 15px gray;'>");

out.println("<h1>Registration Successful</h1>");

out.println("<table border='1' cellpadding='10' style='width:100%;border-collapse:collapse;'>");

out.println("<tr>");
out.println("<th>Name</th>");
out.println("<th>Course</th>");
out.println("<th>City</th>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>"+name+"</td>");
out.println("<td>"+course+"</td>");
out.println("<td>"+city+"</td>");
out.println("</tr>");

out.println("</table>");

out.println("<h2 style='color:green;'>Welcome Student 🎓</h2>");

out.println("</div></body></html>");
}
}