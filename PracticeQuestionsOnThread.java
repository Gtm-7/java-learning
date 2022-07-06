package com.red_sandel;
class GThread extends Thread {
    public void run() {
        int i=0;
        while (i<2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning");
            i++;
        }

    }
}
class WThread extends Thread {
    public void run() {
        int i=0;
        while (i<2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome to the club");
            i++;
        }
    }
}
public class PracticeQuestionsOnThread
{
    public static void main(String[] args) {
        GThread gm = new GThread();
        WThread wc = new WThread();
        gm.setPriority(Thread.NORM_PRIORITY);
        wc.setPriority(Thread.MIN_PRIORITY);
        gm.start();
        wc.start();
        System.out.println(wc.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
