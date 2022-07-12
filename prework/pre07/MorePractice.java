import java.io.*;
import java.util.Random;

public class MorePractice {
  
  /**
  *Returns an array of random integers.
  */
  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    return a;
  }
  
  /**
  *Prints the elements of an array.
  */
  public static void printArray(int[] array) {
   System.out.print("{" + array[0]);
    for (int i = 1; i < array.length; i++) {
      System.out.print(", " + array[i]);
    }
    System.out.print("}");
  }

  /**
  *Computes the number of array elements in [low, high].
  */
  public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= low && a[i] < high) {
        count++;
      }
    }
    return count;
  }



  public static void main(String[] args) {
    System.out.println("Practice from page 130, Think Java:");
    int numValues = 8;
    int[] array = randomArray(numValues);
    printArray(array);
    int[] scores = randomArray(30);
    int a = inRange(scores, 90, 100);
    int b = inRange(scores, 80, 90);
    int c = inRange(scores, 70, 80);
    int d = inRange(scores, 60, 70);
    int f = inRange(scores, 0, 60);

    //making a histogram
    //int[] counts = new int[100];
    //for (int i = 0; i < scores.length; i++) {
     // int index = scores[i];
      //counts[index]++;
    //}
    
    //histogram with storage for 100 counters, but not efficient
    //int[] counts = new int[100];
    //for (int i = 0; i < counts.length; i++) {
      //counts[i] = inRange(scores, i, i + 1);
    //}

    
    //histogram traverses scores only once, more efficient
    //int[] counts = new int[100];
    //for (int i = 0; i < scores.length; i++) {
      //int index = scores[i];
      //counts[index]++;
    //}

    //histogram with enhanced loop, most efficient, page 133 T.J.
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
  }
}