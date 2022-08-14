package Package_Java_Examples;



public class ExString {

	public static void main(String[] args) {
		
		String name ="Jagan";
		String School= "       Kendriya Vidyalaya      ";
		int a=27;
		// Methods of String
		
		//To fetch the character with the given index
		char charc=name.charAt(0);
		System.out.println(charc);
		
		//To Fetch the index of the character with the given char
		int index=name.indexOf("a");
		System.out.println(index);
		
		//To find the Character specified from index position
		int index1=name.indexOf("n", 1);
		System.out.println(index1);
		
		// To find the length of the String
		int length =name.length();
		System.out.println(length);
		
		//To Check the Equaltiy of the String
		boolean value =name.equals("jagan");
		System.out.println(value);
		
		// To Check the Equaltiy without Case Sensitive
		boolean value1 =name.equalsIgnoreCase("JAGAN");
		System.out.println(value1);
		
		// To check Whether the String is Empty
		boolean value2 =name.isEmpty();
		System.out.println(value2);
		
		// To check whether the give character contains in the string
		boolean value3=name.contains("Jag");
		System.out.println(value3);
		
		// To fetch the particular portion of the String. Start index is 0 and End index is 3. Always the end index will not be considered
		String value4=name.substring(0,3);
		System.out.println(value4);
		
		//To (append) concatenate the String to the existing string
		String value5=name.concat("Singh");		
		System.out.println(value5);
		
		// To Replace the Existing Character with the Given Character.
		String value6=name.replace("a", "J");
		System.out.println(value6);
		//Replaces the Sequence of Character
		String value7=name.replace("Jagan", "Lion");
		System.out.println(value7);
		
		// To Trim the White Spaces of the String
		String Trimmed=School.trim();
		System.out.println(Trimmed);
		System.out.println(School);
		
		//To convert the given data type into String
		String gem=String.valueOf(a);
		System.out.println(gem);
		
		// To Convert the given string to Upper-case
		String value8=name.toUpperCase();
		System.out.println(value8);
		
		// To Convert the given string to the Lower-Case
		String value9=name.toLowerCase();
		System.out.println(value9);
		
		// To Join the String with the Given Delimiter
		String value10=String.join("/", "27", "05", "1997");
		System.out.println(value10);
		
		// To Split the String
		String Question ="Am, I, Teaching, Good?";
		String[] Splitted_Words=Question.split(",");
		
		for (String obj : Splitted_Words) {
			System.out.println(obj);
			
		
			
		}
		
		
		
		
		
	}

}
