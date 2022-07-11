import java.io.*;
import java.util.*;

public class Greeter {

  public static void generationGreet(String name, int number){
    System.out.println("Good morning, " +name + " the " + number);


  }

  public static void namedGreet(String name){
   System.out.println("Good morning, " +name);
  greet();

  }

  //void means that it isn't communicating anything back here//
  public static void greet(){
    //the empty brackets above = no parameters//
  System.out.println("Hey"); 

  }
  //you must have one main - this is the main code//
  public static void main(String[] args) {
    greet();
    greet();
    namedGreet("Elizabeth!");
    namedGreet("Sunshine!");
    //with generationGreet, order matters - you must list the variables in the same order as you did above//
    generationGreet("Charles" ,3);
    //the main is read first, it goes to greet, reads the code and then comes back to read the second greet, goes and does that then comes back to read namedGreet (reads it, comes back), reads second namedGreet and goes to read it and do what it says. //
  }
}