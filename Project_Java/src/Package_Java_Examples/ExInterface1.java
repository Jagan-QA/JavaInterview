package Package_Java_Examples;

public class ExInterface1 implements ExInterface {
	
	public static void main(String[] args) {
		
		ExInterface obj =new ExInterface1();
		obj.Employeename();
		obj.Employeeage();
		obj.Employeecompany();
		
	}
@Override
	public void Employeename()
     {
	System.out.println("Employee name is Jagan");
	 }
@Override
	public void Employeeage()
     {
	System.out.println("Employee name is 25");
	 }
@Override
	public void Employeecompany() 
    {
	System.out.println("Employee name is Great Innovus");	
	}

}
