package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AllLower {

	public static void main(String[] args) 
	{
		try 
		{
		// TODO Auto-generated method stub
		
			FileReader fis= new FileReader("C:\\sample text\\info.txt");
			BufferedReader bis=new BufferedReader(fis);
			PrintWriter out=(new PrintWriter(new FileWriter("D:\\infodetails.txt")));
		
			String s="";
			
			while((s=bis.readLine())!= null)
			{
			
				out.write(s.toLowerCase()+"\n");
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


