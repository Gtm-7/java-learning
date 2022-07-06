package com.red_sandel;
class Mythr2 extends Thread{
    public void run(){
        int i=0;

        while(i<3000){
            System.out.println("hello world"+ this.getName());
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Mythr3 extends Thread{
    public void run(){
        int i=0;

        while(i<3000){
            System.out.println("You stupid"+ this.getName());
            i++;
        }
    }
}

public class ThreadMethords {
    public static void main(String[] args) {
        Mythr2 t1 = new Mythr2();
        Mythr3 t2 = new Mythr3();
        t1.start();
     /*   try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }*/ // This block of code used to run t1 first and then t2 next

        t2.start();
    }
}
