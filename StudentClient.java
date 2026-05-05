package com.RMI_10;

import java.rmi.*;
import java.util.Scanner;

public class StudentClient {

public static void main(String args[])
{
try{

StudentInterface obj=
(StudentInterface)Naming.lookup("rmi://localhost/StudentService");

Scanner sc=new Scanner(System.in);

System.out.print("Enter Roll No: ");
int r=sc.nextInt();
sc.nextLine();

System.out.print("Enter Name: ");
String n=sc.nextLine();

System.out.print("Enter Marks: ");
double m=sc.nextDouble();

Student s=new Student(r,n,m);

String result=obj.calculateGrade(s);

System.out.println("\n----- Result -----");
System.out.println(result);

}catch(Exception e){
System.out.println(e);
}
}
}
