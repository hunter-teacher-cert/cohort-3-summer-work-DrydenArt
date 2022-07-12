import java.util.Scanner;
//this must be written before you can use Scanner.  It imports the scanner//

public class Echo {

  public static void main(String[] args) {
    String line;
    Scanner in = new Scanner(System.in);//this line declares a Scanner variable named in and creates a new Scanner that takes input from System.in//

    System.out.print("Type something: ");
    line = in.nextLine();
    System.out.println("You said: " + line);

    System.out.print("Type something else: ");
    line = in.nextLine();
    System.out.println("You also said: " + line);
    
    //This example is on page 35 of ThinkJava

    //Package = java.util
    //Class = Scanner
    //Method = nextInt (as in line)
    //Statement = hour = in.nextInt();
    //Expression = hour * 60
    //Token = hour
    //a clear graphic is on page 36

    
  


  }
}