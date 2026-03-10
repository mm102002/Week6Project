package org.example;

import java.util.Scanner;

public class Task4 {
    private static Object system;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int a= input.nextInt();

        System.out.println("Please enter the second number");
        int b= input.nextInt();
        
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
