import java.util.Scanner;

public class Anagram {
    static boolean anagrm(String str1,String str2)
    {

        if(str1.length() == str2.length())
        {
            int count[] = new int[256];
            for(int i = 0; i<str1.length(); i++)
            {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            for(int i = 0; i<256; i++)
            {
                if(count[i]!=0)
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String str1 = obj.nextLine();
        System.out.println("enter string 2: ");
        String str2 = obj.nextLine();
        if(anagrm(str1,str2))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not a anagram");
        }
    }
}