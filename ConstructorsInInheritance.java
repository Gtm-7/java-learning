package com.red_sandel;
class Base1{
    public int x;
    Base1(){
        System.out.println(" Im a constructor of base 1");
    }
    Base1(int x){
        System.out.println("Im a over loaded constructor with integer value: " + x);
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
//        super(0);
        System.out.println("I am the constructor of derived class");
    }
}
public class ConstructorsInInheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        Derived1 d1  = new Derived1();
    }
}
