import java.io.*;
import java.util.Arrays;


public class Practice8 {


  public static void printArray(int[] array) {
    //int[] a = {1, 2, 3, 4};
    //int[] a;
   System.out.print("{" + array[0]);
    for (int i = 1; i < array.length; i++) {
      System.out.print(", " + array[i]);
    }
    System.out.print("}");
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
  //a reduce operation which reduces an array of values down to a single value:
  public static double sum(double[] a) {
    double total = 0.0; //initializes total to zero before the loop
    for (int i = 0; i < a.length; i++) {
      total += a[i]; //contains the sum of the elements: "accumulator"
    }
    return total;
  }
  
  //creates an int array and fills it with random numbers between 0-99 p 130 T.J.
  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    return a;
  }


  public static void main(String[] args) {
    int size = 10;
    int[] counts = new int[4];
    double[] values = new double[size];
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;
    //int i = 0;
    //while (i < 4) {
      //System.out.println(counts[i]);
      //i++; 
      //}
    int [] array = {1, 2, 3, 4};
    //printing an array as an object
    printArray(array);
    //printing an Arrays class (importing java.util.Arrays)
    System.out.println(Arrays.toString(array));
    //copying an array
    double [] a = new double [3];
    double [] b = new double [3];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    //copying with Arrays class
    double [] c = Arrays.copyOf(a, a.length);
    //generalize the code to work with arrays of any size
    double [] b = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    //you can also use a.length with Arrays.copyOf:
    double [] b = Arrays.copyOf(a, a.length);
    //traversal (p128 Think Java)
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], 2.0);//squares the elements of a double array
    }
    int numValues = 8;
    int[] array = randomArray(numValues);
    printArray(array);
      
    }
}