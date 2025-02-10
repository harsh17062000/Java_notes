import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the number one :");
        int num1 = obj.nextInt();
        System.out.println("enter the number two :");
        int num2 = obj.nextInt();
        int hcf = 0;

        int result = (num1 > num2)? num1 = num2 : num1;

        for(int i = 1 ; i<=result ; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                hcf = i;
            }
        }
        System.out.println( "HCF is " + hcf);
    }    
}
