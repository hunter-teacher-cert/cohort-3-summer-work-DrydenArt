import java.io.*;
import java.util.Arrays;

/**
  *Write a method called sieve that takes an integer parameter, n, and returns
a boolean array that indicates, for each number from 0 to n - 1, whether the
number is prime.
  */

public class Sieve2 {

  public static boolean[] sieve(int n) {
    //int n;
    boolean [] result = new boolean [n+1];//return array
    result[0] = false;
    result[1] = false;
    for (int i = n; i <= n; i++) 
      result[i] = true;
    //System.out.print(Arrays.toString(result[i]));
    for (int number = n; number <= (int)Math.sqrt(n);number++){
      if (result[number] == true){
        for (int indexInSeries = number*number;indexInSeries <= n; indexInSeries += number) {
          result[indexInSeries] = false; 
        }
      }
    }
    return result;
  }

  
  public static int[] primeArray(boolean r) {
    int [] = new isPrime [10];
    isPrime[0] = 2;
    isPrime[1] = 3;
    isPrime[2] = 4;
    isPrime[3] = 5;
    isPrime[4] = 6;
    isPrime[5] = 7;
    isPrime[6] = 8;
    isPrime[7] = 9;
    isPrime[8] = 10;
    isPrime[9] = 11;
    if (result[i] = true){
      System.out.print(result);
    }
    //else {
      
    //}
  }
  


  public static void main (String[] args) {
    System.out.println("Exercise 8.5 on page 137 in Think Java:");
    int n = 2;
    //boolean [] sieveResult = new sieveResult[n];
    //new sieveResult[n] = sieve(n);
    boolean [] prime;
    prime = sieve(n);
    //System.out.println(Arrays.toString(prime));
    primeArray(result);
  
    
  }
}