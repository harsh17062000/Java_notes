import java.util.Scanner;

class Accending_compare_word
{	
	public static void main(String str[])
	{
		Scanner obj = new Scanner(System.in);
		
		String word1;
		String word2;
		String word3;
		System.out.println("enter word 1");
			 word1 = obj.nextLine();

		System.out.println("enter word 2");
			 word2 = obj.nextLine();

		System.out.println("enter word 3");
			 word3 = obj.nextLine();
		
		if(word1.compareTo(word2) > 0)
		{
			String temp = word1;
				word1 = word2;
				word2 = temp;
		}
		if(word1.compareTo(word3) > 0)
		{
			String temp = word1;
				word1 = word3;
				word3 = temp;
		}
		if(word2.compareTo(word3) > 0)
		{
			String temp = word2;
				word2 = word3;
				word3 = temp;
		}
		
		System.out.println(word1 + " " + word2 + " " + word3);
	}
}
