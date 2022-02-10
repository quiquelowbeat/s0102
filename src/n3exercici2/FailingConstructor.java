package n3exercici2;

public class FailingConstructor {
	
	private String name = "";
	private int num;
	
	public FailingConstructor() throws StringIndexOutOfBoundsException {
		
		this.name = "Constructor fallit";
		this.num = 121; 
		
		throw new StringIndexOutOfBoundsException();
	
	}
	
	public String getInfo() {
		return this.name + " " + this.num;
	}

}
