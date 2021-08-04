package oopsdemo3;

class Test
{
	int a; // default variable
	private int b; // private variable
	protected int c; // acessed in sub class
	public int d;
		
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d=500;
	}

	public void display()  // public method
	{
		System.out.println("Private Variable:"+b);
	}
}

class Test2 extends Test
{

	public Test2(int a, int b, int c) {
		super(a, b, c);
		
	}
	public void display()  // public method
	{
		System.out.println("Protected Variable:"+c);
	}
	
}
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(100,200,300);
		t1.display();
		// t1.b=50; compiler error. cant access private variable
		System.out.println("Defaut Variable :"+t1.a);

	}

}
