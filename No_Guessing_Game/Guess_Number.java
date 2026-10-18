/*
  Project: Number Guessing Game
  Description: A console-based game in which the user
  guesses a randomly generated number between 1 and 100.
  The program provides hints to help the user guess correctly.
  Concepts Used: Scanner, Random, do-while loop, if-else.
 */
 
import java.util.Scanner;
public class Guess_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int random=(int)(Math.random()*100)+1;
        //System.out.println(random);
        System.out.print("Guess the number(between 1-100):");
        //int guess=input.nextInt();
        int count=0;
        int guess;
        do{
            guess=input.nextInt();
            if(guess>random){
                System.out.print("Guess lower Number:");
            }else if(guess<random){
                System.out.print("Guess higher Number:");
            }else{
                System.out.print("Congrats you guessed correct number.");
            }
            count++;
        }while(guess!=random);
        System.out.println();
        System.out.println("Total number of guess are "+count);
    }
}
