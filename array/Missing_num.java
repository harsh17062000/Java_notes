import java.util.Scanner;

public class Missing_num {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

       int arr[] = new int[]{1,3,6,8,12};

       for(int i = 0; i < arr.length-1 ; i++)
       {
        if(arr[i+1] - arr[i] > 1)
        {
            for(int j = arr[i]+1 ; j < arr[i+1] ; ++j)
            {
                System.out.print(j + " ");
            }
        }
       }
    }    
}
