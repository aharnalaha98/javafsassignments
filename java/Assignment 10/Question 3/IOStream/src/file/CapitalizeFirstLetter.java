package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.PrintWriter;

public class CapitalizeFirstLetter {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fis= new FileReader("C:\\sample text\\info.txt");
		FileWriter fw=new FileWriter("D:\\infodetails.txt"); 
		BufferedReader bis=new BufferedReader(fis);
		
		//PrintWriter out=(new PrintWriter(new FileWriter("D:\\infodetails.txt")));
		String s=null;
		if((s=bis.readLine())!=null) {
			fw.write(s.substring(0, 1).toUpperCase()+s.substring(1));
		}
		System.out.println("Write");
		fw.close();
		bis.close();
		fis.close();
		
}
	}
