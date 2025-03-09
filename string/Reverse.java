import java.util.Scanner;
public class Reverse {
    static void rev()
    {
        String str = "harsh";
        char[] chararray = str.toCharArray();
        int start = 0;
        int end = chararray.length - 1;
        while(start<end)
        {
            char temp;
            
            temp = chararray[start];
            chararray[start] = chararray[end];
            chararray[end] = temp;
            start++;
            end--;
        }
        String obj = new String(chararray);
        System.out.println(obj);



    }
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     rev();   
    }
}