import java.io.*;
import java.util.*;

public class Exercise {

  public static double circleArea
          (double xc, double yc, double xp, double yp) {
    double radius = distance(xc, yc, xp, yp);
    double area = calculateArea(radius);
    return area;
  }

  public static double calculateArea
          (double xc, double yc, double xp, double yp) {
    return calculateArea(distance(xc, yc, xp, yp));
            
  }


  public static double distance
          (double xc, double yc, double xp, double yp) {
    double dx = xp - xc;
    double dy = yp - yc;
    double dsquared = dx * dx + dy * dy;
    double result = Math.sqrt(dsquared);
    return result;
            
  }





  public static void main(String[] args) {
    double dist = distance(1.0, 2.0, 4.0, 6.0);
    double radius = 2.0;
    System.out.println(distance(1.0, 2.0, 4.0, 6.0));
    

    
  }
}