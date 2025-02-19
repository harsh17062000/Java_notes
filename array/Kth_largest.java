import java.util.Scanner;

class Kth_largest {
    public static void main(String str[]) {
        Scanner obj = new Scanner(System.in);
       
        System.out.println("enter size of array");
        int s = obj.nextInt();

        int arr[]=new int[s];
        System.out.println("enter value of array");
        for(int i = 0 ; i < s ; i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("enter number of term for finding largest number in an array");
        int k = obj.nextInt();
        for(int i = 0; i < k ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] < arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
            System.out.println(arr[k-1]);
    }
}