import java.io.*;
import java.util.*;



/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * Elizabeth Rechtin
 * collaborators: Susie Seccafico, Rich Parker, Steve Sabaugh
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/



public class Cgol
{
  static char dead ='-';
  static char alive = 'X';

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) //this reads every cell in the row
      {
        for (int j = 0; j < cols; j++) { //and reads every cell in the col
        board[i][j] = '-'; //fills empty the board with dashes for visualization, indicates a dead cell
      }
    }
    return board;//this is outside the for loop (completed), now it returns the board
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {//int numRows = board.length;
    //int numCols = board[0].length;
    for (int i = 0; i < board.length; i++) //goes over the entire board and prints it out
      {
        for (int j = 0; j < board[i].length; j++)
          {
            System.out.print(board[i][j] + " ");
          }
      System.out.println("");//do we want to add a visual aspect to see the grid?  as in Mr. Ahmed's demo?
      }

  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
        board[r][c]=val;//passing the board as a parameter, sets a particular cell to be alive.  This is determined in main.  
  }


    
  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    //sets all conditions for anything out of bounds
    //start of rows ? is a ternary operator = choice of two (an in line statement)
    //if r-1 < 0) then startR = r : (else) startR = r-1
    int startR = (r - 1 < 0) ? r : r - 1; 
    int startC = (c - 1 < 0) ? c : c - 1;
    int rowLim = (r + 1 > board.length - 1) ? r + 1 : r + 2;  
    int colLim = (c + 1 > board[0].length - 1) ? c + 1 :  c + 2;

    int livingCt = 0;//this is what the method is looking for and keeping track of, this gets returned at the end once all the method is complete
    
    for(int row = startR; row < rowLim;row++)
    {
      for(int col = startC;col < colLim;col++) 
      {
        if (!(row == r && col == c)) //checks to make sure it's not in the square
        {
          if(board[row][col] == 'X'){
            livingCt++; //goes up by 1 to continue counting our living neighbors
          }
        }
      }  
    }
    return livingCt;//this data is from the int livingCt = 0; above
  }
//maybe create a copy of the board to hold information temporarily? Maybe this array could hold whether the current generation status will live or die  


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
 public static char getNextGenCell( char[][] board,int r, int c )
  {
    char nextGen = board[r][c];
    int numNeighbours = countNeighbours(board,r,c);//checks the neighbors at r and c
    if(board[r][c]== alive){
      if(numNeighbours == 2 || numNeighbours ==3){// alive cell
        nextGen = alive;
    }
      else{
        nextGen = dead;
    }
    }
    else{// dead cell
      if (numNeighbours ==3){
        nextGen = alive;
    }
    else{
      nextGen = dead;
    }
  }
    return nextGen;//returns either the X or the - for alive or dead
  }


  // generate and return a new board representing next generation
public static char[][] generateNextBoard( char[][] board )
  {//returns a 2D array
    char [][] newBoard = new char[board.length][board[0].length];
    for (int i =0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        newBoard[i][j] = getNextGenCell(board,i,j );//gives the data from getNextGenCell and puts in into the newBoard
      }
    }
    return newBoard;
  }



  public static void main( String[] args )
  {

    char[][] board; //declares the board array
    board = createNewBoard(5,5); //initializes the array (with new)
    setCell(board, 0, 0, 'X'); //indicates each cell
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    setCell(board, 3, 2, 'X');
    setCell(board, 3, 3, 'X');
    setCell(board, 3, 4, 'X');
    setCell(board, 4, 0, 'X');
    printBoard(board); //calls printBoard with the argument board
    System.out.println("--------------------------\n\n");//divides the boards up 
    System.out.println("New Board:"); //prints out the String
    char [][] newBoard; //declares the array
    newBoard = generateNextBoard(board); //initializes the array (the memory is created to store values)
    printBoard(newBoard); //prints out a grid of an array, it's a void method, no value is being returned 
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);
    
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    ;

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
  } //end main()

}//end class