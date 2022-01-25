package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int text1Length=text1.length();
		int text2Length=text2.length();
		
		if(text1Length!=text2Length)
		{			
			System.out.println("They are not Anagram");
								
		}
		else
		{
			char[]text1Array=text1.toCharArray();
			char[]text2Array=text2.toCharArray();
		Arrays.sort(text1Array);
		Arrays.sort(text2Array);
		boolean equals = Arrays.equals(text1Array, text2Array);
		if(equals)
		{
			System.out.println("They are Anagram");
		}
		else
		{
			System.out.println("They are not Anagram");
		}
		}
		
	}

}
