import java.util.Scanner;
class Student
{
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int sid[]=new int[n];
	String sname[]=new String[n];
	int age[]=new int[n];
	int marks[]=new int[n];
	int pmarks[]=new int[n];
	int cmarks[]=new int[n];
	int mmarks[]=new int[n];
	int bmarks[]=new int[n];
	String grade[]=new String[n];
	void input()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("\n Enter Student id ");
			sid[i]=sc.nextInt();
			System.out.println("\n Enter Student name ");
			sname[i]=sc.next();
			System.out.println("\n Enter Age ");
			age[i]=sc.nextInt();
			for(i=0;i<marks.length;i++)
			{
				System.out.println("Enter Physics Marks:");
				pmarks[i]=sc.nextInt();
				System.out.println("Enter Chemistry Marks:");
				cmarks[i]=sc.nextInt();
				System.out.println("Enter maths Marks:");
				mmarks[i]=sc.nextInt();
				System.out.println("Enter Biology Marks:");
				bmarks[i]=sc.nextInt();
			}	

		}	
	}
	void calgrade()
	{
		int avg[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			avg[i]=sc.nextInt();
			avg[i] = (pmarks[i]+cmarks[i]+mmarks[i]+bmarks[i])/400;
		
		if(avg[i]>90)
		{
			System.out.println("A+");
		}
		else if(avg[i]>80)
		{
			System.out.println("A");
		}
		else if(avg[i]>70)
		{
			System.out.println("B");
		}
		else if(avg[i]>55)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
		}
	}
	void display() 
	{
		System.out.println("Total Number of Students:"+n);
		System.out.println(" ---- Student Details---- ");
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Student ID:"+sid[i]);
			System.out.println(" Student Name:"+sname[i]);
			System.out.println("Age:"+age[i]);
			System.out.println("Grade:"+grade[i]);
			System.out.println(" ----------------- ");
		}
	}	
}
class StudentTest
{
	public static void main (String[] args)
	{
		System.out.println("Enter total customer");
		Student obj=new Student();
		obj.input();
		obj.calgrade();
		obj.display();
	}
}
