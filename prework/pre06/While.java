import java.io.*;
import java.util.*;

public class While { //page 106 - 109

  public static void countdown(int n) {
    while (n > 0) { //evaluate the condition
      System.out.println(n); //if false, skip body, go to next
      n = n - 1;
    }
    System.out.println("Blast Off!");
  }

  public static void sequence(int n) {
    while (n != 1) {
      System.out.println(n);
      if (n % 2 == 0) {
        n = n / 2;
      }else {
        n = n * 3 + 1;
      }
    }
  }

  public static void log(int i) {
    //int i = 1;
    final double LOG2 = Math.log(2);
    while (i < 100) {
      double x = i;
      System.out.println(x + "  " + Math.log(x) / LOG2);
      i = i +1;
    }
  }

  public static void printRow(int n, int cols) {
    int i = 1;
    while (i <= cols) {
      System.out.printf("%4d", n * i);
      i = i + 1;
    }
    System.out.println();
  }

  
  public static void printTable(int rows) {
    int i = 1;
    while (i <= rows) {
      printRow(i, i);
      i = i + 1;
    }
    System.out.println();
  }

  public static void printTable2(int rows) {
    for (int i = 1; i <= rows; i = i + 1) {
      printRow(i, rows);
    }
  }
    
  public static void main(String[] args){
    System.out.println("here we go again");
    //countdown(10);
    //sequence(3);
    //log(1);
    //mult(3);
    printTable2(7);
    
    
  }
}
