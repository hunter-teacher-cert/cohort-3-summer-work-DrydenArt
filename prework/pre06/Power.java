import java.io.*;
import java.util.*;

public class Power {
  //xn = x * xn-1
  public static double power (double x, int n){
    
    if (n==0) {
      return 1;
    }else{
      return x * power(x, n-1);
    }
   
  }


  public static void main(String[] args) {
    System.out.println("Exercise 6.9, page 103");
    double x = 5;
    int n = 2;
    double xn = power(x,n);
    System.out.println(xn);
    
  }
}