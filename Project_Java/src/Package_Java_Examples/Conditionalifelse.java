package Package_Java_Examples;

public class Conditionalifelse {

	public static void main(String[] args) {
	
		 int age =27;
		 String name="Singh";
	
		 //if  Ladder
		 if(age==23)
		 {
			 System.out.println("Exact match is not Found");
		 }
		 else
		 {
			 System.out.println("Age is Leass then or equal to 27 ");
		 }
		 // if else-if ladder
		 if(name.equals("singh"))
		 {
			 System.out.println("Exact match is not Found");
		 }
		 else if(name.equalsIgnoreCase("SINGH"))
		 {
			 System.out.println("Partial match is Found");
		 } 
		 else
		 {
			 System.out.println("No value is found from this ladder");
		 }

	}

}
