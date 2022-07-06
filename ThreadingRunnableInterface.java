package com.red_sandel;
class RunnableTh implements Runnable{

    public void run() {
        System.out.println("i am a thread-1111111111 not a threat");

    }
}
class RunnableTh2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Im a thread -222222222");

    }
}

public class ThreadingRunnableInterface {
    public static void main(String[] args) {
        RunnableTh bullet1 = new RunnableTh();
        Thread gun1  = new Thread(bullet1);
        RunnableTh2 bullet2 = new RunnableTh2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
        // we cannot use start method in the runnable interface
    }
}
