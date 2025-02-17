import java.util.Scanner;

class Pallandrom {
    public static void main(String str[]) {

        int arr[] = new int[]{1,2,3,2,1};

        int start = 0;
        int end = arr.length-1;
        while(start < end )
        {
            if(arr[start]!=arr[end])
            {
                System.out.println("not pallandrom");
                return;
            }

            start++;
            end--;
        }
        System.out.println("pallandrom");
    }
}