import java.util.Scanner;

class Mini
{
	public static void main(String str[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Database system");
		
		String name;
		String uid;
		char bg;
		int age;
	
		System.out.println("enter your transtition");

		System.out.println("enter your name");
		name = obj.nextLine();
			obj.nextLine();
	
		System.out.println("enter your unique id ");
		uid = obj.nextLine();

		System.out.println("enter your blood group");
		bg = obj.nextLine().charAt(0);

		System.out.println("enter your age");
		age = obj.nextInt();

		System.out.println( "your name is " + name + " " + " id is " + uid +" " + " blood group " + " " + bg + " " + "age is" + " "+age );
	}
}

		



		