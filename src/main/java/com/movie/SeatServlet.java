package com.movie;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SeatServlet")
public class SeatServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

String seat=request.getParameter("seat");

HttpSession session=request.getSession();

String user=(String)session.getAttribute("user");
String movie=(String)session.getAttribute("movie");

session.setAttribute("seat", seat);

try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/moviedb",
"root",
"harshad@1205");

PreparedStatement ps=con.prepareStatement(
"insert into booking(username,movie,seat) values(?,?,?)");

ps.setString(1,user);
ps.setString(2,movie);
ps.setString(3,seat);

ps.executeUpdate();

con.close();

}catch(Exception e){}

response.sendRedirect("TicketServlet");
}
}