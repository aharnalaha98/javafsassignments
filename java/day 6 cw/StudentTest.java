import java.util.Scanner;
class Student
{
	Scanner s=new Scanner(System.in);
	int stid;		
	String stname ;
	int age;
	int []marks=new int[4];
	int total=0;
	char grade ;

	void read()
	{ 
	   	System.out.println("Enter id of Student:");
		stid=s.nextInt();
		s.nextLine();
		System.out.println("Enter Name of Student ");
		stname=s.nextLine();
		System.out.println("Enter Age of Student:");
		age=s.nextInt();
		s.nextLine();
		for(int i=0;i<marks.length;i++)
		{
		 	System.out.println("Enter Marks of Student: ");
		 	System.out.println("Enter maths marks:");
			//marks[i]=s.nextInt();
		 	System.out.println("Enter physics marks:");
			//marks[i]=s.nextInt();
		 	System.out.println("Enter chemistry marks:");
			//marks[i]=s.nextInt();
		 	System.out.println("Enter biology marks:");
		marks[i]=s.nextInt();
		total=total+marks[i];
		
	}
	}
void calGrade()
	{
		float avg;
		char grade;
		avg=(total)/4;
		if(avg>=90)
		{
			System.out.println("Grade is: A+");
		}
		else if(avg>=80)
			{
			 System.out.println("Grade is: A");
			}
		else if(avg>70)
			{
			 System.out.println("Grade is: B");
			}
		else if(avg>55)
			{
			 System.out.println("Grade is: C");
			}
	     	else
			{
			System.out.println("Grade is: D");
			}
	}
	void  display()
	{
		
			    //System.out.println("Details of Student:");
				System.out.println("Student id="+stid);
				System.out.println("Student Name ="+stname);
				System.out.println("Student Age="+age);
				//System.out.println("Student Grade"+grade);
	}
		
}
class Studenttest
{
	public static void main(String args[]) 
	{
		int n;
		//System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		n=s.nextInt();
		Student st[] =new Student[n];
		for(int l=0;l<n;l++)
		{
			st[l]=new Student();
			st[l].read();
		    	st[l].calGrade();
	        	st[l].display();
			}
			
	
		
		
	}
}