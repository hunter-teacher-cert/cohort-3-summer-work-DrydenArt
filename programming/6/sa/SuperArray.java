/**
 * SuperArray by Team MarvelvsDC
 * Elizabeth Rechtin
 * collaborators: David Moste, Adam Driggers
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
  public SuperArray( int size )//this is where you create your default values
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
    if(numberElements >= data.length)
    {
      grow();
    }

    // add item
    data [numberElements] = value; //adds the value that came in from the main
    // increment numberElements
    numberElements++; //opposite of decrement in remove method below

  }//end add()


  public boolean isEmpty()
  {//return whether this SuperArray instance is empty
    if(numberElements == 0)//this is an evaluation
    {
      return true; 
    }else //added this else statement after class demo, not sure if I needed it
      {
        return false;
      }
     
    /* YOUR SIMPLE+SMART CODE HERE */
    //can also write this as: 
    //return numberElements == 0;  this is a statement: is numberElements == 0? true/false is returned, 
    //"reduced to" or "replaced" this all still has to be evaluated
  }


  public int get(int index)
  {
    //return item at index
    return data[index]; //returns the value at the index
  }


  public String toString()
  {
    //build a string and then return
    String a = "";
    //return stringified version of this Object, should return something "
    for(int i = 0; i<data.length; i++)
    {
      a = a + data[i] + ", "; //update the string with the new value
      // shorthand //a += data[i] + ", ";
    }
    return a; //change later
    
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
    //   int index = data[i];
    //   data[i] = data[data.length -1 -i];
    //   data[data.length-1 -i] = index; 
    // }

    // subtract fom numElements;
    //attempt from E: numberElements--; //the opposite in increment from the add method above
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */
    //if(numberElements <= data.length) can I use value instead of numberElements? do I need to add +1 to the length?

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
    int [] data2 = new int [data.length + 5]; //create a new array that is bigger

    // copy over all the elements from the old array to the new one
    for(int i = 0; i<data.length; i++)
    {
      data2[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
    data = data2; //points data from array data to the new array, data2
  }//end grow()

}//end class