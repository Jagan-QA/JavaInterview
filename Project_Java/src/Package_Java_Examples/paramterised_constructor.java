package Package_Java_Examples;

//With this program we will learn about Parameterized Constructor and Constructor Overloading
/*
 (i) Class name and Constructor name should be the same
 (ii) In Constructor Overloading  method name Should be same, We can differentiate by passing the Arguments
 */
 public class paramterised_constructor {

	  int EngineCC;
	  int EngineHp;
	  String Bike_name;
	
	  paramterised_constructor(String Model_name)
	  {
	   this.Bike_name= Model_name;
	  }
	  paramterised_constructor (int a, int b)
		{
	   this.EngineCC=a;
	   this.EngineHp=b;
	   }
	
	 public void Sayabout()
	 {
		
		 System.out.println("Your Bike CC is"+EngineCC);
		 System.out.println("Your Bike Hp is"+EngineHp);
	 }
	 
	 public void Sayname()
	 {
		 System.out.println("Your Model is"+Bike_name);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		
		paramterised_constructor Classic = new paramterised_constructor(350,20);
		paramterised_constructor Model = new paramterised_constructor("Classic 350");
		Model.Sayname();
		Classic.Sayabout();
		
	}

}