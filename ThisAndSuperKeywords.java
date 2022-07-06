package com.red_sandel;
class Okaclass{
    int a;
    Okaclass(int a){
        this.a = a;
        System.out.println("This is in OkaClass " + a +" stupid" );
    }

    public int getA() {
        return a;
    }

    public int returnOne(){
        return 1;
    }
}
class RundoClass extends Okaclass{
    RundoClass(int x){
        // child class calls a constructor which does not have any parameters in it
        // by using super key word we can call the custom constructor
        super(x);
        System.out.println("I am Constructor in extended class");
    }
}

public class ThisAndSuperKeywords {
    public static void main(String[] args) {
        Okaclass ok = new Okaclass(58);
//        System.out.println(ok.getA());
        RundoClass ru = new RundoClass(75);
        /*
         super is used to refer the imediate parent
         super is used to invoke a custom constructer with different arguments

         */

    }
}
