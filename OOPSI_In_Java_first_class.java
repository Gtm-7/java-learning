package com.red_sandel;
class Employee1{
        int id;
        String name;
        int salary = 4;
        public void getDetails(){
            System.out.println(" Hi , My name is " +name+ "" +

                    " and my id is " + id );
        }
        public int getSalary(){
            return salary;
        }
        }
public class OOPSI_In_Java_first_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee1 go= new Employee1();
        Employee1 jo = new Employee1();
        // setting attributes;

        go.id = 303;
        go.name = "Gowtham";
        jo.id = 320;
        jo.name = "Uday kumar";
        // printing attributes
        go.getDetails();

        int x =  go.getSalary();
        System.out.println("Salary is" + x );
        jo.getDetails();
        int y = jo.getSalary();
        System.out.println("Salary is" + y );


    }
}
