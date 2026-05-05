package com.student;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

protected void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentcruddb",
"root",
"harshad@1205");

PreparedStatement ps=con.prepareStatement(
"delete from student where rollno=?");

ps.setInt(1,Integer.parseInt(request.getParameter("roll")));

ps.executeUpdate();

response.sendRedirect("view.jsp");

}catch(Exception e){
System.out.println(e);
}
}
}