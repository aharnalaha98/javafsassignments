package com;

public class Account {
	private int Account_no=0;
	private String Name=null;
	private float Amount=0.0f;
	

	public Account( int Account_no, String Name, float Amount)
	{
		this.Account_no = Account_no;
		this.Name = Name;
		this.Amount = Amount;
	}


	public void setAccno(int Account_no)
	{
		this.Account_no = Account_no;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public void setAmount(float Amount)
	{
		this.Amount = Amount;
	}

	public int getAccount_no()
	{
		return Account_no;
	}
	public String getName()
	{
		return Name;
	}
	public float getAmount()
	{
			return Amount;
	}


	

}
