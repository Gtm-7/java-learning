package com.red_sandel;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName( String n){
        name = n;
    }

}
class CellPhone{
    public void Ringing(){
        System.out.println("Ringing...");

    }
    public void Vibrating(){
        System.out.println("Vibrating...");

    }
    public void Calling(){
        System.out.println("Calling...");
    }

}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4 * side;
    }
    public void setSide(int x){
        side = x ;
    }
    public int getSide(){
        return side;
    }
}
// problem - 5
class TommyVeccati{
    public void hit(){
        System.out.println("Hitting The enemy..");

    }
    public void run(){
        System.out.println("Running from the enemy..");
    }
    public void fire(){
        System.out.println("Firing the enemy..");
    }
}

public class OOPs_practice_ch8 {
    public static void main(String[] args) {
       /* // problem -1
        Employee gtm = new Employee();
        gtm.setName("Gowtham");
        gtm.salary = 700;
        System.out.println(gtm.getSalary());
        System.out.println(gtm.getName());
        CellPhone asus = new CellPhone();
        // problem - 2
        asus.Calling();
        asus.Ringing();
        asus.Vibrating();*/
        /* problem- 3 create aclass square with a methord to initalize its side
        and calculate area perimeter*
        Square sq =new Square();
        sq.setSide(55);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(sq.getSide());*/
        TommyVeccati p_1 = new TommyVeccati();
        p_1.fire();
        p_1.hit();
        p_1.run();
    }
}
