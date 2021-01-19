import java.util.*;
class Exam
{
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int g=0, m=0, e=0, tot=0;
		do{
			System.out.println("\n welcome to online exam ");
			System.out.println("1.General knowledge Exam");
			System.out.println("2.Math Exam ");
			System.out.println("3.English Exam");
			System.out.println("Enter Your Choice");

			int p=sc.nextInt();
			switch(p){
				case 1:
					
					if(g==1)
					{
						//g=sc.nextInt();
					 	System.out.println("Already visited..");
					}
					else
					 {
						
					 	System.out.println("Which animal is known as the Ship of the Desert?");
						System.out.println("1)Tiger  2) Lion  3)Camel");
						System.out.println("Enter your answer");
						g=sc.nextInt();
					 	if (g==3)
							tot++;
						
						System.out.println(" Which month of the year has the least number of days?");
						System.out.println("1)May  2) February  3)August");
						System.out.println("Enter your answer");
						g=sc.nextInt();
					 	if (g==2)
							tot++;
						
						System.out.println("Which is the largest mammal?");
						System.out.println("1)Elephant  2)Giraffe  3)Blue Whale");
						System.out.println("Enter your answer");
						g=sc.nextInt();
					 	if (g==3)
							tot++;
						
							
					 }
				break;
				case 2:
					
					if(m==1)
					{
						//m=sc.nextInt();

					 	System.out.print("Already visited..");
					}
					else
					 {
						
					 	System.out.println("A fraction which bears the same ratio to 1/27 as 3/11 bear to 5/9 is equal to");
						System.out.println("1) 1/55  2) 55  3) 3/11  4) 1/11");
						System.out.println("Enter your answer");
						m=sc.nextInt();
					 	if(m==1)
							tot++;
						
						System.out.println("What is the largest two digits prime number?");
						System.out.println("1)96  2)97  3)99  4)98");
						System.out.println("Enter your answer");
						m=sc.nextInt();
					 	if(m==2)
							tot++;
						
						System.out.println(" Which is the largest number in 15/17, 15/18, 15/19, 15/21?");
						System.out.println("1)15/21  2)15/18  3)15/19  4)15/17");
						System.out.println("Enter your answer");
						m=sc.nextInt();
					 	if(m==4)
							tot++;
					 }
				break;
				case 3:
					
					if(e==1)
					{
						//e=sc.nextInt();
					
					 	System.out.print("Already visited..");
					}
					else
					 {
						
					 	System.out.println("Do you like classical music? ----");
						System.out.println("1) Yes, I likes  2)Yes, I like  3) Yes, I does   4)Yes, I do");
						System.out.println("Enter your answer");
						e=sc.nextInt();
						if(e==4);
					 		tot++;
						
						System.out.println("She works ---- Saturday.");
						System.out.println("1) at  2)to  3) in   4)on");
						System.out.println("Enter your answer");
						e=sc.nextInt();
						if(e==4);
					 		tot++;
						
						System.out.println("Switzerland is ---- than Britain.");
						System.out.println("1) smaller  2) smallest  3) as small   4) more small");
						System.out.println("Enter your answer");
						e=sc.nextInt();
						if(e==1);
					 		tot++;
					 }
				break;
				default:
					System.out.println("Wrong Choice");
				break;
					
			}
			
		}
	while(tot!=9);
	{
		System.out.println("Your correct answers:"+tot);
		int result=tot*10;
		System.out.println("Your Score is:"+result);
		if(result> 70)
		{
			result += 10;
 			System.out.println("Bingo!You are selected");
		}
		else
			System.out.println("Sorry! Try Again!!");

	}
}
}