import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //l.add("World");
    l.add("Hello");
    l.add("World");
    //l.add("World"); (why does the print flip when I add this here?)
    System.out.println(l.toString());
    
  }
}