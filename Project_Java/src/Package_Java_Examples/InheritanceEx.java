package Package_Java_Examples;

public class InheritanceEx {
	
	public String Bike ="FZ";
	int Wheels=2;
	String Speed="Max_110Km/hr";
	String Engine="YAMAHA";
	

	 protected void bikefeature()
		{
			System.out.println("Your Bike name is:"+ Bike);
			System.out.println("Your Bike has:"+ Wheels+"Wheels");
			System.out.println("Your Bike Engine is:" +Engine);
			System.out.println("Maximum speed achive in your bike is:"+ Speed);
		}
	 protected int bikefeature(int a, int b)
	  {
	    int c=a+b;
	    System.out.println("Suma Value is:"+c);
		return c;
	  }
	 static void additional() {
		 System.out.println("J");
		 
	 }
		
	public static void main(String[] args) {
	
	InheritanceEx obj = new InheritanceEx();
	//Method Overloading
	obj.bikefeature();
	obj.bikefeature(1,2);
	obj.additional();
	
		 
	}
}