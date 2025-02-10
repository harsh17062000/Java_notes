import java.util.Scanner;

public class Lcm2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the number one :");
        int num1 = obj.nextInt();
        System.out.println("enter the number two :");
        int num2 = obj.nextInt();
        int lcm;

        int large = (num1 > num2)? num1 : num2;

        for(int i = large ; ;  i = large + i)
        {
            if(i%num1 == 0 && i%num2 == 0)
            {
                lcm = i;
                break;
            }
        }
        
        System.out.println("LCM IS :" + lcm);
    }    
}
