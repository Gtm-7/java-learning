package com.red_sandel;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

    public class DynamicMethordDispatch {
        public static void main(String[] args) {
            // Phone obj = new Phone(); // Allowed
            // SmartPhone smobj = new SmartPhone(); // Allowed
            // obj.name();

            Phone obj = new SmartPhone(); // Yes it is allowed
            // SmartPhone obj2 = new Phone(); // Not allowed
// In dynamic methord dispatch it only runs the methords in super class and the over ridden methords in both classes

            obj.showTime();
            obj.on();
            // obj.music(); Not Allowed
        }
    }

