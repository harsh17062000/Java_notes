import java.util.Scanner;
public class Sub_sequence {
    static boolean sq(String str1,String str2)
    {
        int i = 0; int j = 0;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i) == str2.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i == str1.length();
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter string one :");
        String str1 = obj.nextLine();
        System.out.println("enter string two :");
        String str2 = obj.nextLine();
        if(sq(str1,str2))
        {
            System.out.println("string one is Sub sequence of string two");
        }
        else
        {
            System.out.println("string one is not Sub sequence of string two");
        }
    }
}