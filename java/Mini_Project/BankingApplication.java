import java.util.Scanner;
public class BankingApplication{
	public static void main(String args[])
	{
		BankAccount obj1= new BankAccount("ABC","BA0001");
		obj1.showMenu();
	}
}
class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	BankAccount(String cname,String cid)
	{
		customerName=cname;
		customerID=cid;
	}
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previousTransaction= -amount;
		}
	}
	void getPreviousTransaction()
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
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerID);
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