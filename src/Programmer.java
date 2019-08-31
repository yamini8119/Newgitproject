public class Programmer extends Employee{
	
	int bonus = 10000;
	
	public static void main(String[] args) {
		
		Programmer s = new Programmer();
		
		System.out.println("Programmer salary : " + s.salary);
		
		System.out.println("Programmer bonus : " + s.bonus);
	}
	
	
}