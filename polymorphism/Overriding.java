class One {
    void show() {
        System.out.println("class 2");
    }
}
class Two extends One {
    void show() {
        System.out.println("class 3");
    }
}

public class Overriding extends Two {
    public static void main(String[] args) {
        One obj = new One();
        obj.show(); 

        Overriding obj1 = new Overriding();
        obj1.show();
    }
}
