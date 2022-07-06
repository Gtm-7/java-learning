package com.red_sandel;

public class Practice_Method_Java_Program {
    static void multiplication (int n){
        // program to print multiplication table
        for(int i =1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);

        }
    }
    // 2nd program
    static void pattern1( int n){
     for (int i=0;i<n;i++){
         for(int j=0;j<i+1;j++){
             System.out.print("* *");
         }
         System.out.println("");
     }
    }

    static int sumOfNaturalNum(int n){
// Problem-3:
         int result=0;
         if (n==1){
             return 1 ;
         }
        return n + sumOfNaturalNum(n-1);
    }
    static void pattern2(int m){
        for(int i=0; i<m; i++){
            for (int j=m ; j>i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// problem - 5:
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }

    }
    static void pattern1_rec( int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i = 0;i<n;i++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        //problem - 1
      //  multiplication(7);
//        problem-2 pattern
//        pattern1(6);
// Problem -3 write a recursive function to calculate the sum of first n natural numbers
//        int x=sumOfNaturalNum(75);
//        System.out.println(x);
// problem:4 pattern -2
//        pattern2(5);
// Problem -5 : find End Term Of Fibonacchi series:
//       int x = fib(5);
//        System.out.println(x);
// Problem -6 write a function to find the average of set of numbers passed as arguments
// Problem - 8 : write patten -1 in recursion
            pattern1_rec(5);

    }
}
