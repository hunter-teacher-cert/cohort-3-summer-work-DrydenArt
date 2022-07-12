import java.io.*;
import java.util.*;

public class Triangle {

  public static boolean isTriangle(int a, int b, int c) {
    boolean flagTriangle;
    if (a > b + c || b > a + c || c > a + b){
        flagTriangle = false;    
  }
  else{
    flagTriangle = true;
    }
    return flagTriangle;
  }
  

  public static void main(String[] args) {
    boolean flagTriangle = isTriangle(2, 2, 12);
    System.out.println("This is a triangle: " + flagTriangle);
  }
} 
//this is exercise 6.3 on page 100 of Think Java