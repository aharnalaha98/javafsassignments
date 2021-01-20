import java.util.*;
class Employeedetails
{
	int n;
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter total coustomer");
		int n=sc.nextInt();
		int id[]=new int[n];
		String name[]=new String[n];
		double sal[]= new double[n];
		String desg[]=new String[n];
		for(int i=0;i<n;i++)
		{	

			System.out.println("\n Enter desg ");
			desg[i]=sc.next();
			System.out.println("\n Enter name ");
			name[i]=sc.next();
			System.out.println("\n Enter id ");
			id[i]=sc.nextInt();
			System.out.println("\n Enter sal ");
			sal[i]=sc.nextDouble();
		}
 		for(int i=0;i<n;i++)
			sal[i] += 10*sal[i]/100 + 7*sal[i]/100 - 5*sal[i]/100;
		for(int i=0;i<n;i++)
		{
			if(desg[i].equals("Manager"))
			 	sal[i] += sal[i]*15/100;
			else if(desg[i].equals("manager"))
			 	sal[i] += sal[i]*15/100;
			else if(desg[i].equals("Developer"))
			 	sal[i] += sal[i]*10/100;
			else if(desg[i].equals("developer"))
			 	sal[i] += sal[i]*10/100;
			else
				sal[i] += sal[i]*5/100;
		}
		System.out.println("Total Number of Employees:"+n);
		System.out.println(" ---- Employee Details---- ");
 		for(int i=0;i<n;i++)
		{
			
			
			System.out.println("Employee ID:"+id[i]);
			System.out.println("Name:"+name[i]);
			System.out.println("Salary:"+sal[i]);
			System.out.println("Designation:"+desg[i]);
			System.out.println(" ---------------------------------- ");
		}
	}
}