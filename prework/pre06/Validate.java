import java.io.*;
import java.util.Scanner;

public class Validate {

  public static double scanDouble() {
    Scanner in = new Scanner(System.in);
    boolean okay; //flag variable
    do {
      System.out.print("Enter a number: ");
      if (in.hasNextDouble()) {
        okay = true;
      }else {
        okay = false;
        String word = in.next();
        System.err.println(word + " is not a number");
      } //displays system error (above)
    }while (!okay);
    double x = in.nextDouble();
    return x;
  }
/**
  *This one demonstrates the break:
  */
  public static double scanDouble2() {
    Scanner in = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a number: ");
      if (in.hasNextDouble()) {
        break;
      }
      String word = in.next();
      System.err.println(word + " is not a number");
    }
    double x = in.nextDouble();
    return x;
  }

  public static double scanDouble3() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = -1;
    int sum = 0;
    while (x != 0) {
      x = in.nextInt();
      if (x <= 0) {
        continue;
      }
      System.out.println("Adding " + x);
      sum += x; //means increment by x
    }
    return x += 1;
  }


  public static void main(String[] args) {
    System.out.println("Do-while, break, and continue:");
    scanDouble3();
    scanDouble();
  }
}