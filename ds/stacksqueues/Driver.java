import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	System.out.println("\nSTACK:");
	Stack s = new Stack();
  //test for isEmpty
  System.out.println("Is the stack empty? " +s.isEmpty());

  System.out.println(s.pop());
  s.push(0);
  s.push(1);
  s.push(2);
  //prints the stack
  System.out.println("\nThis is the array stack: " +s);

  System.out.println("\nSize = " +s.size());
  //
  System.out.println("\nThis is the value on the top of the stack: " +s.top());
    
  System.out.println("\nThis returns and removes the top element: " +s.pop());
    
  System.out.println("\nThis is the array after pop: " +s);

  System.out.println("\nSize = " +s.size());
  System.out.println("\nIs the stack empty? " +s.isEmpty());

	// Testing for Queue
  System.out.println("\nQUEUE:");
  Queue q = new Queue();
  System.out.println("Is the queue empty? " +q.isEmpty());

  System.out.println(q.dequeue());
  q.enqueue(0);
  q.enqueue(1);
  q.enqueue(2);
  //prints the stack
  System.out.println("\nThis is the array queue: " +q);

  System.out.println("\nSize = " +q.size());
  //
  System.out.println("\nThis is the value at the bottom of the stack: " +q.front());
    
  System.out.println("\nThis returns and removes the bottom element: " +q.dequeue());
    
  System.out.println("\nThis is the array after dequeue: " +q);

  System.out.println("\nSize = " +q.size());
  System.out.println("\nIs the queue empty? " +q.isEmpty());

  
	
    }
}