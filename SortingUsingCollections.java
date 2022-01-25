package week3.day2;




import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
	public static void main(String[] args) {
		String[] input= {"HCL","Wipro","Aspire","CTS"};
		//Using List
		List<String> companiesList = Arrays.asList(input);		
		int size=companiesList.size();
		Collections.sort(companiesList);		
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(companiesList.get(i));
		}
		//Using Arrays
		int length=input.length;
		Arrays.sort(input);
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(input[i]);
		}
		
		
		
	}

}
