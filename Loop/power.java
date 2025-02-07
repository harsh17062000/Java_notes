import java.util.Scanner;

class pallandrom {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();  

        int num = 2;
        int power = 3;
        int result = 1;

        for(int i = 1; i<= power ; i++)
        {
            result = result * num;
        }
        System.out.println(result);
    }
}
