package n1exercici4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> arrayUserName = new ArrayList<>();
	
	public static void main(String[] args) {
		String userName = "", respuesta = "";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nuevo nombre de usuario:");
		userName = sc.nextLine();
		
		try {
			
			System.out.println(examinaUserName(userName));
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String examinaUserName(String userName) throws ShortUserNameError {
		
		String respuesta = "";
		
		if(userName.length() < 6) {
					
			throw new ShortUserNameError("El nombre de usuario debe tener más de 6 caracteres.");
			
		} else {
			
			arrayUserName.add(userName);
			respuesta = "Nombre de usuario creado con éxito.";
			
		}
		
		return respuesta;
	}

}
