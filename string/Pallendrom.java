import java.util.Scanner;
public class Pallendrom {
    static boolean pal(String input)
    {
        int start = 0;
        int end = 0;
        char[] inputarray = input.toCharArray();
        while(start<end)
        {
            if(inputarray[start]== inputarray[end])
            {
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter string to check wether it is pallendrom or not");
        String input = obj.nextLine();
        if(pal(input))
        {
            System.out.println("pallendrom");
        }
        else
        {
            System.out.println("not a pallendrom");
        }

    }
}