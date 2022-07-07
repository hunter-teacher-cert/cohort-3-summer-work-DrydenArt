//import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Elizabeth Rechtin
 * collaborators: Ed Hawkins, Thea Williams, Christopher De Silva
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/
  //

public class Driver {

    public static void main(String[] args) {
    	//declare a var of appropriate type to assign an instance of Time to
    	Time t;//an object of the class Time

    
      

      Time timeVar = new Time(2,2,2); // defualt constructor
    
    	//assign var the address of a newly-apportioned Time object
    	t = new Time();  //uses the constructor to build the foundation with these data
      System.out.println(t.toString());
      
    }//end main()
}//end class