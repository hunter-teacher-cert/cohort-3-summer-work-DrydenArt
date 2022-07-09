/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];
    
    numberElements = 0; //init instance vars
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int[10];
  
    numberElements = 0;//init instance vars

  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */
    //from E:
    //if(numberElements <= data.length)??

    // add item
    data [numberElements] = value; 
    // increment numberElements
    numberElements++; //opposite of decrement in remove method below

  }//end add()


  public boolean isEmpty()
  {//return whether this SuperArray instance is empty
    //from E: this will need an if statement? and is referring to the number of elements?
    //if(numberElements == 0)
    //{
    //  return true; 
    //}
    return false; //change later
    
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public int get(int index)
  {
    //return item at index
    //int g = data[i];
    return 0; //change later
  }


  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    return ""; //change later
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    //attempt from E (I'm basing this on my work on flip): 
    // for(int i = 0; i<data.length; i++)
    // {
    //   int a = data[i];
    //   data[i] = data[data.length -1 -i];
    //   data[data.length-1 -i] = a; 
    // }

    // subtract fom numElements;
    //attempt from E: numberElements--; //the opposite in increment from the add method above
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */
    //if(numberElements <= data.length) can I use value instead of numberElements?

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
    //numberElements++;
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    // int [] data2 = data.length+1;

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */ 
    //modified from my copyBoard:
    //for(int i = 0; i<data.length; i++)
    //{
      //data[i] = data2[i];
    //}

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
    //return data2[i];
  }//end grow()

}//end class