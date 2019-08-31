
public class MyCalculations extends Calculations{
	
	public void multipilcation(int x,int y) {
		
		z = x* y ;
			
			System.out.println("The multiplication of two numbers is :" +z);
		
	}

	public static void main(String[] args) {
		
		int x=20;int y=10;
		
		MyCalculations demo = new MyCalculations();
		
		demo.addition(x, y);
		
		demo.subtraction(x, y);
		
		demo.multipilcation(x, y);
		
	}
}
