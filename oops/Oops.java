class Two {
    class Three {
        void display()
        {
            System.out.println("hello");
        }
    }
}



public class Oops {
    public static void main(String[] args) {
        
        Two  obj = new Two();
        Two.Three objThree = obj.new Three();
        objThree.display(); 
    }
}