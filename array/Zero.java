import java.util.Scanner;

public class Zero {
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
        int k = 0;
        for(int i = 0; i<s ; i++)
        {
            
                if(arr[i]!=0)
                {
                    arr[k] = arr[i];
                    k++;
                }
        }
        for(int i = k ; i < s ; i++)
        {
            arr[i] = 0;
        }
        System.out.println("after sorting :");
        for(int i = 0 ; i < s ; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
