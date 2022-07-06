package com.red_sandel;

public class Methods_In_Java {
    static  void foo(){
        System.out.println("Good Morning");

    }
    static void foo( String a,int b){
        System.out.println("Good morning " + a +" Bro" + b + " times");
    }
    public static void main(String[] args) {
    foo();
    foo("Harry",3000);
    // Arguments are actual
/*
over loading cannot be done by changing return type it can be done by
changing parameters or arguuments
 */

    }
}
