package n1exercici5;

public class Main {
	static int[] arrayInt = new int[10];
	
	public static void main(String[] args) {
		
		int i = 15;
		int ale = 0;
		
		while(i >= 0) {
			
			try {
				
				arrayInt[i] = getRandom();
				
			} catch(Exception e) {
				
				System.err.println("Error.");
				
			} 
			
			i--;
		}
		
		for (int y : arrayInt) {
			
			System.out.println(y);
			
		}
		
		System.out.println("Bye");
		
	}
	
	public static int getRandom() {
		int number = (int) (Math.random() * 15) + 1;
		boolean found = false;
		for(int i = 0; i < arrayInt.length && !found; i++) {
			if(arrayInt[i] == number) {
				found = true;
			}
		}
		
		return (!found) ? number : getRandom();
	}

}
