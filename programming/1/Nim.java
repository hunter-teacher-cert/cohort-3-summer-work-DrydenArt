import java.io.*;
import java.util.*;

public class Nim 
{
  public static void main(String[] args)
  {
    int stones = 12;
    int stonesTaken;
    Scanner input = new Scanner(System.in);
    //loop until game ends
    while (stones > 0) {
      //prompt user input: user taking turn
      System.out.println("Please enter a number from 1 - 3 stones");
      stonesTaken = input.nextInt();//taking from the user I
      

        //calculate number of stones remaining, print
      stones = stones - stonesTaken;
      //also could do: stones -= stonesTaken;
      System.out.println("There are " + stones + " left");
      //check win
      if(stones <= 0)
      {
        System.out.println("You win!");
        break; //force out loop
      }
      
       //machine turn
      System.out.println("Computer's Turn:");
      stonesTaken = (int) (Math.random()*3)+1;
      //Math.random()(min - max +1) +min this calculates range, keeps in mind the zero index
      stones = stones - stonesTaken;
      System.out.println("The Computer took " + stonesTaken);
      //calculate number of stones remaining, print
      System.out.println("There are " + stones + " left");
      if(stones <= 0)
      {
        System.out.println("Computer Wins!");
        break; //force out loop
      }

     

      //check win
      
       
      
    }
    System.out.println("The game has ended");
  }
}