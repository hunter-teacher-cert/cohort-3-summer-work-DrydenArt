/**
 * Recursion Practice with Strings by Team SweatEquity
 * Elizabeth Rechtin
 * collaborators: Ed Harris, Thea Williams, Christopher De Silva
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts

     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {/* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    String fenceR(1) = "|";
    String fenceR(2) = "--|";
    if (n == 0)
    {
      return "";
    }
    
    
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  } //end of main
} //end of class