package com.red_sandel;
import java.util.Scanner;
import java.util.Random;
class Gen_Rand{
   private int  rand_genv;
    int timesGuessed = 0;
    public Gen_Rand(){
        Random rand = new Random();
        int upper_bound = 100;
        int random_gen_number = rand.nextInt(upper_bound);
        rand_genv = random_gen_number;
    }

    public int getRandomNum(){
        return rand_genv;
    }

    public Boolean isCorrectNumber(int x){
        if(x == rand_genv){
          return true;
        }
        else {
            return false;
        }
    }
    public void setNumberOfGuesses(){
        timesGuessed = timesGuessed+1;
    }
    public int getNumberOfGuesses(){
        return timesGuessed;
    }
}

public class Excercise_3GuessTheNumber {
    /* create a class game , which allows a user to play " Guess The Number "
    game once
     Game contains
     1. constructor to generate the random number
     2. com.red_sandel.EnteringFirstInput user Input() to com.red_sandel.EnteringFirstInput  a user input number
     3. isCorrectNumber() to detect weather the number entered by user is true
     4. getters and setters for no of  guesses
     */
    public static void main(String[] args) {
        int input_num;
        Scanner sc = new Scanner(System.in);
        Gen_Rand obj1 = new Gen_Rand();
        int computer_genrated = obj1.getRandomNum();
//        System.out.println(computer_genrated);
        while (true){
            System.out.print("enter the computer generated number(your guess): ");
            input_num = sc.nextInt();
            if(obj1.isCorrectNumber(input_num)){
                System.out.println("You Guessed Correct and you taken " + obj1.getNumberOfGuesses()+"times");
                break;
            }
            else {
                if(input_num>computer_genrated){
                    System.out.println(" You guessed number is Too big(Try to small the number StUpId");
                    obj1.setNumberOfGuesses();
                }
                else if( input_num<computer_genrated){
                    System.out.println("You guessed number is too small(Try to increase The Number sTuPiD)");
                    obj1.setNumberOfGuesses();
                }
            }
        }

    }

}
