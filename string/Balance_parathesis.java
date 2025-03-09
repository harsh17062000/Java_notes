import java.util.Scanner;
public class Balance_parathesis {
    static boolean valid(String str)
    {
        int circle = 0;
        int square = 0;
        int curly = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)== '[')
            {
                square++;
            }
            else if(str.charAt(i)== '{')
            {
                curly++;
            }
            else if(str.charAt(i)== '(')
            {
                circle++;
            }
            else if(str.charAt(i)== '}')
            {
                curly--;
            }
            else if(str.charAt(i)== ']')
            {
                square--;
            }
            else if(str.charAt(i)== ')')
            {
                circle--;
            }
        }
        if(square!=0 || circle != 0 || curly != 0)
        {
            return false;

        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the brakets");
        String str = obj.nextLine();
        if(valid(str))
        {
            System.out.println("balance paranthesis");
        }
        else
        {
            System.out.println("not a balance paranthesis");
        }
    }
}