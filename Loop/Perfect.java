import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        int sum = 0; 

        for (int i = 1; i < num; i++) 
        { 
            if (num % i == 0) 
            {
                sum = sum + i; 
            }
        }

        if (sum == num) 
        {
            System.out.println(num + " is a Perfect Number.");
        } 
        else 
        {
            System.out.println(num + " is NOT a Perfect Number.");
        }

    }
}
