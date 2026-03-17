package com.exp2;
import java.util.*;

class Student 
{
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() 
    {
        return rollNo + " " + name + " " + marks;
    }
}

class SortByMarks implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return Double.compare(s2.marks, s1.marks);
    }
}

public class studentrecords
{
	 public static void main(String[] args)
	 {

	        ArrayList<Student> list = new ArrayList<>();
	        list.add(new Student(11, "Harshad", 91));
	        list.add(new Student(15, "Ashish", 86));
	        list.add(new Student(58, "Vivek", 82));
	        list.add(new Student(53, "Anmol", 85));

	        System.out.println("Student Records:");
	        for (Student s : list)
	        {
	            System.out.println(s);
	        }
	        Collections.sort(list, new SortByMarks());

	        System.out.println("\nStudents Sorted by Marks:");
	        for (Student s : list)
	        {
	            System.out.println(s);
	        }
	    }
}
