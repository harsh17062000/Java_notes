import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = obj.nextInt();
        int count = 0;
        int reverse = 0;
        
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            count++;
            num = num / 10;
        }

        while (count >= 0) {
            int digit = reverse % 10;
            reverse = reverse / 10;

            switch (digit) {
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
                case 0: System.out.println("zero"); break;
            }
            count--;
        }
    }
}
