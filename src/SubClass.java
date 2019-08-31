
public class SubClass extends SuperClass{
	
	int num = 20;
	
	public void display() {
		
		System.out.println("this method is in sub class");
		
	}
	
	public void my_Method() {
		
		SubClass Sub = new SubClass();
		
			Sub.display();
			
			System.out.println("the variable num in sub class is var : "+ Sub.num);
			
			super.display();
			
			System.out.println("the variabler num in super class is var : "+  super.num);
			
	}
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		
		obj.my_Method();
	}

}
