package n3exercici2;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		FailingConstructor f = null;
		
		try {
			
			f = new FailingConstructor();
			
			
		} catch(StringIndexOutOfBoundsException e) {
			
			System.err.println("Error al crear el objeto FailingConstructor.");
			
		} finally {
			
			if(f == null) {
				
				System.out.println("Objeto null debido a error.");
			
			}
			
		}
		
		
		
	}
	
	

}
