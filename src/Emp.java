
public class Emp {

	int id;
	
	String name;
	
	Address address;
	
	public Emp(int id,String name,Address address) {
		
		this.id=id;
		
		this.name=name;
		
		this.address=address;
		
	}
	
	void display() {
		
		System.out.println(id+ " " +  name);
		
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		
		Address aadress1=new Address("paoli","PA","USA");
		
		Address address2=new Address("malvern","PA","USA");
		
		Emp emp1=new Emp(11,"yamini",aadress1);
		
		Emp emp2=new Emp(12,"raghu",address2);
		
		emp1.display();
		
		emp2.display();
		
	}
}
