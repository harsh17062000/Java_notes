import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
    int paths;

        System.out.println("Enter a path b/w 1 to 4:");
        paths = obj.nextInt();

            if(paths == 1)
                {
                    System.out.println("you have three path: ");
                    System.out.println("enter the path 2,3,4");
                    paths = obj.nextInt();
                    if(paths == 2)
                    {
                        System.out.println("you have two path: ");
                        System.out.println("enter the path 3,4");
                        paths = obj.nextInt();
                        if(paths == 3)
                        {
                            System.out.println("you have one more path: ");
                            System.out.println("enter the path 4");
                            paths = obj.nextInt();
                            if(paths == 4)
                            {
                                System.out.println("you reached the destination ");
                            }
                        }
                        else if(paths == 4)
                        {
                            System.out.println("you reached the destination ");
                        }
                    }

                    else if(paths == 3)
                    {
                        System.out.println("you have one more path: ");
                            System.out.println("enter the path 4");
                            paths = obj.nextInt();
                             if(paths == 4)
                            {
                                System.out.println("you reached the destination ");
                            }
                    }

                    else if(paths == 4)
                    {
                         System.out.println("you reached the destination ");
                    }
                }
                else
                {
                    System.out.println("Try again");

                }

    }
}
