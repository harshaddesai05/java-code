<%@ page language="java" %>
<html>
<head>
<title>Student CRUD</title>

<style>
body{
margin:0;
font-family:Arial;
background:linear-gradient(to right,#74ebd5,#ACB6E5);
}

.box{
width:400px;
margin:70px auto;
background:white;
padding:30px;
border-radius:15px;
box-shadow:0 0 15px gray;
text-align:center;
}

input{
width:90%;
padding:10px;
margin:10px;
border-radius:8px;
border:1px solid #ccc;
}

input[type=submit]{
background:#28a745;
color:white;
border:none;
font-size:16px;
cursor:pointer;
}

input[type=submit]:hover{
background:#218838;
}

a{
text-decoration:none;
font-weight:bold;
color:#007bff;
}
</style>
</head>

<body>

<div class="box">

<h1> Add Student</h1>

<form action="StudentServlet" method="post">

<input type="text" name="rollno" placeholder="Roll No" required>
<input type="text" name="name" placeholder="Name" required>
<input type="text" name="course" placeholder="Course" required>
<input type="text" name="city" placeholder="City" required>

<input type="submit" value="Save Student">

</form>

<br>

<a href="view.jsp"> View Students</a>

</div>

</body>
</html>