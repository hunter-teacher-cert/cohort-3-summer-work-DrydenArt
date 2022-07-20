import java.io.*;
import java.util.*;

/*

Sort Project:

+Done: Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

+Done: Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    //defualt constructor: populate the ArrayList with 15 random numbers ranging from 0 to 19. [4, 18, 12, 9, 0, 12, 9, 9, 8, ]
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < 15 ; i++){
    	    data.add(r.nextInt(20)); //random integers from 0 to 19. 
	    }
	
    }

    //overloaded constructor(with parameters): populate the ArrayList with given number(size) of random numbers ranging from 0 to 19.
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < size; i++){
    	    data.add(r.nextInt(20));
	    }
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,2,       10,6,8
      findSmallestIndex(2);
      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    //we don't need the int currSmall if we want to shorten code
    public int findSmallestIndex(int start){
    	int smallIndex = start;
      int currSmall = this.data.get(start); //instantiate another variable to hold the current smallest value
    	//iterate through the ArrayList starting from start to this.data.size()
      for(int i = start; i < data.size(); i++){
        if(data.get(i) < currSmall){
          currSmall = data.get(i);
          smallIndex = i;
        }
      }
      //compare each item with the current smallest value and update the current smallest value 
    	return smallIndex;//at this point, it will only return the index of the smallest value, not move it
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
    public void sort()//can we call findSmallestIndex?
  {//iterate through the data starting at zero go sto the end
    for(int i = 0; i < data.size(); i++)
      {
        int temp = data.get(i);//stores the value at index
        int minIndex = findSmallestIndex(i);//calls fSI method and assigns the smallest index to minIndex variable
        data.set(i, data.get(minIndex));
        
        int temp = dataList.get(index1);//stores the value at index1
      dataList.set(index1, dataList.get(index2));//moves the value from index2 to index1
      dataList.set(index2, temp1);//moves the stored value of index1 to index2
      }
      


    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	
	
	return 0; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

	return 0;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
