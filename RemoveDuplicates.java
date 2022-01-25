package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="PayPal India";
		char[] charc=s.toCharArray();
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupCharSet=new HashSet<Character>();
		for(char eachChar:charc)
		{
			boolean add = charSet.add(eachChar);
			if(!add)
			{
				dupCharSet.add(eachChar);
			}
		}
		charSet.remove(dupCharSet);
		
		
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
	}

}
