import java.util.Scanner;

class Examination 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0,n=0,ans;
		int marks=10;
		
		boolean statusEnglish=false;
		boolean statusGK=false;
		boolean statusMath=false;

		int resultEnglish,resultMath,resultGK;
		
	
		do
		{
		System.out.println("----------Welcome to Online Examination-----------");
		System.out.println("Options are------------------");
		System.out.println("1. English");
		System.out.println("2. Math");
		System.out.println("3. GK");
		System.out.println("4.Exit");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice: ");
		int option=sc.nextInt();
		
			switch (option)
			{
	
				case 1 :
				{
					if (statusEnglish==true)
					{
						System.out.println("Sorry!!You have already visited on English Exam");
						System.out.println("------------------------------");
						break;
					}
					else if (statusEnglish==false)
					{
						System.out.println("-----English Exam-----");
						System.out.println("Do you like classical music? ----");
						System.out.println("1) Yes, I likes  2)Yes, I like  3) Yes, I does   4)Yes, I do");
						System.out.println("Enter your answer");
					
						ans = sc.nextInt();
						if(ans==4)
						{
						 	marks = marks+10;
						}

						System.out.println("She works ____ Saturday.");
						System.out.println("1) at  2)to  3) in   4)on");
						System.out.println("Enter your answer");
					
						ans = sc.nextInt();
						if(ans==4)
						{
						 	marks = marks+10;
						}

						System.out.println("Switzerland is _____ than Britain.");
						System.out.println("1) smaller  2) smallest  3) as small   4) more small");
						System.out.println("Enter your answer");
						ans = sc.nextInt();
						if(ans==1)
						{
						 	marks = marks+10;
						}

						statusEnglish=true;
					
						System.out.println();
				
				
						count+=1;
						n++;
						break;
					}
						
				}
				case 2 :
				{
					if (statusMath==true)
					{
						System.out.println("Sorry!!You have already visited on Maths Exam");
						System.out.println("------------------------------");
						break;
					}
					else if (statusMath==false)
					{
						System.out.println("-----Math Exam-----");
						System.out.println("A fraction which bears the same ratio to 1/27 as 3/11 bear to 5/9 is equal to");
						System.out.println("1) 1/55  2) 55  3) 3/11  4) 1/11");
						System.out.println("Enter your answer");
						ans = sc.nextInt();
						if(ans==1)
						{
							 marks = marks+10;
						}

						System.out.println("What is the largest two digits prime number?");
						System.out.println("1)96  2)97  3)99  4)98");
						System.out.println("Enter your answer");
						
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}
						System.out.println(" Which is the largest number in 15/17, 15/18, 15/19, 15/21?");
						System.out.println("1)15/21  2)15/18  3)15/19  4)15/17");
						System.out.println("Enter your answer");
						
						ans = sc.nextInt();
						if(ans==4)
						{
							 marks = marks+10;
						}	
						System.out.println();
						statusMath=true;
						count+=1;
						n++;
						break;
					}
						
				}
				case 3 :
				{
					if (statusGK==true)
					{
						System.out.println("Sorry!!You have already visited on GK Exam");
						System.out.println("------------------------------");
						break;

					}
					else if (statusGK==false)
					{
						System.out.println("-----GK Exam-----");
						System.out.println("Which animal is known as the Ship of the Desert?");
						System.out.println("1)Tiger  2) Lion  3)Camel");
						System.out.println("Enter your answer");
						
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}	

						System.out.println(" Which month of the year has the least number of days?");
						System.out.println("1)May  2) February  3)August");
						System.out.println("Enter your answer");
						
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}	

						System.out.println("Which is the largest mammal?");
						System.out.println("1)Elephant  2)Giraffe  3)Blue Whale");
						System.out.println("Enter your answer");
						
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}	

						System.out.println();
						statusGK=true;
						count+=1;
						n++;
						break;
					}
						
				}
				case 4:
				{
					System.out.println("-----------------------------");
					System.out.println("You need to complete all your exams");
					System.out.println("------------------------------");
					break;
				}
			}
			if(count==3 && statusMath==true && statusEnglish==true && statusGK==true)
			{
				System.out.println("You have completed all your exams");
				System.out.println("------------------------------");
				System.out.println("Your Score is:"+marks);
				if(marks >= 70)
				{
					marks+=10;
					System.out.println("Bingo!You are selected");
				}
				else
				{
					System.out.println("Sorry! Try Again!!");
				}
				break;

			}
			else
			{
				
				System.out.println("------------------------------");
				System.out.println("Remaining exams are");
				if (statusEnglish==true && statusGK==true)
				{
					System.out.println("To complete your Maths exam press 2");
				}
				else if(statusEnglish==true && statusMath==true)
				{
					System.out.println("To complete your GK exam press 3");
				}
				else if(statusGK==true && statusMath==true)
				{
					System.out.println("To complete your English exam press 1");
				}
				else if(statusGK==true)
				{
					System.out.println("To complete your Maths and English exam press 1 and 2");

				}
				else if(statusEnglish==true)
				{
					System.out.println("To complete your Maths and GK exam press 2 and 3");

				}
				else if(statusMath==true)
				{
					System.out.println("To complete your  English and GK  exam press 1 and 3");
				}

				System.out.println("--------------------------------------------------------------------");
			}
		}
		while (n<=4);
			System.out.println("THANK YOU....");
	}
}
