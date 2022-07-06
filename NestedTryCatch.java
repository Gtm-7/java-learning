package com.red_sandel;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 75;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to the boss room");
                try {
                    System.out.println("Printing .." + marks[ind]);
                    flag =false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" Array index out of range");
                    System.out.println(" level -2 error");
                }
            } catch (Exception e) {
                System.out.println("Exception at level 1");
            }
        }
    }
}
