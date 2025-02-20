import java.util.Scanner;

public class Sum {
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
        boolean flag = true;

        System.out.println("enter number for finding the the pair of sum");
        int num = obj.nextInt();

        for(int i = 0 ; i < s ; i++)
        {
            for(int j = i+1 ; j < s ; j++)
            {
                if(arr[i] + arr[j] == num)
                {
                    System.out.println("the sum of pair is : " + arr[i] + " and " +  arr[j]);
                    flag = false;
                }
            }
        }
        if(flag)
        {
            System.out.println("no pair found");
        }
    }
}
