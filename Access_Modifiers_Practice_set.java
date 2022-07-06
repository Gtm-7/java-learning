package com.red_sandel;
class Cylinder{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius +(2*Math.PI * radius * height);
    }
    public double volume(){
        double v = Math.PI * radius * radius * height;
        return v;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth =b;
    }

    public Rectangle() {
        this.length = 5;
        this.breadth = 4;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

public class Access_Modifiers_Practice_set {
    public static void main(String[] args) {
        // problem - 1 : Create a class cylinder and use getters and setters to set its radius and height
        Cylinder mycylinder = new Cylinder(9,12);
/*
        mycylinder.setHeight(12);
        mycylinder.setRadius(5);


        double height = mycylinder.getHeight();
        double radius = mycylinder.getRadius();
        System.out.println(height+ " "+ radius);
 Problem 2 : use 1 to calculate surface area and volume of the cylinder
*/
//        System.out.println(mycylinder.surfaceArea());
//        System.out.println(mycylinder.volume());
//  Problem : 4 - over load a constructer used to initilize a rextangle of length 4 and breadth 5
//  for using custom parameters
        Rectangle r = new Rectangle();
        System.out.println(r.getBreadth() + r.getLength());




    }
}
