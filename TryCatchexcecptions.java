package com.red_sandel;

import java.util.Scanner;

public class TryCatchexcecptions {
    public static void main(String[] args) {
      /*  int a = 250,b = 10;
        try {
            int c = a/b;
            System.out.println(c*2);
        }
        catch(Exception e){
            System.out.println("We failed to divide reason is: " + e);
        }
        System.out.println("End of the program");
*/
        int marks [] = new int[3];
        marks [0] = 7;
        marks [1] = 56;
        marks [2] = 75;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array index number");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide with:");
        int number = sc.nextInt();
        try{
            System.out.println("the value of the array at index entered is "+ marks[ind]);
            System.out.println("Array value /number is :" + marks[ind]/number);

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);

        }
        catch (Exception e){
            System.out.println("Some other exception occured");
        }

    }
}
