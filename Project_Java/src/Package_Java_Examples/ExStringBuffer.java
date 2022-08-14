package Package_Java_Examples;

public class ExStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Jagan");
		
		// To Reverse the String
		StringBuffer value1=name.reverse();
		System.out.println(value1);
		
		// To Replace the characters by giving the start and end index. Always make sure that the end index will not be considered
		StringBuffer value2=name.replace(0, 3, "Lio");
		System.out.println(value2);
		
		// To Remove the characters form the String based on the given start index and end index
		StringBuffer value3=name.delete(0, 3);
		System.out.println(value3);
		
		// To Insert the character based on the given index
		StringBuffer value4=name.insert(0, "F");
		System.out.println(value4);
		
		// To Find the Capacity of the StringBuffer
		int cap=name.capacity();
		System.out.println(cap);
	
		// Like String we have Substring, length, and ChartAt methods as well in String Buffer

}
	}
