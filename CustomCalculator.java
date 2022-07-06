package com.red_sandel;

import java.util.Scanner;

class InputMismatchException extends Exception{
    public String toString(){
//        System.out.println();
        return "Invalid input ";
    }
    public String getMessage(){
        return " Give valid input like integer<700000";
    }
}
class ZeroDivisionException extends Exception{
    public String toString(){
        return "Denominator is zero";
    }
    public String getMessage(){
        return " Give valid input like integer<700000";
    }

}
class MaxInputException extends Exception{
    public String toString(){
//        System.out.println();
        return "Given number is greater than 700000";
    }
    public String getMessage(){
        return " Give valid input like integer<700000 ";
    }
}
class MaxMultiplierException extends Exception{
    public String toString(){
//        System.out.println();
        return "Given number is greater than 7000";
    }
    public String getMessage(){
        return " Give valid input like integer<7000";
    }

}

class Calculate{

    public boolean isValid(double x){
        /*
        checks if the input is greater than 700000
         */
        if (x>700000){
            return false;
        }
        else{
            return true;
        }
    }

    public double add(double a,double b) throws MaxInputException,InputMismatchException{
        if ((a==8)||(b==9)){
            throw new InputMismatchException();
        }
        else if (isValid(a)&&isValid(b)){
            return a+b;
        }
        else {
            throw new MaxInputException();
        }
    }
    public double  subtract(double a,double b) throws MaxInputException,InputMismatchException{
        if ((a==8)||(b==9)){
            throw new InputMismatchException();
        }
        else if (isValid(a) && isValid(b)){
            return a-b;
        }
        else if ((a==8)||(b==9)){
            throw new InputMismatchException();
        }
        else{
            throw new MaxInputException();
        }
    }
    public double multiply(double a,double b) throws MaxInputException,MaxMultiplierException,InputMismatchException{
        if ((a==8)||(b==9)){
            throw new InputMismatchException();
        }
        else if (a > 700000 || b > 700000)
        {
            throw new MaxInputException();
//            throw new MaxMultiplierException();
        }
        else if ((a>7000 || b>7000)&&((a<700000)&&(b<70000))){
            throw new MaxMultiplierException();
        }
        else if ((a==8)||(b==9)){
            throw new InputMismatchException();
        }
        else{
            return a*b;
        }


   }
   public double divise(double x,double y) throws MaxInputException,ZeroDivisionException,InputMismatchException{
       if ((x==8)||(y==9)){
           throw new InputMismatchException();
       }
        else if((isValid(x)&&isValid(y))&&(y!=0)){
            return x/y;
        }
        else if((x>70000)||(y>700000)){
            throw new MaxInputException();
        }
        else if ((x==8)||(y==9)){
            throw new InputMismatchException();
        }
        else if(y==0){
            throw new ZeroDivisionException();
        }

       return 0;
   }

}

public class CustomCalculator {
    public static void main(String[] args) throws InputMismatchException {
        /*
        Excercise -6 You have to create a custom clalculator which throws rhe following exceptions
        and following operations
        1. addition
        2. subtraction
        3. multiplication
        4. division
        Exceptions are :
        1. invalid input ex: 8&4
        2. cannot divide by zero
        3. Max input Exception : if any of the inputs greater 1000000
        4. Max Multiplier reached Exception: Don't allow any Multiplication greater than 7000
         */
        double var1,var2;
        Scanner sc =new Scanner(System.in);
        Calculate calc = new Calculate();
        System.out.println(" Enter varible 1 and varible 2: ");
        int swi;
        System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division\n");
        System.out.println("enter Switch option: ");
        swi =sc.nextInt();
        System.out.println("Enter varible var1");
            var1 = sc.nextDouble();
        System.out.println("Enter varible var1");
            var2 = sc.nextDouble();



        switch (swi){
            case 1:
                try{
                    System.out.println(calc.add(var1,var2));
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
            case 2:
                try{
                    System.out.println(calc.subtract(var1,var2));
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
            case 3:
                try{
                    System.out.println(calc.multiply(var1,var2));
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
            case 4:
                try{
                    System.out.println(calc.divise(var1,var2));
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + swi);
        }
    }
}
