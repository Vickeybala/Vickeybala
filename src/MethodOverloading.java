
public class MethodOverloading {
		
		public int A (int a, int b) {
			System.out.println("AB");
			return b;
		}
		
		public int B (int c) {
			System.out.println("C");
			return c;	
	}
		public static void main(String[] args) {
			MethodOverloading m = new MethodOverloading();
			m.A(1, 2);
			m.B(2);
		}
}