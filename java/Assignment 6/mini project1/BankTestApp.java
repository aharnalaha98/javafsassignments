package com.service.bean;
import java.util.Scanner;

import com.service.MyBank;
public class BankTestApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Bank Application");
		Scanner sc=new Scanner(System.in);
		String name;
		boolean value=true;
		int accno, toaccno,amount;
		MyBank mybank=new MyBank();
		do
		{
			System.out.println("1.Create Account");
			System.out.println("2.Check Account Balance");
			System.out.println("3.Withdraw ");
			System.out.println("4.Deposit");
			System.out.println("5.Transfer");
			System.out.println("6.Exit ");
			int option= sc.nextInt();
			
			switch(option)
			{
				case 1:
						System.out.println("1.Default Account");
						System.out.println("2.General Account");
						int a=sc.nextInt();
						switch(a)
						{
							case 1:	
									mybank.accountcreate();
									break;
							case 2:	
									System.out.println("Enter Name:");
									name=sc.next();
									System.out.println("Enter amount:");
									amount=sc.nextInt();
									mybank.accountcreate(name,amount);
									break;
							default:
									System.out.println("Invalid Choice.");
						}
				case 2: 
						System.out.println("For Check Balance");
						System.out.println("Enter Account Number:");
						accno=sc.nextInt();
						mybank.checkbalance(accno);
						break;
				case 3: 
						System.out.println("Withdraw Money");
						System.out.println("Enter Account Number:");
						accno=sc.nextInt();
						System.out.println("Enter Amount:");
						amount=sc.nextInt();
						mybank.withdraw(accno,amount);
						break;
				case 4: 
						System.out.println("Deposit Money");
						System.out.println("Enter Account Number:");
						accno=sc.nextInt();
						System.out.println("Enter Amount:");
						amount=sc.nextInt();
						mybank.deposit(accno,amount);
						break;
				case 5:	
						System.out.println("Transfer Money");
						System.out.println("Enter Your Account Number:");
						accno=sc.nextInt();
						System.out.println("Enter Account Number to be transfered:");
						toaccno=sc.nextInt();
						System.out.println("Enter Amount to be transfered:");
						amount=sc.nextInt();
						mybank.transfer(accno,toaccno,amount);
						break;
				case 6:	
						System.out.println("Thank you for using this bank");
						value=false;
						break;
				default:
						System.out.println("invalied choice.");
			}
		}
		while(value);
	}

	

}












package com.service;
import com.bean.Account;
abstract class AccountInitialization {
	public static int accountcount=0,accountcount1=0,i=0,j=0;
	public static int accno=1000; 
	public int accno1=1010;
	public String name;
	public int amount;
	public Account accounts[]=new Account[10];
	public void accountcreate()
	{
		if(accountcount<10)
		{
			name="Unknown";
			amount=500;
			accounts[i]=new Account(accno,name,amount);
			accno++;
			i++;
			accountcount++;
		}
		else
		{
			accountcount1=1;
			System.out.println("Account Limit exceed.");
		}
	}
	
	public void accountcreate(String name,int amount)
	{
		if(accountcount1<10)
		{
			if(amount>500)
			{
				this.name=name;
				this.amount=amount;
				accounts[j].setaccno(this.accno1);
				accounts[j].setname(this.name);
				accounts[j].setamount(this.amount);
				System.out.println("Name="+accounts[j].getname());
				System.out.println("Account Number="+accounts[j].getaccno());
				System.out.println("Amount="+accounts[j].getamount());
				accountcount1++;
				accno1++;
				j++;
			}
			else
			{
				System.out.println("Amount should be greater than 500.");
			}
		}
		else
		{
			System.out.println("Account Limit exceed.");
		}
	}
	abstract void transfer(int fromaccno,int toaccno,int amount);

}
@SuppressWarnings("serial")
class MyException extends Exception {
	MyException()
	{
		super();
	}
	MyException(String msg)
	{
		super(msg);
	}
}














package com.service;

public interface Bank {
	void withdraw(int accno,int amount);
	void deposit(int accno,int amount);
	void checkbalance(int accno);
}










package com.service;

import com.service.MyBank.accountcreate;

@SuppressWarnings("unused")
public class MyBank extends AccountInitialization implements Bank{

	public class accountcreate {

	}
	public void transfer(int fromaccno, int toaccno,int amount)
	{
		if(accountcount!=0)
		{
			for(i=0;i<10;i++)
			{
				try
				{
				if(accounts[i].getaccno()==fromaccno)
				{
					for(int j=0;j<10;j++)
					{
						try
						{
							if(accounts[j].getaccno()==toaccno)
							{
								if(accounts[i].getamount()-amount>500)
								{
									accounts[i].setamount(accounts[i].getamount()-amount);
									accounts[j].setamount(accounts[j].getamount()+amount);
									break;
								}
								else
								{
									System.out.println("Minimum balance 500 should be maintained.");
								}
							}
							throw new MyException("Sender Account number not matched");
						}
						catch(MyException e)
						{
							System.out.println(e.toString());
							break;
						}
					}
					break;
				}
				throw new MyException("Receiver Account number not matched");
			}
			catch(MyException e)
			{
				System.out.println(e.toString());
				break;
			}
		}
	}
	else
	{
		System.out.println("Account is not created. First create your account ");
	}
}
	
@SuppressWarnings("unused")
public void withdraw(int accno1,int amount1)
{
	if(accountcount!=0)
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				if(accounts[i].getaccno()==accno1)
				{
					if((accounts[i].getamount()-amount1)>500)
					{
						accounts[i].setamount(accounts[i].getamount()-amount1);
						System.out.println("Amount Withdrawn successfully...");
						break;
					}
					else
					{
						System.out.println("Minimum balance 500 RS. should be maintained.");
					}
				}
				throw new MyException("Account mismatched");
			}
			catch(MyException e)
			{
				System.out.println(e.toString());
				break;
			}
		}
	}
	else
	{
		System.out.println("Account is not Created. First create your account .");
	}
}
@SuppressWarnings("unused")
public void deposit(int accno1, int amount1)
{
	if(accountcount!=0)
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				if(accounts[i].getaccno()==accno1)
				{
					if(amount1<50000)
					{
						accounts[i].setamount(accounts[1].getamount()+amount1);
						System.out.println("Amount Deposited successfully....");
					}
					else
					{
						System.out.println("Amount is more than 50000. You cannot deposit more than 50000.");
						break;
					}
				}
				throw new MyException("Account mismatch");
			}
			catch(MyException e)
			{
				System.out.println(e.toString());
				break;
			}
		}
	}
	else
	{
		System.out.println("Account is not created. First create your account ");
	}
}
@SuppressWarnings("unused")
public void checkbalance(int accno1)
{
	if(accountcount!=0)
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				if(accounts[i].getaccno()==accno1)
				{
					System.out.println("Available Balance:"+accounts[i].getamount());
					break;
				}
				throw new MyException("Account mismatch");
			}
			catch(MyException e)
			{
				System.out.println(e.toString());
				break;
			}
		}
	}
	else
	{
		System.out.println("Account is not Created. Create your account first.");
	}
}	

}







package com.bean;

public class Account {
	private int accno;
	private String name;
	private int amount;
	public Account(int accno, String name, int amount)
	{
		this.accno=accno;
		this.name=name;
		this.amount=amount;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaccno(int accno)
	{
		this.accno=accno;
	}
	public void setamount(int amount)
	{
		this.amount=amount;
	}
	public String getname()
	{
		return name;
	}
	public int getaccno()
	{
		return accno;
	}
	public int getamount()
	{
		return amount;
	}

}

