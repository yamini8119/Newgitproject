
public class Keyword extends SuperKey{

	Keyword(int age) {
		
		super(age);
		
	}
	public static void main(String[] args) {
		
		Keyword key = new Keyword(20);
		
		key.getAge();
	}

	
}
