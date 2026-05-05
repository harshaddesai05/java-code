package com.RMI_10;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class StudentServer extends UnicastRemoteObject implements StudentInterface {

public StudentServer() throws RemoteException { }

public String calculateGrade(Student s) throws RemoteException
{
String grade="Fail";

if(s.marks>=90)
grade="A+";
else if(s.marks>=80)
grade="A";
else if(s.marks>=70)
grade="B";
else if(s.marks>=60)
grade="C";

return "Roll No: "+s.roll+
       "\nName: "+s.name+
       "\nMarks: "+s.marks+
       "\nGrade: "+grade;
}

public static void main(String args[])
{
try{

LocateRegistry.createRegistry(1099);

StudentServer obj=new StudentServer();

Naming.rebind("StudentService", obj);

System.out.println("RMI Server Started...");

}catch(Exception e){
System.out.println(e);
}
}
}
