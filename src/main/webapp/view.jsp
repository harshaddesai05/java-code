<%@ page import="java.sql.*" %>

<html>
<head>
<title>View Students</title>

<style>
body{
    margin:0;
    font-family:Arial, sans-serif;
    background:linear-gradient(to right,#f8ffae,#43c6ac);
}

.container{
    width:90%;
    max-width:1000px;
    margin:40px auto;
    background:white;
    padding:30px;
    border-radius:18px;
    box-shadow:0 8px 25px rgba(0,0,0,0.15);
}

h1{
    text-align:center;
    color:#333;
    margin-bottom:25px;
}

table{
    width:100%;
    border-collapse:collapse;
    overflow:hidden;
    border-radius:12px;
}

th{
    background:#007bff;
    color:white;
    padding:14px;
    font-size:16px;
}

td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid #ddd;
}

tr:nth-child(even){
    background:#f9f9f9;
}

tr:hover{
    background:#eef6ff;
}

.btn{
    padding:8px 14px;
    border-radius:8px;
    text-decoration:none;
    color:white;
    font-size:14px;
    font-weight:bold;
}

.edit{
    background:#28a745;
}

.delete{
    background:#dc3545;
}

.top-btn{
    display:inline-block;
    margin-top:25px;
    padding:12px 18px;
    background:#6f42c1;
    color:white;
    text-decoration:none;
    border-radius:10px;
    font-weight:bold;
}

.top-btn:hover{
    opacity:0.9;
}
</style>
</head>

<body>

<div class="container">

<h1>Student Records</h1>

<table>
<tr>
    <th>Roll No</th>
    <th>Name</th>
    <th>Course</th>
    <th>City</th>
    <th>Edit</th>
    <th>Delete</th>
</tr>

<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentcruddb",
    "root",
    "harshad@1205");

    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from student");

    while(rs.next())
    {
%>

<tr>
    <td><%=rs.getInt(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>

    <td>
        <a class="btn edit" href="edit.jsp?roll=<%=rs.getInt(1)%>">Edit</a>
    </td>

    <td>
        <a class="btn delete"
           href="DeleteServlet?roll=<%=rs.getInt(1)%>"
           onclick="return confirm('Delete this record?');">
           Delete
        </a>
    </td>
</tr>

<%
    }

    con.close();

}catch(Exception e){
    out.println("<tr><td colspan='6'>"+e+"</td></tr>");
}
%>

</table>

<center>
<a href="index.jsp" class="top-btn"> Add New Student</a>
</center>

</div>

</body>
</html>