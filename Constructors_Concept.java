package com.red_sandel;
class MyEmployee{
    private int id;
    private String name;
    private int salary;
//    public MyEmployee(){ // <---Constructor
//        id =  303;
//        name = "Your Name Here";
//    }
    public MyEmployee(String Name,int x){ // <---Constructor
    id =  x ;
    name = Name;
}
public MyEmployee(){
        id= 303;
        name=" Gowtham";
}
public MyEmployee(int x,int y){
        salary = y ;
        id = x ;
}
/*
We can overload constructors just like methord overloading
 */


    public void setName(String n){name=n;}
    public void setId(int x){id = x;}
    public int  getId(){return id;}
    public String getName(){return name;}

    public int getSalary() {
        return salary;
    }
}

public class Constructors_Concept {
    public static void main(String[] args) {
    MyEmployee obj1 = new MyEmployee(303,320);
//    obj1.setId(303);
//    obj1.setName("Gowtham");
        System.out.println(obj1.getSalary());
        System.out.println(obj1.getId());
    }
}
