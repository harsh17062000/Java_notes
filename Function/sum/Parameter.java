import java.util.Scanner;

    public class Parameter {
      
        static int para(int arr[])
        {
            System.out.println("array is : ");
            for(int p:arr)
            {
                System.out.print(p + " ");
            }
            
            System.out.println();

            int sum = 0;
            for(int i = 0 ; i < arr.length; i++)
            {
                sum = sum + arr[i];
            }
            System.out.println("sum is :");
            return sum;
        }
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter size of array ");
            int s = obj.nextInt();
            int arr[] = new int[s];

            System.out.println("enter the value of array");
            for(int i = 0 ; i < arr.length; i++)
            {
                arr[i] = obj.nextInt();
            }
            System.out.println(para(arr));
        }
    }
    