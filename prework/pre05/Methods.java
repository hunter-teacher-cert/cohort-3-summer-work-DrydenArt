import java.io.*;
import java.util.*;

//PLEASE SEE METHODS2 FOR PRE_WORK SUBMISSION

public class Methods{
//tests whether a number is divisible by another
  //n is the integer to be tested, m is the integer to divide, return true if m is not 0 and n is divisible by m//
  public static boolean isDivisible(int n, int m){
    boolean flagDiv; // = isDivisible(n, m);
      if (m != 0 && n % m == 0) {
      return flagDiv = true;
      //System.out.println("Is it divisible? " + flagDiv);
    }else{
      return flagDiv = false;
      //System.out.println("Is it divisible? " + flagDiv);
    }
  }
  

  public static boolean isTriangle(int a, int b, int c) {
    boolean flagTriangle; // = isTriangle(a, b, c);
    if (a > b + c || b > a + c || c > a + b){
        flagTriangle = false;    
        //System.out.println("Is this a triangle? " + flagTriangle);
  }
  else{
    flagTriangle = true;
    }
    return flagTriangle;
    //System.out.println("Is this a triangle? " + flagTriangle);
  }
  

  public static void main(String[] args){
  isDivisible(7, 3);
    System.out.println("Is it divisible? " + boolean flagDiv);
  isTriangle(2, 2, 12);
    System.out.println("Is this a triangle? " + boolean flagTriangle);

  }
}
//This is exercise 6.2 on page 100 of Think Java