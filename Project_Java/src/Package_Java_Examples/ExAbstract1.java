package Package_Java_Examples;

public class ExAbstract1 extends ExAbstract {

	public void Student() {
		System.out.println("Student name is Jagan");
	}
    public void School() {
    	System.out.println("School of the Student is KV");
    }
	public static void main(String[] args) {
		ExAbstract obj = new ExAbstract1();
		obj.Student();
		obj.School();
		
	}
	

}
