package Package_Java_Examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EXLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> obj = new LinkedList<Integer>();
		
		// Adding a Element
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(5);
		System.out.println(obj);
		
		 // To add Element at first
		  obj.addFirst(2);
		  System.out.println(obj);
		 int value5= obj.indexOf(2);
		 System.out.println(value5);
		 
		 // To add Element at Last
		 obj.addLast(7);
		 System.out.println(obj);
		 
		 // To copy a array to new array
		  LinkedList <Integer> obj1=new LinkedList <Integer>();
		  obj1.addAll(obj);
		  System.out.println(obj1);
		
		// To find size
		int value1=obj.size();
		System.out.println(value1);
		
		// To find the index using its value
		 int value2=obj.indexOf(5);
		 System.out.println(value2);
		 //To Find the Last occurrence of the element using its index
		 int value3=obj.lastIndexOf(5);
		 System.out.println(value3);
		 
		// To get the value of the Element using its integer
		 int value4=obj.get(3);
		 System.out.println(value4);
		 // To Get the First Element 
		 int value6=obj.getFirst();
		 System.out.println("First"+value6);
		 // To Get last
		 int value7=obj.getLast();
		 System.out.println(value7);
		 
		 // To Delete the Element element using index
	    obj.remove(0);
	    System.out.println(obj);
	
	    obj1.removeLastOccurrence(7);
	    System.out.println(obj1);
	    
	    LinkedList <Integer> obj2= new LinkedList <Integer>();
	    obj2.add(1);
	    obj2.add(3);
	    obj2.add(5);
	    obj2.add(7);
	    obj2.add(5);
	    
	    //System.out.println(obj2);
	    
	    // For Iteration
	  
	    for(int i=0; i<=obj2.size()-1; i++) 
	    {
	    if(obj2.get(i)==5) 
	    {
	    obj2.remove(i);
	    }
	   // System.out.println(obj2.get(i));
	    System.out.println(obj2);
	    }
	    
	    
	    // ForEach Iteration
	    
	    for (Integer val : obj) 
	    {
	    	System.out.println(val);
	    }
	    
	   // Iterator
	   
	     Iterator<Integer> Led= obj.iterator();	   
	     while(Led.hasNext()) 
	     {
	    	
	    	 System.out.println("Iterator"+Led.next());
	     }
	  
	     ListIterator<Integer> Led1=obj.listIterator();
	     while(Led1.hasNext())
	     {
	    	 System.out.println(Led1.next());
	     }
	     while(Led1.hasPrevious())
	     {
	    	 System.out.println(Led1.previous());
	     }
	    
	 }

}
