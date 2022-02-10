package n2exercici2;

public class ThrowException {
	
	public static void f() {
		
		try {
			
			g();
			
		} catch(RuntimeException e) {
			
			throw new ArithmeticException("Exception method f()");
			
		}
		
	}
	
	public static void g() {
		
		throw new ArrayIndexOutOfBoundsException();
		
	}

}
