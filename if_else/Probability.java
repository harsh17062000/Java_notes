import java.util.Scanner;

class Probability 
{
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 'h' for head or 't' for tail for coin 1: ");
        char a = obj.nextLine().charAt(0);

        System.out.println("Enter 'h' for head or 't' for tail for coin 2: ");
        char b = obj.nextLine().charAt(0);

        System.out.println("Enter 'h' for head or 't' for tail for coin 3: ");
        char c = obj.nextLine().charAt(0);
		
	if(a == b || b == c || a == c)
	{
		System.out.println("two head");
        }
	else
	{
		System.out.println("not getting two head");
	}
	}
}

