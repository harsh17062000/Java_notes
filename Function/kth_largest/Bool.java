import java.util.Scanner;

 class Return {

    static Boolean largest() 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the value of array");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = obj.nextInt();
        }
        
        System.out.println("enter the term for finding largest number");
        int k = obj.nextInt();

        for(int i = 0 ; i<k ; i++)
        {
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("kth term is : " + arr[k-1]);
        return true;

    }
    public static void main(String[] args) {
        largest();
    }
}