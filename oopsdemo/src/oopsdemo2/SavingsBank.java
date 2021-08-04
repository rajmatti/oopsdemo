package oopsdemo2;

public class SavingsBank extends Account  // Child class of Account
{
	private int min_bal; // can access only within the class
	protected int  balance;  // can access within the class & in the sub class
	
	public SavingsBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;
		
	}
	
	void display()
    {
            super.display(); // invoke acc
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
	
}
