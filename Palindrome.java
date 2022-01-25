package week3.day2;

public class Palindrome {
	public static void main(String[] args) {
		
		String name="madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}

}
