package newfeatures;
interface hello
{
	void welcome();
}

public class MethofReferenceDemo {
	
	public static void display()
	{
		System.out.println("Hello from Method Reference");
	}

	public void print()
	{
		System.out.println("Instance Method call using Method reference");
	}
	MethofReferenceDemo()
	{
		System.out.println("In Constructor");
	}
	public static void main(String[] args) {
		
		hello h=MethofReferenceDemo::display; // invoke static method
		h.welcome();
		
		MethofReferenceDemo d1=new MethofReferenceDemo();
		hello h1=d1::print; // invoke instance method
		h1.welcome();
		
		hello h2=MethofReferenceDemo::new; // method reference to constructor
		h2.welcome();
	}

}
