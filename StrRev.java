package javaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class StrRev {

	public static void main(String[] args) {
		
		
		/* We can Reverse a String in 3 approaches
		 * (i) Using String Buffer or String Builder 
		 * (ii) We can write our own logic
		 * (iii) We can use ArrayList
		 */
	/*	
		// Approach 1
		
		String name = "Jagan";
		StringBuilder obj = new StringBuilder(name);
        System.out.println(obj.reverse());
		
        // Approach 2
        //We need to use Charracter array 
         
           char [] CharArray= name.toCharArray();
           int Charlength =CharArray.length;
           System.out.println(Charlength);
           System.out.println(name.length());
           
            String Reversed="";
            for(int i=CharArray.length-1; i>=0; i--)
            {
            	Reversed = Reversed+CharArray[i];
               System.out.println(Reversed);
            }
            */
       // We can use Array list also
		String name = "Jagan";
            char [] arr1 = name.toCharArray();
           List<Character> obj1= new ArrayList<Character>();
           System.out.println(arr1.length);
           System.out.println(arr1.length-1);
            for(int k=arr1.length-1; k>=0; k--)
            {
            	obj1.add(arr1[k]);
            	System.out.println(obj1);
            }
            ListIterator<Character > obj2 =  obj1.listIterator();
            while(obj2.hasNext()) {
            	System.out.println(obj2.next());
            }
            System.out.println(obj2.toString());
            
           
	
           }
	       }
// Thease are the approach for String to be reversed
