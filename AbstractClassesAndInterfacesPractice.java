package com.red_sandel;
// Problem-1
abstract class Pen{
    abstract void refill();
    abstract void write();
}
// Problem - 2
class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("biting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
// question - 3
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }

    @Override
    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping..");
    }
}
class FountinPen extends Pen{
    public void refill(){
        System.out.println("refill...");
    }
    public void write(){
        System.out.println("Writing...");
    }
    void changeNib(){
        System.out.println("changing nib");
    }
}

public class AbstractClassesAndInterfacesPractice {
    public static void main(String[] args) {

        FountinPen fp = new FountinPen();
//        fp.write();// question - 1
        Human Gtm = new Human();
//        Gtm.sleep();
        // question -5 demonstrate polymorphisim
        Monkey mo = new Human();
        mo.bite();
        BasicAnimal lav = new Human();
        lav.eat();
        lav.sleep();
    }
}
