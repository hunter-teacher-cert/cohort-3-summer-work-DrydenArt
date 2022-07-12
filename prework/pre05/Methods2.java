import java.io.*;
import java.util.*;

public class Methods2 {

  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    }else if (m > 0 && n == 0) {
      int recurse = ack(m - 1, 1);
      return recurse;
      }else if (m > 0 && n > 0) {
        int recurse = ack(m - 1, ack(m,n - 1));
        return recurse;
      }
    return ack(m, n);
    }
  
  
  public static boolean isTriangle(int a, int b, int c) {
    boolean flagTriangle;
    if (a > b + c || b > a + c || c > a + b){
        return flagTriangle = false;    
  }
  else{
    return flagTriangle = true;
    }
  }


  public static boolean isDivisible(int n, int m) {
    boolean flagDiv;
    if (m != 0 && n % m == 0) {
      return flagDiv = true;
  }else{
      return flagDiv = false;
      } 
  }

  public static void main(String[] args) {
    System.out.println(ack(3, 4));
    boolean flagTriangle = isTriangle(2, 2, 2);
      System.out.println("Is it a triangle? " +flagTriangle);
    boolean flagDiv = isDivisible(7, 3);
      System.out.println("Is it divisible? " +flagDiv);
      
  }
}