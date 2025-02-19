import java.util.Scanner;

class Accending {
    public static void main(String str[]) {

        int arr[] = new int[]{1,2,30,4,5,2};

        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}