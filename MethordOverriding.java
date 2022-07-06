package com.red_sandel;
class A{
    public int gtm(){
        return 5;
    }
    public void meth2(){
        System.out.println("Im methord 2 of Class A");
    }

}
class B extends A{
    public void meth3(){
        System.out.println("Im methord 3 of Class B");

    }
    @Override // no need to
    public void meth2(){
        System.out.println("Im methord 2 of Class B");
    }

}
public class MethordOverriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();
    B b =new B();
    b.meth2();
    }
}
