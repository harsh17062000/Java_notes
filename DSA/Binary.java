
 class TreeImp {
    int data;
    TreeImp left;
    TreeImp right;

    TreeImp(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
}

public class Binary {

    public static void main(String[] args) {
        TreeImp obj = new TreeImp(10);
        obj.left = new TreeImp(20);
        obj.right = new TreeImp(30);

        System.out.println(obj.data);
        System.out.println(obj.left.data);
        System.out.println(obj.right.data);
    }
}