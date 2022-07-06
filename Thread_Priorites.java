package com.red_sandel;
class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i=0;

        while(i<300){
            System.out.println("hello world"+ this.getName());
            i++;
        }
    }
}
public class Thread_Priorites {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("1st");
        Mythr1 t2 = new Mythr1("2nd");
        Mythr1 t3 = new Mythr1("3rd");
        Mythr1 t4 = new Mythr1("4th");
        Mythr1 t5 = new Mythr1("5th(Important)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();



    }
}
