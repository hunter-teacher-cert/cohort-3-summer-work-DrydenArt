import java.io.*;
import java.util.*;

/**
Name: Elizabeth Rechtin
Collaborators: David Moste, Usman Ahmed, Erwin Lara, with additional help from office hours
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
+add(string value)
+get(int index);
+toString()

Intermediate (at least add, size + one of the other two)
------------
+size()
+add(int index,String value)
+indexOf(String value);
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
    head = new Node(value, head);//computer has made some unnamed object and  then it looks to the constructor to create it, then it looks at the value and points it to head, and then reassigns head to look at the newly created node

  }
  /**
  Returns the String in the node at location index.
  */
  public String get(int index)
  {
    Node walker = head; //declares the walker as the head of the list
    for (int i = 0; i < index; i++)//loops through the list
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
  

  public Node get_Helper(int index)//this returns the value and the get next (all information held in the node, but we'll only see the value due to the toString method)
  {
    Node walker = head;
    for (int i = 0; i < index; i++)
      {
        if (walker == null || index < 0)
        {
          return null;
        }
        else
        {
          walker = walker.getNext();
        }
      }
    return walker;
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
    Node walker = head;
    int counter = 0;//this extra variable eliminates having to run through the list everytime

    while (walker != null)
      {
        walker = walker.getNext();
        counter++;
      }
    return counter;
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
  public void add(int index, String value)
  {
    if (index == 0)//if it's at the beginning
    {
      this.add(value);
      return;
    }
    else if (index == this.size())//this is the last node
    {
      Node n = get_Helper(index -1);//points to "usman"
      Node p = new Node (value);
      n.setNext(p);
    }
    else
    {
      Node previous = get_Helper(index -1);//created variable for previous
      Node n = new Node (value);//created variable for object that we are adding
      Node next = get_Helper(index);//created variable for the next node
      n.setNext(next);//set n to point at next variable
      previous.setNext(n);//set previous to point at n
    }
    
  //   Node str = new Node (value); //this is declaring the new node that we have to add
  //   Node walker = head; //do we need a walker to find the index? and do we start it at the head?  
 
  //   if (int i = 0; i < index; i++){//loops through the list until one before the index
    
  //     walker = walker.getNext();//the walker will take the value of the next node - lets the walker move forward through the list
  //   } str = value + index.setNext();//do I have to assign str to the walker here?
  //     str = str.getNext();
    

   }



  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value)
  {
    Node walker = head;
    int counter = 0;
    while (walker != null)
    {
      if(walker.getData() != value)
      {
        walker = walker.getNext();
        counter++;
      }
      else
        return counter;
    }
     return -1;
   }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray()
  {
    //make a walker to go over the linked list, set it to the head
    Node tempWalker = head;
    //make a String [] of size
    String[] copy = new String [size()];
    //for each item in the linked list, until size(), 
    for (int i = 0; i < size(); i++)
      {
        copy[i] = tempWalker.getData(); //set the array at index == linked list at index.
        tempWalker = tempWalker.getNext();//move the walker onward
        
      }
      return copy;//returns the array values 
    }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  // public void remove(int index){
  //  }

  
 }