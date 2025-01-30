import java.util.Scanner;

class Search_word
{
	public static void main(String[] args) 
		{
			Scanner obj = new Scanner(System.in);
				System.out.println("enter the word");
				string word = obj.nextLine();
					
				System.out.println("enter the letter for finding");
				char letter = obj.nextLine().charAt(0);
				
				if(word.charAt(0) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(1) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(2) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(3) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(4) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(5) == letter)
					{
						System.out.println("word found");
					}
				else if(word.charAt(6) == letter)
					{
						System.out.println("word found");
					}

				else
					{
						System.out.println("not found");
					}
		}
}

			