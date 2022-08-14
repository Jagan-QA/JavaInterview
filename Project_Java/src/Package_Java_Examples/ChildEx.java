package Package_Java_Examples;

public class ChildEx extends InheritanceEx{
	{
		
    Bike="Classic 350";
    Engine="Royal Enfield";
    Wheels=2;
    Speed="110 KM/HR";
    }
	@Override
	protected int bikefeature(int a, int b) {
		
		int c=a-b;
		System.out.println("Suma difference is:"+c);
	    return c;
		}
	

	public static void main(String[] args) {
		
		InheritanceEx Obj1 = new ChildEx();
		Obj1.bikefeature();
		Obj1.bikefeature(3,1);
		
		}

}
