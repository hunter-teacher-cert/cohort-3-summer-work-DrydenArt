import java.io.*;
import java.util.*;

public class Queue{
  
  // Place private instance variables here
  private ArrayList <Integer> queue; 
  //private int element; 
     
  // Place constructors here
  public Queue(){ 
    queue = new ArrayList<Integer>();
      //element = 0;
  }
      // Place methods here
      
  public void enqueue(int value){
    queue.add(value);
    return;
  }
  

  public int front(){
    return queue.get(0);
  }

  public int dequeue(){
    if(isEmpty()){
      //System.out.println("Stack is empty, goodbye.");
      return -9999;
    }
    int res = queue.get(0);
    queue.remove(0);
    return res;
  }

  public boolean isEmpty(){
    return queue.size() == 0;
  }

  public int size(){
    return queue.size();
  }
  
  public String toString(){
    
    return "" + queue;
  }

  
  
}