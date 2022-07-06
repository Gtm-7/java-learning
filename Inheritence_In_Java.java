package com.red_sandel;
class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" Settting x now in base");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritence_In_Java {
    public static void main(String[] args) {
        Base ba = new Base();
        ba.setX(6);
        System.out.println(ba.getX());

        // Derived is child class
        Derived b = new Derived();
        b.setY(5);
        System.out.println(b.getY());

    }
}
