<%@ page import="java.sql.*" %>

<%
int roll = Integer.parseInt(request.getParameter("roll"));

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentcruddb",
"root",
"harshad@1205");

PreparedStatement ps = con.prepareStatement(
"select * from student where rollno=?");

ps.setInt(1, roll);

ResultSet rs = ps.executeQuery();
rs.next();
%>

<html>
<head>
<title>Edit Student</title>

<style>
body{
    margin:0;
    font-family:Arial, sans-serif;
    background:linear-gradient(to right,#ffecd2,#fcb69f);
}

.box{
    width:420px;
    margin:70px auto;
    background:white;
    padding:30px;
    border-radius:18px;
    box-shadow:0 8px 25px rgba(0,0,0,0.15);
    text-align:center;
}

h1{
    color:#333;
    margin-bottom:20px;
}

input{
    width:92%;
    padding:12px;
    margin:10px 0;
    border:1px solid #ccc;
    border-radius:10px;
    font-size:15px;
}

input[readonly]{
    background:#f2f2f2;
}

input[type=submit]{
    background:#28a745;
    color:white;
    border:none;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#218838;
}

a{
    display:inline-block;
    margin-top:15px;
    text-decoration:none;
    color:#007bff;
    font-weight:bold;
}
</style>
</head>

<body>

<div class="box">

<h1>Edit Student</h1>

<form action="UpdateServlet" method="post">

<input type="text" name="rollno"
value="<%=rs.getInt(1)%>" readonly>

<input type="text" name="name"
value="<%=rs.getString(2)%>" required>

<input type="text" name="course"
value="<%=rs.getString(3)%>" required>

<input type="text" name="city"
value="<%=rs.getString(4)%>" required>

<input type="submit" value="Update Student">

</form>

<a href="view.jsp">Back to Records</a>

</div>

</body>
</html>