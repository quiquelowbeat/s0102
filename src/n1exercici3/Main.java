package n1exercici3;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayTest = new int[3];
		
		try {
			for (int i = 0; i <= arrayTest.length; i++) { // Aquí forço el error amb el =
				
				arrayTest[i] = (int) (Math.random() * 10);
				
			}
			
			for(int j : arrayTest) {
				
				System.out.println(j);
				
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {	
			
			System.out.println(e.getClass().getName() + ": te has pasado de índice, revisa tu código :)");
			
		} finally {
			
			System.out.println("Bye.");
			
		}

	}

}
