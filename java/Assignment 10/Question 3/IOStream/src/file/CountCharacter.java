package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountCharacter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line;
		int count=0;
		int countCharacter=0;
		int whiteSpaceCount=0;
		FileReader fr= new FileReader("C:\\sample text\\info.txt");
		BufferedReader br= new BufferedReader(fr);
		
		while((line=br.readLine())!=null) {
			String words[]=line.split("\\s+");
			count =count + words.length;
			whiteSpaceCount += count - 1;
			countCharacter += line.length();
			
		}
		System.out.println("Number of Words :" +count);
		System.out.println("Number of Space :" +whiteSpaceCount);
		System.out.println("Number of Characters:" + countCharacter);
		br.close();
	}

}
