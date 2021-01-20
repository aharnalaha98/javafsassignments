import java.util.Scanner;
class Employees
{
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int id[]=new int[n];
	String name[]=new String[n];
	double sal[]= new double[n];
	String desg[]=new String[n];
	void input()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("\n Enter id ");
			id[i]=sc.nextInt();
			System.out.println("\n Enter name ");
			name[i]=sc.next();
			System.out.println("\n Enter salary ");
			sal[i]=sc.nextDouble();
			System.out.println("\n Enter designation ");
			desg[i]=sc.next();
		}	
	}
	void sal()
	{
		for(int i=0;i<n;i++)
			sal[i] += 10*sal[i]/100 + 7*sal[i]/100 - 5*sal[i]/100;
	}
	void bonus()
	{
		for(int i=0;i<n;i++)
		{
			if(desg[i].equals("manager"))
			 	sal[i] += sal[i]*15/100;
			else if(desg[i].equals("Manager"))
			 	sal[i] += sal[i]*15/100;
			else if(desg[i].equals("Developer"))
			 	sal[i] += sal[i]*10/100;
			else if(desg[i].equals("developer"))
			 	sal[i] += sal[i]*10/100;
			else
				sal[i] += sal[i]*5/100;
		}
	}
	void display() 
	{
		System.out.println("Total Number of Employees:"+n);
		System.out.println(" ---- Employee Details---- ");
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Employee ID:"+id[i]);
			System.out.println("Name:"+name[i]);
			System.out.println("Salary:"+sal[i]);
			System.out.println("Designation:"+desg[i]);
			System.out.println(" ----------------- ");
		}
	}	
}
class Empdetails
{
	public static void main (String[] args)
	{
		System.out.println("Enter total customer");
		Employees obj=new Employees();
		obj.input();
		obj.sal();
		obj.bonus();
		obj.display();
	}
}
