package com.red_sandel;
import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number-1:");
        int a= s.nextInt();
        System.out.println("Enter Number-2");
        int b=s.nextInt();
        int Sum=a+b;
        System.out.println("Sum of numbers is");
        System.out.println(Sum);
    }
}
