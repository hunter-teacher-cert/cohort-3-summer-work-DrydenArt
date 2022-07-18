import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //l.add("World");
    l.add("Usman");
    l.add("Elizabeth");
    l.add("Erwin");
    l.add("David");
    
    
    System.out.println(l.toString());
    System.out.println("The value at index 3 is: " + l.get(3));
    System.out.println("The size of the list is: " +l.size());
    System.out.println(l.get_Helper(2).toString());
    //System.out.println(l.add(1, "The water's fine!"));
    
  }
}