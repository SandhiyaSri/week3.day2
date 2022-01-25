package week3.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		
		String s="I am a software tester";
		String revString="";
		String revWord="";
		String[] words=s.split(" ");
		int length=words.length;
		
		
			for (int i=0;i<length;i++)
			{
				
				String word=words[i];
				
				for(int j=word.length()-1;j>=0;j--)
				{
					revWord=revWord+word.charAt(j);
					
				}
				}
				revString=revString+revWord+" ";
				
			
		
		System.out.println(revString);
	
	}
}
