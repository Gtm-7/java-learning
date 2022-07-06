package com.red_sandel;
import java.util.Scanner;
public class MarksForCBSC {
    public static void main(String[] args){
        System.out.println("CBSC percentage calculator");
        Scanner scr = new Scanner(System.in);
        float Total = 500f;
        System.out.println("Enter the marks of first subject");
        float a = scr.nextInt();
        System.out.println("Enter the marks of 2nd subject");
        float b = scr.nextFloat();
        System.out.println("Enter the marks of 3rd subject");
        float c = scr.nextFloat();
        System.out.println("Enter the marks of 4th subject");
        float d = scr.nextFloat();
        System.out.println("Enter the marks of 5th subject");
        float e = scr.nextFloat();
        float f;
        f=((a+b+c+d+e)/Total)*100;
        System.out.println(f);
    }
}
