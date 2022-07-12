import java.io.*;
import java.util.*;

public class Multadd {
                //this is what it's returning//
  public static double multadd(double a, double b, double c) {
    return a * b + c;
  }

  public static double NegSum(double a, double b, double c) {

    return multadd(a, b, c) * -1;
  }
  public static void main(String[] args) {
    double a = 2.0;
    double b = 3.0;
    double c = 1.0;
    System.out.println(multadd(2.0, 3.0, 1.0));
    System.out.println(NegSum(a, b, c));
    
  }
}