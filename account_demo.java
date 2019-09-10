import java.util.*;
class account
{
	String name;
	String id;
	String acc_type;
	long acc_no;
	double balance;
	
	
	void accept()
	
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter name:");
	name=s.next();
	System.out.println("Enter customer ID:");
	id=s.next();
	System.out.println("Enter type of account:");
	acc_type=s.next();
	System.out.println("Enter account number:");
	acc_no=s.nextLong();
	System.out.println("Enter balance amount:");
	balance=s.nextDouble();
	}
	
	void simple()
	{
		Scanner s= new Scanner(System.in);
		double si;
		float rate;
		int time;
		System.out.println("Enter the rate of interest:");
	    rate=s.nextFloat();
		System.out.println("Enter time period:");
		time=s.nextInt();
		si= (balance*rate*time)/100;
		System.out.println("The simple interest of the amount " +balance+ " = " +si);
	
	}
	
	void display()
	{
		System.out.println("\n\n");
		System.out.println("ACCOUNT DETAILS");
		System.out.println("Name:"+name);
		System.out.println("Customer ID:"+id);
		System.out.println("Account type:"+acc_type);
		System.out.println("Account number:"+acc_no);
		System.out.println("Balance:"+balance);
	}
}
	
	
	class account_demo
	{
		public static void main(String args[])
		{
		int n;
		int i;
		Scanner sc= new Scanner(System.in);
		account a[]=new account[10];
		System.out.println("Enter the number of accounts:");
		n=sc.nextInt();
		for(i=0; i<n; i++)
		{
			System.out.println("Account "+(i+1));
			a[i]=new account();
			a[i].accept();
			a[i].display();
			a[i].simple();
		}
		}
	}
	
	