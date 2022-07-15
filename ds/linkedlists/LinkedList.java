import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){//this is the constructor
    head = null;//establishes how the nodes will be made
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    head = new Node(value, head);//computer has made some unnamed object and then it and then it looks to the constructor to create it, looks at the value and then points it to head and then reassigns head to look at the newly created node

  }
  /**
  Returns the String in the node at location index.
  */
  public String get(int index)
  {
    Node walker = head; //declares the walker as the head of the list
    for (int i = 0; i < index; i++)
      {
        if (walker == null || index < 0)//this is a safeguard to keep the input inbounds
        {
          return("Exception. Out of bounds.");//error that is returned
        }
        else
        {
          walker = walker.getNext();//the walker will take the value of the next node - lets the walker move forward through the list
        }
      }
    return walker.getData();//this will return the value or data at that index
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node walker = head;//assigns the walker as a copy of head (gets the value of head and points to next node)
    String str = "";//declaring the String and it also stores the values from the list
    
    while (walker != null) 
      {//line 69 can also be written: str += walker.toString();
        str = str + walker.toString();//we are appending the walker's data to the string
        
        walker = walker.getNext();//the walker is moving through the list
      }
    return str + "null";//once the loop is done, it returns all the data
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    return 0;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){

  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }

  
}