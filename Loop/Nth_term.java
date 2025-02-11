import java.util.Scanner;

public class Nth_term {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of term: ");
        int n = obj.nextInt();
        int sum = 0; 
        System.out.println("nth number of series are : ");
        for (int i = 0; i < n; i++) 
        {
            sum = sum*10 + 1;
           System.out.println(sum);
        }

    }
}
