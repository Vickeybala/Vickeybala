
public class MethodOverRiding2 extends MethodOverriding {

	public int A () {
		System.out.println("C");
		return 0;
	}
	
	
public static void main(String[] args) {
	MethodOverriding m = new MethodOverRiding2();
	m.A();
}
}
