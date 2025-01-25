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

        int headsCount = (a == 'h' ? 1 : 0) + (b == 'h' ? 1 : 0) + (c == 'h' ? 1 : 0);

        String result = (headsCount == 2) ? "Getting two heads" : "Not getting two heads";
        System.out.println(result);
    	}
}
