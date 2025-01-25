import java.util.Scanner;

class midle_num_series 
{
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);

        System.out.println(" enter even number 1: ");
        int a = obj.nextInt();

        System.out.println("Enter even number 2: ");
        int b = obj.nextInt();

        System.out.println("Enter even number 3: ");
        int c = obj.nextInt();

	System.out.println("Enter even number 4: ");
        int d = obj.nextInt();

        System.out.println((b!=0 && c!=0)?(b+c)/2 : "error" );
    	}
}
