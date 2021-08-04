package oopsdemo1;

class Test
{
	

	public void finalize()  // override finalize() method of Object class
	{
		System.out.println("Object Destroyed & Garbage Collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1=new Test();  // intialise Object -- call default constructor
		Test t2=new Test();
		
		t1=null;   // de allocate memory
		t2=null;
		
		System.gc();// invoke service method gc() -- > invoke finalize()
		
		System.out.println("In Main Method");
		
		

	}

}
