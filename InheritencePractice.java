package com.red_sandel;
class Circle{
    public double radius;
    Circle( int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        this.height = h;
    }

    public double volume(){
        return Math.PI * this.radius*this.radius*this.height;
    }

}


public class InheritencePractice {
    public static void main(String[] args) {
        // Problem -1 : Cretae a class circle and
        // inheritence to create another class cylinder from it
        Cylinder1 obj = new Cylinder1(5,10);


    }
}
