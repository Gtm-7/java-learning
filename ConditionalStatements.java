package com.red_sandel;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
//    byte m1,m2,m3;
//    Scanner sc =new Scanner(System.in);
//    System.out.println("Emter marks in physics");
//    m1 =sc.nextByte();
//    System.out.println("enter marks in chemistry");
//    m2 = sc.nextByte();
//    System.out.println("enter marks in maths");
//    m3=sc.nextByte();
//    float avg = (m1+m2+m3)/3.0f;
//    if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//        System.out.println("you are passed"+avg);
//    }
//    else{
//        System.out.println("you are failed");
//    }
    Scanner sc =new Scanner(System.in);
        System.out.println("enter your yearly salary in lakhs (Ex:3.5)");

    float tax=0;
    float income = sc.nextFloat();
    if (income<2.5f){
        tax=tax+0;
    }
   else if (income>2.5f && income<5.0f){
       tax= tax + 0.05f*(income-2.5f);
    }
   else if (income>5f && income<10f){
        tax= tax+0.05f*(2.5f);
        tax=tax+0.2f*(income-5f);
    }
   else if(income>10.0f){
       tax=tax+0.05f*(2.5f);
       tax=tax+0.2f*(10f-5f);
       tax=tax+0.3f*(income-10.0f);
    }
        System.out.println(tax);


    }
}
