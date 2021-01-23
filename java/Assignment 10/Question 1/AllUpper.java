package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AllUpper {

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
			
				out.write(s.toUpperCase()+"\n");
			}
			out.close();
			fis.close();
		}
		catch (Exception e) 
		{
		
			e.printStackTrace();
			System.out.println("Read");
		}
		
		
		
	}
}


