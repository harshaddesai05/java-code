package com.RMI_10;

import java.io.Serializable;

public class Student implements Serializable {

int roll;
String name;
double marks;

public Student(int roll,String name,double marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;
}
}
