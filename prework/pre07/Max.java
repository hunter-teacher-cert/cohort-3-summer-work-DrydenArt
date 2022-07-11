import java.io.*;
import java.util.Arrays;

public class Max {

  public static int indexOfMax(int[] a) {
    int index = 0;
    //int[] index;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[index]){
        index = i;
      }
  }
    return index;  
}
   //returns the index of a target in the array, or -1 if not found
  //page 129 Think Java.  This pattern is called a search: it involves traversing an array looking for a particular element:
  public static int search(double[] a, double target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1; //-1 indicates a failed search
  }

  public static void main(String[] args) {
    System.out.println("Exercise 8.4, page 137 of Think Java:");
    int[] a = new int[3];
    //int index;
    a[0] = 5;
    a[1] = 22;
    a[2] = 16;
    //int index = 0; //I don't know if I need this, it keeps causing issues
    int maxIndex;
    maxIndex = indexOfMax(a);
    System.out.println(maxIndex);
  }
}