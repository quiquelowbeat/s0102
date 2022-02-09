package n1exercici2;


public class Main {

	public static void main(String[] args) {
		
		String x = null;
		
		try {
		
			System.out.println(x.length());
		
		} catch(NullPointerException e) {
			
			System.err.println(e);
		}
	}

}
