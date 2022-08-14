package Package_Java_Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExArraylist {

	public static void main(String[] args) {
		
		// To Create Array List
		List<String> obj= new ArrayList<String>();
		List<Integer> obj1= new ArrayList<Integer>();
		
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		
		// To Add String values to the ArrayList
		obj.add("Jagan");
		obj.add("Singh");
		obj.add("Hari");
		obj.add("Ram");
		obj.add("Ganesh");
		obj.add("Singh");
		obj.add("Raja");
		 System.out.println(obj);
		int size=obj.size();
		System.out.println(size);
		
		 // To fetch the value of an element in a array bases on given index
		String value1=obj.get(0);
		String value2=obj.get(1);
		String value3=obj.get(3);
		System.out.println(value1 + value2 + value3);
		
		// To get the index of the string based on given value
		int value4=obj.indexOf("Ram");
		System.out.println(value4);
		
		// To Find the last index position of the element. If the Search do not matches the result it will return -1
		int value5=obj.lastIndexOf("Singh");
		System.out.println(value5);
		
		//To Copy a String to the another string
		List <String> obj2=new ArrayList<String>();
		obj2.addAll(obj);
		System.out.println(obj2);
		
		// To Delete the Elements of the Array
		//obj1.clear();
		//System.out.println(obj1);
		
		// To Delete the Particular Element from the array using its index value
		 System.out.println(obj1);
		 obj1.remove(2);
		 System.out.println(obj1);
		 // To Remove the element using the value
		// obj.remove("Singh");
		// System.out.println(obj);
		 
		 // Iteration modules
		 
		 // For loop Iterator
		for(int i=0; i<=obj.size()-1;i++) 
		   {
		    String L=obj.get(i);
			System.out.println("This is normal forloop" +L);
			} 
		// ForEach Iterator
		for (String single : obj) 
		   {
			System.out.println("This is For Each Loop"+single);
			}
		 // List Iterator Concept has next
		ListIterator<String> Itlist = obj.listIterator();
		while(Itlist.hasNext()) 
		  {
			System.out.println("This is ListIterator" +Itlist.next());
			
		   } 
		
		// ListIterator<String> Itlist1= obj.listIterator();
		while (Itlist.hasPrevious()) 
		   {
			System.out.println("This is List Iterator Previous" + Itlist.previous());
			
		   }
		// Iterator will have only hasNext, hasPreviuos is not Supported
		Iterator<String> Itled=obj.iterator();
		while(Itled.hasNext()) {
			System.out.println("This is Iterator loop"+Itled.next());
		}
		
				
		
		}
}
		
		
		
		
	

