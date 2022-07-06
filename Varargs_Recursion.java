package com.red_sandel;

public class Varargs_Recursion {
  /*  static int sum(int a, int b){
            return a+b;
    }*/


    /*static int sum(int a, int b,int c) {
        return a + b + c;
    }*/


    /*static int sum1(int ...arr){
        //Avilable as int [] arr;
        int result = 0;
    for(int a :arr) {
        result= result+a;
    }
    return result;
    }*/
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{

            return n* factorial(n-1);
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("2+3"+ sum(2,3));
//        System.out.println("2+3"+ sum(2,3,4));
//        System.out.println("2+3+4+5+78+8 is :" + sum1(2,3,5,78,8));
//        System.out.println(sum1());
        System.out.println("The value of factorial n is:" + factorial(5));

    }
}
