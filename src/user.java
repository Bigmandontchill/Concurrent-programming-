import java.util.*;
public class user
 {								
  private int id;
  private int num_elements;
  public static Buffer buf;
		  
  public user(int i, int el, Buffer b)	        			//User arguments: User ID, number of elements to add, and buffer
		  {id = i; num_elements = el; buf = b}
  
  public add_elements()
   {   										//Add element to buffer, element value iterates from 0, 1, 2 .... num_elements
	int n = 0;
	while (num_elements > 0)
         {						
	   buf.add(new Integer(n));							
	   n++;
	   num_elements--;
	 }			
   }
  }  