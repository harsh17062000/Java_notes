import java.util.Scanner;

class Series
{
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);

        System.out.println(" enter even number 1 in series ");
        int a = obj.nextInt();

        System.out.println("Enter even number 2 in series ");
        int b = obj.nextInt();

        System.out.println("Enter even number 3 in series ");
        int c = obj.nextInt();

	System.out.println("Enter even number 4 in series ");
        int d = obj.nextInt();

	if(b!=0 && c!=0) 
	{
		System.out.println("middle number is ");
		System.out.println((b+c)/2 );
	}
	else
	{
        System.out.println("error");
    	}
	}
}
