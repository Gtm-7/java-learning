package com.red_sandel;

import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 1st program
        /* print ****
         ***
         **
         *
         */
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//
        // 2nd problem find sum of first n even numbers using while loop
       /* int n , sum=0;

        n = sc.nextInt();
        for(int i=0;i<n;i++){
                sum=sum+2*(i);

        }
        System.out.println(sum);*/
        //proble:3 write a program to give multiplication table for given number n
       /* int n= sc.nextInt();
        for ( int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }*/
//        Problem:4 write a program to give reverse multiplication
/*        int n= sc.nextInt();
        for ( int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }*/
//  problem-6: Find the factorial of a num using while loop
 /*       int n= sc.nextInt();
        int i=1,factorial=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);*/
//        problem:5 Find factorial by using for loop
/*        int n= sc.nextInt();
        int fact=1;
        for(int i=n;i>1;i--){
            fact=fact*i;
        }
        System.out.println(fact);*/
//PROBLEM:9 Find the sum of multiples of 8
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            sum=sum+n*i;

        }
        System.out.println(sum);

    }
}

