package com.movie;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/TicketServlet")
public class TicketServlet extends HttpServlet {

protected void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

HttpSession session=request.getSession(false);

String user=(String)session.getAttribute("user");
String movie=(String)session.getAttribute("movie");
String seat=(String)session.getAttribute("seat");

PrintWriter out=response.getWriter();

out.println("<html><body style='font-family:Arial;background:#d4fc79;'>");

out.println("<div style='width:420px;margin:80px auto;background:white;padding:30px;border-radius:15px;text-align:center;box-shadow:0 0 15px gray;'>");

out.println("<h1> Ticket Confirmed</h1>");

out.println("<table border='1' cellpadding='10' style='width:100%;border-collapse:collapse;'>");

out.println("<tr>");
out.println("<th>Name</th>");
out.println("<th>Movie</th>");
out.println("<th>Seat</th>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>"+user+"</td>");
out.println("<td>"+movie+"</td>");
out.println("<td>"+seat+"</td>");
out.println("</tr>");

out.println("</table>");

out.println("<h2 style='color:green;'>Enjoy Your Movie </h2>");

out.println("</div></body></html>");
}
}