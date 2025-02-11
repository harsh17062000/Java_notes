import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter first number  of a series: ");
        double a = obj.nextInt();
        System.out.println("Enter ratio : ");
        double r = obj.nextInt();
        System.out.println("Enter number of term: ");
        double n = obj.nextInt();
        double sum = 0; 
        System.out.println("GP series are : ");
        for (int i = 0; i < n; i++) 
        {
            sum = a * Math.pow(r,i);
           System.out.println(sum);
        }

    }
}
