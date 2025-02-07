import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();  // Accept user input

        int rv = 0;
        int digit;

        while (num > 0) {  
            digit = num % 10;  // Extract last digit
            rv = rv * 10 + digit;  // Build reversed number
            num = num / 10;  // Remove last digit
        }

        System.out.println("Reversed number: " + rv);

    }
}
