import java.util.Scanner;
class Student
{
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	int sid[]=new int[n];
	String sname[]=new String[n];
	int age[]=new int[n];
	
	int total;
	
	String grade[]=new String[n];
	void input()
	{
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("\n Enter Student id ");
			sid[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("\n Enter Student name ");
			sname[i]=sc.next();
			sc.nextLine();
			System.out.println("\n Enter Age ");
			age[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("\n Enter Total Subject ");
									
			int sn=sc.nextInt();
			int marks[]=new int[sn];
									
			
			for(i=0;i<sn;i++)
			{
				sc.nextLine();
				System.out.println("Enter Marks of Subject "+(i+1)+":");
				marks[i]=sc.nextInt();
				total=total+marks[i];
						
			}
									

		}	
	}

	void calgrade()
	{
		int result=total;
		int avg[]=new int[n];
		for(int i=0;i<n;i++)
		
		{
			
			avg[i]=sc.nextInt();
			avg[i]= result/4;
				if(avg[i]>=90)
				{
					System.out.println("A+");
				}
				else if(avg[i]>=80 && avg[i]<90)
				{
					System.out.println("A");
				}
				else if(avg[i]>=70 && avg[i] <80)
				{
					System.out.println("B");
				}
				else if(avg[i] >=55 && avg[i]< 70)
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
		System.out.println("Enter total number of students:");
		Student obj=new Student();
		obj.input();
		obj.calgrade();
		obj.display();
	}
}
