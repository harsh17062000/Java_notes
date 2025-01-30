import java.util.Scanner;

class Num_into_word
{
	public static void main(String str[])
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("enter the number ");
			int a = obj.nextInt();
			
			int d1 = a%10;
			int d2 = a/10;
			
			if(d1 == 3 && d2 == 12)
				{	
					System.out.println( "one two three");
				}
			else
				{
					System.out.println( "invalid");
				}

		}	
} 