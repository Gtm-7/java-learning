package com.red_sandel;

import java.util.Scanner;

class NegativeRadiusError extends Exception{
    public String toString(){
        return "Radius cannot be negitive! :(";
    }
    public String getMessage(){
        return  "Radius cannot be negitive! ---->";
    }
}

public class ThrowAndThrows {
    public static  int divide(int x,int y) throws ArithmeticException{
        return x/y;
    }

    public static double area(int r) throws NegativeRadiusError{
        if (r<0){
            throw new NegativeRadiusError();
        }
        return Math.PI * r *r;
    }

    public static void main(String[] args) {
       int z;
        Scanner sc = new Scanner(System.in);
       int k = sc.nextInt();
        try{
//           z= divide(3,0);
//           System.out.println(z);
          double x = area(k);
           System.out.println(x);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
