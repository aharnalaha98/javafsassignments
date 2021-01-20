import java.util.Scanner;
class Address
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int street_no[]= new int [n];
	String city[]= new String[n];
	String state[]= new String[n];
	int pin[]= new int[n];
	void readadd()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("\n Enter Street_no: ");
			street_no[i]=sc.nextInt();
			System.out.println("\n Enter city: ");
			city[i]=sc.next();
			System.out.println("\n Enter state ");
			state[i]=sc.next();
			System.out.println("\n Enter pin: ");
			pin[i]=sc.nextInt();
		}	
	}
	void disadd()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(" ----------------- ");
			System.out.println("Street No.:"+street_no[i]);
			System.out.println("City:"+city[i]);
			System.out.println("State:"+state[i]);
			System.out.println("Pincode:"+pin[i]);
			System.out.println(" ----------------- ");
		}
	}
}
class Employee
{
	
	Scanner sc= new Scanner(System.in);
	Address add=new Address();
	int n=sc.nextInt();
	int id[]=new int[n];
	String name[]=new String[n];
	double sal[]= new double[n];
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
			
		}	
	}
	void sal()
	{
		for(int i=0;i<n;i++)
			sal[i] += 10*sal[i]/100 + 7*sal[i]/100 - 5*sal[i]/100;
	}
	void display() 
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(" ----------------- ");
			System.out.println("Employee ID:"+id[i]);
			System.out.println("Name:"+name[i]);
			System.out.println("Salary:"+sal[i]);
			System.out.println(" ----------------- ");
		}
	}	
}
class Manager extends Employee
{
	int n;
	void readmgr()
	{
		System.out.println("\n Enter total no. of employees: ");
		n=sc.nextInt();
		add.readadd();
		
	}
	void dismgr()
	{
		add.disadd();
		System.out.println("Total no. of Employees:"+n);
	}	
}
class Programmer extends Employee
{
	String project_name[]=new String[n];
	void readprg()
	{
		add.readadd();
		for(int i=0;i<n;i++)
		{
			System.out.println("\n Enter Project Name: ");
			project_name[i]=sc.next();
		}
	}
	void disprg()
	{
		add.disadd();
		for(int i=0;i<n;i++)
		{
			System.out.println("Project Name:"+project_name[i]);
			System.out.println(" ----------------- ");
		}
	}
}
class EmployeeTest
{
	public static void main (String[] args)
	{
		System.out.println("Manager Details");
		Manager mgr=new Manager();
		mgr.input();
		mgr.readmgr();
               	System.out.println("Programmer Details");
		Programmer prg= new Programmer();
		prg.input();
		prg.readprg();
		mgr.sal();
		prg.sal();
                mgr.display();
		System.out.println(" ----------------- ");
		prg.display();
		mgr.dismgr();
		prg.disprg();
		//DISPLAY MANAGER AND PROGRAMMER DETAILS
	}
}
