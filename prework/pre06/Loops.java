import java.io.*;
import java.util.*;

public class Loops {

  //public static void printRow(int n, int cols) {
    //int i = 1;
    //while (i <= cols) {
      //System.out.printf("%4d", n * i);
     // i = i + 1;
    //}
   // System.out.println();
 // }

  //public static void printTable2(int rows) {
   // for (int i = 1; i <= rows; i = i + 1) {
     // printRow(i, rows);
     // loop(10);
    //}
  //}


  //public static void loop(int n) {
    //int i = n;
   // while (i > 1) {
     // System.out.println(i);
      //if (i% 2 == 0) {
        //i = i / 2;
     // }else {
        //i = i + 1;
      //}
   // }
 // }
  //Exercise 2 - square root: x1 = (xo + a/xo)/2
  public static double squareRoot(double a) {
    double x0;
    double x1 = a/2;
    double interval = 0;
    do { x0 = x1;
      x1 = (x0 + a/x0) /2;
      interval = Math.abs(x1 - x0);
      System.out.println(interval);
      } while (interval > .000001);
    return x1;
    
  }
  //Exercise 3 - power reworked
  public static double power (double x, int n){
    double result = 1;
    for (int i = 0; i < n; i++){
      result *= x;
    } 
    return result;
    }
  //Exercise 4 - factorial reworked
  public static int factorial(int f) {
    if (f == 0){
      return 1;
    }
    int iter = f;
    while (f > 1) {
      iter = iter * (f-1);
      f = f - 1;
    }
    return iter;
  }


  public static void main(String[] args) {
    System.out.print("Exercises 2, 3 and 4");
    System.out.println(" from Think Java, 7.9:");
    System.out.println("Square Root:");
    //printTable2(1);
    System.out.println(squareRoot(9.0));
    System.out.println("Power:");
    double x = 5;
    int n = 2;
    double xn = power(x,n);
    System.out.println(xn);
    System.out.println("Factorial:");
    System.out.println(factorial(3));
    
  }
}