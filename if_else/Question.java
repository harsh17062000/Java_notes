import java.util.Scanner;

class Question
{	
	public static void main(String str[])
	{
		Scanner obj = new Scanner(System.in);
		
		String color1;
		String color2;
		String color3;
		System.out.println("enter color 1");
			 color1 = obj.nextLine();

		System.out.println("enter color 2");
			 color2 = obj.nextLine();

			 color3 = color1+color2;

		if(color3.equals("redblue")
			{
				System.out.println("green");
			}
		else
			{
				System.out.println("invalid");
			}
		
	}
}
