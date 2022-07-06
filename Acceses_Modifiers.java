package com.red_sandel;
class MyEmp{ // private key word
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public void setId(int x){
        id = x;
    }
    public int  getId(){
        return id;

    }
    public String getName(){
        return name;
    }

}
public class Acceses_Modifiers {
    public static void main(String[] args) {
     MyEmp obj1 = new MyEmp();
//     obj.id = 303; ---> throws error
        obj1.setName("Gowtham");
       String x = obj1.getName();
        System.out.println(x);
        obj1.setId(303);
        System.out.println(obj1.getId());
    }
}
