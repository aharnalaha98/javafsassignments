import java.util.Scanner;

class Student
{
	 int S_Id;
	 String S_Name;
	 int Age;
	 int phy,chem,math,bio;
	 char Grade;
	 
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		S_Id=sc.nextInt();
	 
		System.out.println("Enter Name of the Student: ");
		S_Name=sc.next();
	 
		System.out.println("Enter Age of the Student: ");
		Age=sc.nextInt();
	 
	 
		System.out.println("Enter marks in Physics,Chemistry,Maths,Biology: ");
		phy=sc.nextInt();
		chem=sc.nextInt();
		math=sc.nextInt();
		bio=sc.nextInt();
	}
	 
	 
	void calculateGrade()
	{
		int total=phy+chem+math+bio;
		int average=total/4;
		 
		 
		if(average>=90)
		{
			System.out.println("Grade is A+.");
		}
		else if(average>=80)
		{
			System.out.println("Grade is A.");
		}
		else if(average>=70)
		{
			System.out.println("Grade is B.");
		}
		
		else if(average>=55)
		{
			System.out.println("Grade is c.");
			
		}
		else
		{
			System.out.println("Grade is D.");
		}
	 }
	 
	 void display()
	 {
		System.out.println("-----Details of Student-----");
		System.out.println("Student's Id is: "+S_Id);
		System.out.println("Name of Student: "+S_Name);
		System.out.println("Age: "+Age);
		 
	 }
}

class StudentTest extends Student
{
	public static void main(String args[])
	{
	 	System.out.println("Enter the Total number of Students :  ");
	 
	 	Scanner sc= new Scanner(System.in);
	 
	 	int n=sc.nextInt();
	 
	 	Student std[]=new Student[n];
		for(int i=0;i<n;i++) 
		{
			std[i]=new Student();
			std[i].read();
		}
		for(int i=0;i<n;i++)
		{
			std[i].display();
			std[i].calculateGrade();
			
          	}
		

	 
	}
}
