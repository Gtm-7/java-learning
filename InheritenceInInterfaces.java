package com.red_sandel;
interface sampleInter{
    void meth1();
    void meth2();
}
interface childInterface extends sampleInter{
 void meth3();
 void meth4();
}
class MySampleClass implements childInterface{
    public void meth1(){
        System.out.println("meth-1");
    }
    public void meth2(){
        System.out.println("meth-2");
    }
    public void meth3(){
        System.out.println("meth-3");
    }
    public void meth4(){
        System.out.println("meth-4");
    }
}
public class InheritenceInInterfaces {
    public static void main(String[] args) {
        MySampleClass ms = new MySampleClass();
        ms.meth1();
    }

}
