package com.movie;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

String name=request.getParameter("uname");

HttpSession session=request.getSession();
session.setAttribute("user", name);

PrintWriter out=response.getWriter();

out.println("<html><body style='font-family:Arial;background:#f5f7fa;'>");
out.println("<div style='width:400px;margin:100px auto;background:white;padding:30px;border-radius:15px;text-align:center;box-shadow:0 0 10px gray;'>");

out.println("<h1>Welcome "+name+"</h1>");

out.println("<form action='MovieServlet' method='post'>");

out.println("<select name='movie' style='width:90%;padding:10px;border-radius:8px;'>");
out.println("<option>Avengers</option>");
out.println("<option>Pushpa 2</option>");
out.println("<option>KGF 3</option>");
out.println("<option>Animal Park</option>");
out.println("</select><br><br>");

out.println("<input type='submit' value='Next' style='width:95%;padding:12px;background:#28a745;color:white;border:none;border-radius:8px;'>");

out.println("</form></div></body></html>");
}
}