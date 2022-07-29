import java.io.*;
import java.util.*;


public class Stack{

    // Place private instance variables here
  private ArrayList<Integer> stack;
  
    // Place constructors here
  public Stack(){
    stack = new ArrayList<Integer>();

  }
    // Place methods here
  public void push(int value){
    stack.add(value);
    return;
  }

  public int top(){
    return stack.get(stack.size() -1);
  }

  public int pop(){
    if(isEmpty()){
      System.out.println("The stack is empty.");
      return -9999;
    }
    int res = stack.get(stack.size()-1);
    stack.remove(stack.size()-1);
    return res; 
  }

  public boolean isEmpty(){
    //return stack.size() == 0 ? true : false; //turnery
    return stack.size() == 0;
  }

  public int size(){
    return stack.size();
  }

  public String toString(){
    return "" + stack;
  }

  
  

}