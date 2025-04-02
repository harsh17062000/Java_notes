
 class Two {
    int b;
    Two(int a)
    {
        b=a;
        System.out.println(a);
    }
    Two(Two obj)
    {
        b = obj.b;
        System.out.println(b);
    }
}



public class Copy_constructor {

    public static void main(String[] args) {
        Two obj = new Two(10);
      
    }
}