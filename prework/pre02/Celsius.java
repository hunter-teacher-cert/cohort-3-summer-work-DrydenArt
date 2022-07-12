import java.util.Scanner;
import java.util.*;

public class Celsius {

  public static void main(String[] args){

    double F;
    double C;
    Scanner in = new Scanner(System.in);

    //F = (0 * 9 / 5) + 32;
    //C = 0;

    System.out.print("What is the temperature in Celcius? ");
    C = in.nextDouble();
    F = (C * 9.0 / 5) + 32;
    System.out.printf(C + " C = %.1f", F);
    



    
  }
}