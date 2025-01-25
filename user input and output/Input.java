import java.util.Scanner;
class Input
{
	public static void main(String str[])
	{
		int age;
		String name;
		char bg;
		System.out.println("enter your name");

		Scanner obj = new Scanner(System.in);
		name = obj.nextLine();
		
		System.out.println("enter your age");
		age = obj.nextInt();
		obj.nextLine();
		System.out.println("enter your blood group");
		bg = obj.nextLine().charAt(0);

		System.out.println("name is" + " " + name + " age is " + age + " " + "blood group is" + bg);
	}
}
