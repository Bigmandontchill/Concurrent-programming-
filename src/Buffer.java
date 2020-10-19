import java.util.*;

public class Buffer 						//Provides data and operations onto the fixed-length queue
 {     									
  private LinkedList<Object> buf_list;		
  private int elements;						//Number of elements currently on the queue
  private int buf_size;						//Maximum number of elements allowed on queue

  public Buffer(int n)						//Queue creation, with n indicating the maximum capacity
   {
     buf_list = new LinkedList<Object>();
     elements = 0;
     buf_size = n;
   }

  public void add()						//Add element to queue
   {	   	

   }

  public void finalSummation()				
   {								//Calculates the total sum of element value within the buffer
    int sum = 0;
     
    System.out.println("--------------------------");
    System.out.println("Count total: " + sum); 
    System.out.println("--------------------------");
    }
 }	
