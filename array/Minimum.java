import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of array");
        int s = obj.nextInt();

        int arr[] = new int[s];
        System.out.println("enter value of array");
        for(int i = 0; i<s ; i++)
        {
             arr[i] = obj.nextInt();
        }

        int max = arr[0];

        for(int i = 0 ; i < s ; i++)
        {
           if(arr[i] > max) 
           {
            max = arr[i];
           }
        }
        System.out.println("maximum value is : " + max);
    }
}
