package com.red_sandel;

import java.util.Scanner;
public class EnteringFirstInput {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        int b = (a)*2;
        System.out.println(b);

    }
}

