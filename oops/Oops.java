class Two {
    class Three {
        void display(int a, int b)
        {
            System.out.println("hello");
            int c = a;
            int d = b;
            System.out.println(a + " " + b);
        }
    }
}



public class Oops {
    public static void main(String[] args) {
        
        Two  obj = new Two();
        Two.Three objThree = obj.new Three();
        objThree.display(10,20); 
    }
}