import java.util.Arrays;
import java.util.Collections;

public class ToStringSortByNames
{
	public static void main(String args[])
	{
		String name[]={"Rimi","rimi","Aharna","aharna"};
		
		Arrays.sort(name);
        	System.out.println("In Ascending Order : ");		//Ascending Order
		System.out.println(Arrays.toString(name));
		
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println("In Descending Order : ");		//Descending Order
		System.out.println(Arrays.toString(name));
	}
	
}


