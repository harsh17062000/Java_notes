import java.util.Scanner;

class Temperature
{
    public static void main(String str[])
    {
        Scanner obj = new Scanner(System.in);
        double temp;
        String choice;
        System.out.println("enter temperature");
        temp = obj.nextDouble();
        System.out.println("select type for convertion in :");
        System.out.println("celcius or farhnite");
obj.nextLine();
        choice = obj.nextLine();

        if(choice.equals("celcius"))
        {
            temp = (temp * (9/5) + 32);
            System.out.println("temperation in celcius is : " + " " + temp);
        }

        else if(choice.equals("farhnite"))
        {
            temp = (temp * (5/9) - 32);
            System.out.println("temperation in farhnite is : " + " " + temp);
        }
    }
}