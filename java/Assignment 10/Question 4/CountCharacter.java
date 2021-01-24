package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountCharacter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line;
		int countCharacter=0;
		
		FileReader fr= new FileReader("C:\\sample text\\info.txt");
		BufferedReader br= new BufferedReader(fr);
		
		while((line=br.readLine())!=null) {
			countCharacter += line.length();
		}
		System.out.println("Number of Characters:" + countCharacter);
		br.close();
	}

}