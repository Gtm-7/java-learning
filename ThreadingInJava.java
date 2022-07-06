package com.red_sandel;
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<1000) {
            System.out.println("My thread-1 is running\nIam Happy ");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread-2 is for chatting people");
            i++;
        }
    }
}
public class ThreadingInJava {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
