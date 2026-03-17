package com.exp6;
import java.util.Scanner;

public class TableSquare 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        System.out.println("Square of " + num + " = " + square);

        System.out.println("Multiplication Table:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}