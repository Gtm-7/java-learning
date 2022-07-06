package com.red_sandel;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("hello world");
        while(i<300){
            System.out.println("Nenu okd daram");
            i++;
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        Mythr mt = new Mythr("daram");
        mt.start();
        System.out.println("id of thread is :" + mt.getId());
        System.out.println("Namer of the thread is :"+ mt.getName());
    }
}
