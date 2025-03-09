import java.util.Scanner;
public class Overloading
{
    // static int sum(int a, char b)
    // {
    //     return a+b;
    // }

    // static int sum(char b,int a)
    // {
    //     return a;
    // }
    // public static void main(String str[])
    // {
    //     System.out.println(sum(10,'b'));
    //      System.out.println(sum('b',10));
    // }

    static int sum(int a, int b)
    {
        return a+b;
    }

    static int sum(int a)
    {
        return a;
    }
    public static void main(String str[])
    {
        System.out.println(sum(10,20));
    }
}
