import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        //as a variable
        String a  = "harsh";
        System.out.println(a);

        //as a object
        String obj = new String("ayush");
        System.out.println(obj);

        //as an array
        char arr[] = {"a","b","c"};
        //System.out.println(arr);

        String obj1 = new String(arr);
        System.out.println(obj1);
    }
}