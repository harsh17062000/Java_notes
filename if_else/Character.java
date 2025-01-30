import java.util.Scanner;

class Alphabet
{
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
	System.out.println("enter character");
	char b = obj.nextLine().charAt(0);
	
	if(b>='A' && b<='Z')
	{
		System.out.println((char)(b+32));
	}
	
	else
	{
		System.out.println((char)(b-32));
        }
	}
}
