package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	
	ConstructorDemo()  // Implicit Constructor
	{
		System.out.println("Iam Default Constructor");
		id=0;
		name="";
		salary=5000.00f;
	}
	
	void display()
	{
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo(); // invokes implicit Constructor
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
		
		cd1.display();
	}

}

/*int a; //variable declaration

int a=10; // variable declaration & initialisation

int a(); //method declaration*/



