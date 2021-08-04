package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1=new Developer(101,"James Gosling","JDBC");
		Developer d2=new Developer(105,"Rod Jhonson","Spring Framework");
		
		Accountant a1=new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant a2=new Accountant(205,"Mary John","Payment to Vendors","Tally");
		
		d1.display(); // child class object invokes parent class method
		d1.display1(); // child class object invoke child class method
		
		d2.display();
		d2.display1();
		
		// invoke Accountant class methods
		a1.display();
		a2.display();

	}

}
