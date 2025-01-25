import java.util.Scanner;
class Ternary
{
	public static void main(String str[])
	{
		Scanner obj = new Scanner(System.in);
		int a;
		System.out.println("enter the number");
		a = obj.nextInt();
		String result = ((a%2==0 && a%4==0 && a%6==0) && (a%8!=0)) ? "yes" : "no";
		System.out.println(result);
	}
}
		