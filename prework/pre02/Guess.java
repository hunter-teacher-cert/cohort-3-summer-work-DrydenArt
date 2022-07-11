import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args){
    //pick a random number - this activity is on page 47 exercise 3.4 Guess My Number//
    int line;
    int difference;
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    
  

    System.out.println("I'm thinking of a number between 1 and 100 (including both). \nCan you guess what it is? \nType a number: ");
    line = input.nextInt();
    System.out.println("Your guess is: " + line);
    System.out.print("The number I was thinking of is: ");
    System.out.println(number);
    difference = Math.abs(line - number);
    System.out.println("You were off by: " + difference);

    //difference2 = number - line;

    //if (line > number) System.out.printf("You were off by: " + difference1);
    //else System.out.printf("You were off by: " + difference2);
    

    //I can't figure out how to tell it to read which ever number (the guess or the generated number) is higher before figuring out the difference. Currently, if the line is smaller than the number, it creates a negative integer.//

    //okay, I figured it out by reading Flip.java here: https://introcs.cs.princeton.edu/java/13flow/Flip.java.html and reading through this resource here: https://introcs.cs.princeton.edu/java/13flow/. Thank goodness, only 1/2 day of my life gone. 






  }
}