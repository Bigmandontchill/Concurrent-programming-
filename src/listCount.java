import java.util.*;

public class listCount {

public static void main(String[] args)
  {
   int num_users = 0;
   int elements = 0;
   int bufferSize = 0;
		
   System.out.println("Enter number of users:");			//Specify number of users			
  			
   System.out.println("Enter number of elements per user:");		//Specify number of elements submitted per user	
     
   Buffer b; 	
   b = new Buffer(bufferSize);						//Create buffer
	
   //Create X users that will concurrently add elements to the Buffer object b
   //This can be performed by using an add() method within the Buffer class that needs to be completed.
   
   b.finalSummation();							//Calculate SUM of elements in buffer
  }
}

