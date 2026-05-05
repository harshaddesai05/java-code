package com.movie;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

String movie=request.getParameter("movie");

HttpSession session=request.getSession();
session.setAttribute("movie", movie);

PrintWriter out=response.getWriter();

out.println("<html><body style='font-family:Arial;background:#eef2f3;'>");
out.println("<div style='width:400px;margin:100px auto;background:white;padding:30px;border-radius:15px;text-align:center;box-shadow:0 0 10px gray;'>");

out.println("<h1>Select Seat</h1>");

out.println("<form action='SeatServlet' method='post'>");

out.println("<input type='text' name='seat' placeholder='Enter Seat No' style='width:90%;padding:10px;border-radius:8px;'><br><br>");

out.println("<input type='submit' value='Book Ticket' style='width:95%;padding:12px;background:#007bff;color:white;border:none;border-radius:8px;'>");

out.println("</form></div></body></html>");
}
}