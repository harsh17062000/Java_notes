import java.util.Scanner;

    public class Return {
      
        static int sum()
        {

            Scanner obj = new Scanner(System.in);
            System.out.println("enter size of array ");
            int s = obj.nextInt();
            int arr[] = new int[s];

            System.out.println("enter the value of array");
            for(int i = 0 ; i < arr.length; i++)
            {
                arr[i] = obj.nextInt();
            }
            System.out.println("array is : ");
            for(int i = 0 ; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();

            int sum = 0;
            for(int i = 0 ; i < arr.length; i++)
            {
                sum = sum + arr[i];
            }
            return sum;
        }
        public static void main(String[] args) {
           System.out.println(sum());
        }
    }
    