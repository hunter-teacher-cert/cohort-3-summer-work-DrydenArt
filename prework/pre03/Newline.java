public class Newline {

  public static void newLine() {
    System.out.println();
  }
  
  public static void threeLine() {
    newLine();
    newLine();
    newLine();

  }
  /**
   * It starts reading here at main regardless of where it is placed within the code (not necessarily top to bottom.)
   */
  public static void main(String [] args){
    /**
     *executes first
     */
    System.out.println("First line.");
     /**
      *invokes threeLine method, which invokes newLine method and executes (x3)
      */
    threeLine();
    /**
      *then comes back to main for this instruction:
      */
    
    System.out.println("Second line.");
  
    
  }
}