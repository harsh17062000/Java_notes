import java.util.Scanner;

class pallandrom {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();  

        int org = num;
        int rv = 0;
        int digit;

        while (num > 0) {  
            digit = num % 10;  
            rv = rv * 10 + digit;  
            num = num / 10;  
        }

        if (rv == org) 
        {
            System.out.println("Palindrome");
        }
         else 
        {
            System.out.println("Not a Palindrome");
        }
    }
}
