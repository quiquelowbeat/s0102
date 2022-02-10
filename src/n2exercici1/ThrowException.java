package n2exercici1;

public class ThrowException {
	
	public static void f() {
		
		try {
			
			g();
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			throw new ArithmeticException("Exception method f()");
			
		}
		
	}
	
	public static void g() {
		
		throw new ArrayIndexOutOfBoundsException();
		
	}

}
