import java.util.Scanner;

public class Convert {

  public static void main(String[] args) {
    //int inch;
    //double cm;
    int cm;
    double inch;
    Scanner in = new Scanner(System.in);

    //System.out.print("How many inches? ");
    //inch = in.nextInt();
    //cm = inch * 2.54;
    //System.out.print(inch + " in = ");
    //System.out.println(cm + " cm");

    System.out.print("How many centimeters? ");
    cm = in.nextInt();
    inch = cm / 2.54;
    System.out.print(cm + " cm = ");
    System.out.println(inch + " in");

    




  }
}