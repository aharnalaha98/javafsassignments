import java.util.Scanner;
abstract class AccountInitialization
{
	static int accountCount=0;
	Account accounts[]= new Account[10];
	int accountNumber=1010;
	void accountCreate()
	{
		for (int i=0; i<10;i++)
		{
			accountNumber += 1;
		}
		String name="Unknown";
		double amount=500;
		Account ac =new Account(accountNumber,"Unknown",500);
		accounts(accountCount);
		accountCount++;
	}
	void accountCreate(String name,double amount)
	{
		for (int i=0; i<10;i++)
		{
			accountNumber += 1;
		}
		if (amount>500)
		{
			this.accountNumber=accountNumber;
			this.name=name;
			this.amount=amount;
			Account acc=new Account(accountNumber);			//problem
		}
	}
	void setValue(int accountNumber,String name,double amount)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.amount=amount;
		accounts(accountCount);
		accountCount++;
	}
	abstract void transfer();
		
}
interface Bank
{
	
	double balance=500;
	double previousTransaction=0;
	String name=null;
	int accountNumber=0;
	
	abstract void withdraw(int accountNumber,double ammount);
	
	abstract void deposit(int accountNumber,double ammount);
	
	abstract void getPreviousTransaction(int accountNumber);
	
}
class Account
{
	private int accountNumber;
	private String name;
	private double amount;
	Account()
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.amount=amount;
	}
	void setValue(int accountNumber,String name,double amount)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.amount=amount;
	}
	void getValue()
	{
				//problem 
	}	
}
class MyBank extends AccountInitialization implements Bank
{
	double balance=500;
	double previousTransaction;
	String name;
	int accountNumber;
	double amount;
	void transfer(int fromaccno,int toaccno,double amount)
	{
		if (amount>0)
		{
			System.out.println("Transfer Done");
		}
	}

	void withdraw(int accountNumber,double ammount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previousTransaction= -amount;
		}
	}
	void deposit(int accountNumber,double ammount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
		else if(amount>=50000)
		{
			System.out.println("Cannot deposit more than 50000");
		}
		else
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
		
	}
	void getPreviousTransaction(int accountNumber)
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited:"+previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn:"+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction occured");
		}
	}
	void showMenu()
	{
		int option;
		Scanner sc= new Scanner (System.in);
		System.out.println("Welcome "+name);
		System.out.println("Your Account Number is "+accountNumber);
		System.out.println("\n");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Previous Transaction");
		System.out.println("5.Exit");
		do
		{
			System.out.println("---------------------------");
			System.out.println("Enter an option");
			System.out.println("---------------------------");
			option=sc.nextInt();
			System.out.println("\n");
			switch(option)
			{
				case 1:
				{
					System.out.println("---------------------------");
					System.out.println("Balance = "+balance);
					System.out.println("---------------------------");
					System.out.println("\n");
					break;
				}
				case 2:
				{
					System.out.println("---------------------------");
					System.out.println("Enter an amount to deposit:");
					System.out.println("---------------------------");
					int amount=sc.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
				}
				case 3:
				{
					System.out.println("---------------------------");
					System.out.println("Enter an amount to withdraw :" );
					System.out.println("---------------------------");
					int amount2=sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				}	
				case 4:
				{
					System.out.println("---------------------------");
					getPreviousTransaction();
					System.out.println("---------------------------");
					System.out.println("\n");
					break;
				}
				case 5:
				{
					System.out.println("****************************");
					break;
				}
				default:
				{
					System.out.println("Invalid Option!! Please enter again");
					break;
				}
			}
		
		}
		while(option !=5);
			System.out.println("Thank You !!");
	}
}
public class BankTest
{
	public static void main(String args[])
	{
		MyBank obj1= new MyBank();
		obj1.showMenu();
	}
}