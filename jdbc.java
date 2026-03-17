package com.exp4;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class jdbc {

	    public static void main(String[] args) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/deptdb",
	                    "root",
	                    "harshad@1205");   

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery("SELECT * FROM department");

	            while (rs.next()) {

	                System.out.println("ID: " + rs.getInt("id"));
	                System.out.println("Student Name: " + rs.getString("stdname"));
	                System.out.println("Department Name: " + rs.getString("deptname"));
	                System.out.println("----------------------");
	            }
	            
	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

