import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Elizabeth Rechtin
 * collaborators: Marissa Shuman, Will Lamorie, Rich Parker
 */

/**
   INSTRUCTIONS:

   Place this file in a folder named programming/3/.

   This file contains the following completed method. Use it as a model
   to help you with the other methods:

   - buildBoard

   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):

   Basic level (complete all):
   - printBoard *
   - copyBoard *

   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *

   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString

   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.

   Ex: buildBoard(3,4,'x') will return this 2D array:

   xxxx
   xxxx
   xxxx
   xxxx

   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) 
      {
        for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters

     This should print the array as a grid
  */
  public static void printBoard( char[][] board )//this was demonstrated by Marissa and clarified and explained by Will
  {
    for (int i = 0; i<board.length; i++) //for loop to deal with each row, Ed demod that they used int row = 0; row<board.lenth; row++
      {
        for (int j = 0; j<board[i].length; j++) //for loop to deal with each column, Ed demod that they used int col = 0; col <board[row].length; col++)
        {
          //first need to print each cell
          System.out.print(" " +board[i][j]);
        }
        //add println
        System.out.println();
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  //I worked thorugh this with help from TA Kevin Lin:
  public static void setRow( char[][] board, int row, char value )
  {
    //for(int r = 0; r < board.length; r++) (don't need this)
      //{
        for(int c = 0; c < board[row].length; c++)
        {
          board[row][c] = value;//this uses the arguments from main to make the changes
        }
      //}
        
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )//this code was demonstrated by Ed Harris and his group in the main class session, TA Kevin Lin helped me comment and understand
  {
    char[][] copy = new char[original.length][original[0].length];
    //[original[0].length] = measures the length of the first row starting at index 0 to determine the number of cols
      for(int i = 0; i < original.length; i++)
      {//loops through each cell/row
        for(int j = 0; j < original[0].length; j++)//loops through ea cell/col
        {
           copy[i][j] = original[i][j]; //copies the data original to copy
        }
          
     }
       return copy;
   }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board

     Returns:
     nothing

     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.

     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo

     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col

     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ

     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ

     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  //public static void explodeSquare( char[][] board, int row, int col )
  //{
    //check to determine the row is not top or bottom, and that the col is not left or right
    //if it's not, then put an xx in the top, bottom, left, right, top left, top right, bottom left and bottom right
    //if it's on the top: 
    //if it's on the bottom:
    //if it's on the 

    // //Will's suggestion: he wrote this out with the group, and was explaining as he went along, with notes:
    // // // for all from row -1 > row + 1 where value >= 0 and < board.length
    // for(int i = row -1; i <= row +1; i++){ 
       
    //   if(i >=0 && i < board.length){ // constrain to board
    
    //      // we now have the 3 possbale values for row, but just on the board
    
    //      for(int j = col - 1; j <= col +1; j ++){
    
    //        if(j >= 0 && j < board[0].length){ // constrain to board
             
    //         if(i != row || j != col){
    //          board[i][j] = 'X'; // almost done
    //         }
    //        }
    //      }
        
    //    }
    //  }
    
// //Marissa's way: she wrote this independently of the group:
//     if (row != 0 && row != board.length-1) { //not on the top/bottom

//       if (col != 0 && col != board[0].length-1) { //not on the left/right

//         board[row-1][col] = 'x'; //above
//         board[row+1][col] = 'x'; //below
//         board[row][col-1] = 'x'; //left
//         board[row][col+1] = 'x'; //right
//         board[row-1][col-1] = 'x'; //above left
//         board[row-1][col+1] = 'x'; //above right
//         board[row+1][col-1] = 'x'; //below left
//         board[row+1][col+1] = 'x'; //below right
        
        
//       }
//     } 
//     else if (row == 0) { //top row
//       if (col != 0 && col != board[0].length-1) { //top center
//         board[row+1][col] = 'x'; //below
//         board[row][col-1] = 'x'; //left
//         board[row][col+1] = 'x'; //right
//         board[row+1][col-1] = 'x'; //below left
//         board[row+1][col+1] = 'x'; //below right
//       }
//       else if (col == 0) { //top left
//         board[row+1][col] = 'x'; //below
//         board[row][col+1] = 'x'; //right
//         board[row+1][col-1] = 'x'; //below left
//       }
//       else if (col == board[0].length-1) { //top right
//         board[row+1][col] = 'x'; //below
//         board[row][col-1] = 'x'; //left
//         board[row+1][col-1] = 'x'; //below left
//       }
//     }

//     else if (row == board.length - 1) { //bottom
//       if (col != 0 && col != board[0].length-1) { //bottom center
//         board[row-1][col] = 'x'; //above
//         board[row][col-1] = 'x'; //left
//         board[row][col+1] = 'x'; //right
//         board[row-1][col-1] = 'x'; //above left
//         board[row-1][col+1] = 'x'; //above right
//       }

//       else if (col == 0) { //bottom left
//         board[row-1][col] = 'x'; //above
//         board[row][col+1] = 'x'; //right
//         board[row-1][col+1] = 'x'; //above right
//       }

//       else if (col == board[0].length -1) {
//         board[row-1][col] = 'x'; //above
//         board[row][col-1] = 'x'; //left
//         board[row-1][col-1] = 'x'; //above left
//       }
//     }


//     // return board;
    
//   }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     explodeAllchar(board,'z') will change board to:
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
  */

  //sample board:
    // qqzqq
    // qqqqq
    // qqqzq
    // qqqqq
    // qzqqq

  // Go through each row
  // Go through each column
  // If the character in the position of the row,col is the specific char
  // Explode everything around it (explodeSquare())

  //if it doesn't work...




  //this was Melissa's code:
  // public static void explodeAllChar(char[][] board, char c)
  // {
  //   for (int i=0; i<board.length; i++) {

  //     for (int j=0; j<board[0].length; j++) {
        
  //       if (board[i][j] == c) {
  //         explodeSquare(board,i,j);
  //       }
        
  //     }
      
  //   }
  // }

  //public static void explodeAllChar(char[][] board, char c)
  //{
   //go through each row
    //go through each col
    //if he char is in the positio of the row, col it is the char
    //explode square
    //
  //}


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  //public static void downString( char[][] board, int row, int col, String word )
  //{
    /* YOUR AWESOME CODE HERE */
  //}


  public static void main( String[] args )
  {
    System.out.println("This is buildBoard: ");
    char[][] board1 = buildBoard(5,10,'z');
    printBoard(board1);//this calls the method
    System.out.println("This is copyBoard: ");
    char [][] board2;//initializes the array for board2
    board2 = copyBoard(board1);//machine goes to get the return from board1 (board2 = assigns a value from copy board1 into board2)
    printBoard(board2);
    System.out.println("This is setRow: ");
    setRow(board2, 3, '&');
    printBoard(board2);

    //explodeSquare(board2,1,1); //this uses copyBoard for board2, 1, 1 defines the place
    //printBoard(board2);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}