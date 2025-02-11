import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter first number  of a series: ");
        int a = obj.nextInt();
        System.out.println("Enter common difference : ");
        int d = obj.nextInt();
        System.out.println("Enter number of term: ");
        int n = obj.nextInt();
        int sum = 0; 
        System.out.println("AP series are : ");
        for (int i = 0; i < n; i++) 
        { 
           sum = a + i * d;
           System.out.println(sum);
        }

    }
}
