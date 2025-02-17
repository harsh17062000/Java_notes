import java.util.Scanner;

class Reverse {
    public static void main(String str[]) {

        int arr[] = new int[]{1,2,3,4,5,6};

        int start = 0;
        int end = arr.length-1;
        while(start < end )
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}