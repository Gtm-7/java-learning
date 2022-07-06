package com.red_sandel;


abstract class Model{
    abstract void greet();
    abstract void talk();
    public void ta(){
        System.out.println("Hello");
    }
}
class Child extends Model{
    public void greet(){
        System.out.println("Greeting...");

    }
    public void talk(){
        System.out.println("talking...");
    }
}
class Child2 extends Model{

    @Override
    void greet() {
        System.out.println("Greeting Child 2");
    }

    @Override
    void talk() {
        System.out.println("Takling child -2");
    }
}
public class Adstract_classes {
    public static void main(String[] args) {
//        Child2 obj = new Child2();
//        obj.greet();
        Child ch = new Child();
        ch.ta();


    }

}
