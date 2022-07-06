package com.red_sandel;

import java.util.Scanner;

class MyException extends Exception {
    public String toString(){
        return  super.toString() + "iam tostring";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am get message";
    }
}
public class ExceptionClassInJava {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
