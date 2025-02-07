import java.util.Scanner;

class Torism
{
    public static void main(String str[])
    {
        Scanner obj = new Scanner(System.in);
        String web;
        System.out.println("enter website that you want to visit");
        web = obj.nextLine();

        if(web.equals("www.torism.com"))
        {
            System.out.println("enter your visit type :");
            System.out.println("international visit or domestic visit");
            web = obj.nextLine();
            if(web.equals("international visit"))
            {
                System.out.println("enter your location :");
                System.out.println("japan or Russia");
                web = obj.nextLine();
                if(web.equals("japan"))
                {
                    System.out.println("charges : 200Rs");
                }
                else if(web.equals("russia"))
                {
                    System.out.println("charges : 300Rs");
                }
                else
                {
                    System.out.println("invalid");
                }
            }
            else if(web.equals("domestic visit"))
            {
                System.out.println("enter your location :");
                System.out.println("Bhopal or indore");
                web = obj.nextLine();
                if(web.equals("bhopal"))
                {
                    System.out.println("charges : 600Rs");
                }
                else if(web.equals("indore"))
                {
                    System.out.println("charges : 500Rs");
                }
                else
                {
                    System.out.println("invalid");
                }
            }
        }
        else
        {
            System.out.println("invalid choice");
        }
    }
}