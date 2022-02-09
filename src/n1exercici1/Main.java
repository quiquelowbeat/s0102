package n1exercici1;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		 ArrayList<String> arrayCities = new ArrayList<>();
		 
		 arrayCities.add("Barcelona");
		 arrayCities.add("Lisboa");
		 arrayCities.add("Sevilla");
		 arrayCities.add("Manchester");
		 
		 PrintWriter out = null;
		 
		 try {
			 out = new PrintWriter(new File ("src/test/Cities.txt")); // Si modifico l'arrel del directori, salta l'error del catch.
			 for(String c : arrayCities) {
				 out.println(c);
			 }
		 } catch(IOException e) {
			 System.err.println("IOException: no se encuentra el directorio");
		 } finally {
			 if (out != null) {
				 System.out.println("Programa finalizado con éxito.");
				 out.close();
			 } else {
				 System.out.println("Saliendo del programa.");
			 }
			 
		 }

	}

}
