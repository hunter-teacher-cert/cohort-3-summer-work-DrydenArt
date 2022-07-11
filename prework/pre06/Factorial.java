import java.io.*;
import java.util.*;

public class Factorial {

  public static int factorial(int n) {
    if (n == 0){
      return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
  }





  public static void main(String[] args) {
    System.out.println("Recursive Factorial, Section 6.7:");
    System.out.println(factorial(3));
  }
}