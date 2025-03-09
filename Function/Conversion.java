import java.util.Scanner;

public class Conversion {

    static void convert(String str)
    {
        String result = " ";
        for(int i = 0; i <str.length();i++)
        {
            char a =str.charAt(i);
            if(a>= 'A' && a<= 'Z')
            {   
                result += (char)(a+32); 
            }
            else if(a>= 'a' && a<= 'z')
            {   
                result += (char)(a-32); 
            }
        }
        System.out.print(result);

        // char arr[] = str.toCharArray();

        // for(int i = 0; i<arr.length ; i++)
        // {
        //     if(arr[i] >= 'A' && arr[i] >= 'Z')
        //     {
        //         System.out.println((char)(a+32));
        //     }
        //     else
        //     {

        //     }
        // }
        
    }
    public static void main(String[] args) {
        String input = "maDan";
        convert(input);
    }
}