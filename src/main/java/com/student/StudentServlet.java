<<<<<<< HEAD
package com.student;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
=======
	package com.student;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.sql.*;
>>>>>>> 35a48c6688d3f6f88c8f5c0ded1028a12cb2a341

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

<<<<<<< HEAD
protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentcruddb",
"root",
"harshad@1205");

PreparedStatement ps=con.prepareStatement(
"insert into student values(?,?,?,?)");

ps.setInt(1,Integer.parseInt(request.getParameter("rollno")));
ps.setString(2,request.getParameter("name"));
ps.setString(3,request.getParameter("course"));
ps.setString(4,request.getParameter("city"));

ps.executeUpdate();

response.sendRedirect("view.jsp");

}catch(Exception e){
System.out.println(e);
}
}
=======
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String roll = request.getParameter("rollno");
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String city = request.getParameter("city");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "harshad@1205");

            PreparedStatement ps = con.prepareStatement(
                    "insert into student values(?,?,?,?)");

            ps.setInt(1, Integer.parseInt(roll));
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setString(4, city);

            int i = ps.executeUpdate();

            out.println("<html>");
            out.println("<body bgcolor='lightyellow'>");
            out.println("<center>");

            out.println("<h1>Student Information System</h1>");

            if(i>0)
                out.println("<h2 style='color:green;'>Record Saved Successfully</h2>");
            else
                out.println("<h2 style='color:red;'>Record Not Saved</h2>");

            out.println("<table border='1' cellpadding='10'>");

            out.println("<tr>");
            out.println("<th>Roll No</th>");
            out.println("<th>Name</th>");
            out.println("<th>Course</th>");
            out.println("<th>City</th>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>" + roll + "</td>");
            out.println("<td>" + name + "</td>");
            out.println("<td>" + course + "</td>");
            out.println("<td>" + city + "</td>");
            out.println("</tr>");

            out.println("</table>");

            out.println("<br><a href='index.html'>Add New Student</a>");

            out.println("</center>");
            out.println("</body>");
            out.println("</html>");

            con.close();

        } catch(Exception e) {
            out.println(e);
        }
    }
>>>>>>> 35a48c6688d3f6f88c8f5c0ded1028a12cb2a341
}