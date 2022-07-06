package com.red_sandel;

public class FinallyBlock {
    public static int greet(){
        try{
            int a =5;
            int b = 5;
            int c =a/b;
            return c;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of this function");
        }
        return 0;

    }
    public static void main(String[] args) {
        try{
            int a =5;
            int b = 0;
            int c =a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of this program");
        }
        int greet = greet();
        System.out.println(greet+5);
    }
}
