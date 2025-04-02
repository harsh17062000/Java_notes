// inheritance:- 
// Inheritance is a concept in object-oriented programming where a class (child class) can reuse the properties and behaviors (methods) of another class (parent class). 
// This helps in reducing code duplication and improving code organization.

// type:-
// 1.single
// 2.multilevel
// 3. hierarchical

// Loose Coupling makes code flexible, reusable, and maintainable.
// Tight Coupling makes changes hard and risky.

// loose coupling.............

 class One  {
    int a;
    void show()
    {
        System.out.println("inheritance");
    }
}
class Two extends One {

    void display()
    {
        System.out.println(a);
    }
        
}
public class Inheritance extends Two {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.show();
        obj.a = 11;
        System.out.println(obj.a);

         Inheritance obj1 = new Inheritance();
        obj1.display();

        Two obj2 = new Two();
        obj2.display();

    }
}