import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //l.add("World");
    l.add("one");
    l.add("two");
    l.add("three");
    l.add("four");
    l.add("five");
    
    
    System.out.println(l.toString());
    System.out.println("The value at index 3 is: " + l.get(3));
    System.out.println("The size of the list is: " +l.size());
    System.out.println(l.get_Helper(2).toString());
    System.out.println("The index of Usman is: " +l.indexOf("Usman"));
    System.out.println("toArray method test: ");
    String [] test = l.toArray();
    for (int i = 0; i < test.length; i++)
    {
      System.out.println(test[i] + "");
    }
    
  }
}