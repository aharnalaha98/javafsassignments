package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AllUpper 
{
	public static void main(String[] args) 
	{
		//boolean foundSpace=true;
		try 
		{
		FileReader fis= new FileReader("C:\\sample text\\info.txt");
		BufferedReader bis=new BufferedReader(fis);
		PrintWriter out=(new PrintWriter(new FileWriter("D:\\infodetails.txt")));
		
		boolean foundSpace=true;
		String s="";
		char ch[]=s.toCharArray();
		
		while((s=bis.readLine())!= null)
		{
			/*if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
				
			}*/
			//char ch[]=s.toCharArray();
			
			for (int i=0; i< ch.length;i++)
			{
				//ch[i]=(char)(ch[i]+ 'a'-'A');
				if (Character.isLetter(ch[i])) {
					if(foundSpace) {
						ch[i]=Character.toUpperCase(ch[i]);
						foundSpace=false;
						
					}
				}
				else
				{
					foundSpace=true;
				}
				
			}
			out.write(s.toLowerCase( )+"\n");
			
			/*if(foundSpace=true)
			{
				out.write(s.toUpperCase()+"\n");
				foundSpace=false;
			}
			else {
				foundSpace=true;
			}*/
			
		}
		
		out.close();
		fis.close();
		System.out.println("Read");
		}
		catch (Exception e) 
		{
		
			e.printStackTrace();
		
		}
		
		
		
	}
}


