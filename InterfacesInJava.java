package com.red_sandel;
interface Bicycle{
    int a = 52;
    void applyBrake(int decreament);
    void speedUp(int increament);
}
interface HornBicycle{
    int b = 52;
    void blowHorn1();
    void blowHorn2();

}
class AvonCycle implements Bicycle,HornBicycle{
    public void blowHorn(){
        System.out.println(" Pee peep dreeer");
    }
    public void applyBrake(int decreament){
        System.out.println(" Appling Brake");
    }
    public void speedUp(int increament){
        System.out.println("Speeding Up");
    }
    public void blowHorn1(){
        System.out.println("I am groot");
    }
    public void blowHorn2(){
        System.out.println("I am inevitable");
    }
}
public class InterfacesInJava {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.applyBrake(5);
        // you can create properties in Interfaces
        System.out.println(c.a);
//        The parameters in interfaces is final ,That means we cannot change
        c.blowHorn1();
        c.blowHorn2();
//        Multiple inheritance is not allowed in java

    }

}