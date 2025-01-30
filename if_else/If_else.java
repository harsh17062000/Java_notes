import java.util.Scanner;
class If_else
{
	public static void main(String str[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter side one of a triangle");
		int a = obj.nextInt();
		
		System.out.println("enter side two of a triangle");
		int b = obj.nextInt();

		System.out.println("enter side one of a triangle");
		int c = obj.nextInt();

		if(a == b && a == c)
		{
			System.out.println("eqvilateral triangle");
		}
		else
		{
			System.out.println("not an eqvilateral triangle");			
		}
	}
}