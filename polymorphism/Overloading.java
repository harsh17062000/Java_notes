
// Polymorphism:- 

// Polymorphism means "many forms." In Java, it allows the same method or function to have different behaviors.
// For example, a single method name can perform different tasks depending on the object that calls it.

// Types of Polymorphism:- 

// 1. Compile-time Polymorphism (Method Overloading)
        // => It occurs when multiple methods in the same class have the same name but different parameters (number or type).
        //     Java decides which method to call at compile time (before running the program).

// 2. Runtime Polymorphism (Method Overriding)
        // => Happens when a child class provides a different implementation of a method already defined in the parent class.
                // Java decides which method to execute at runtime (while the program is running).
                // Uses Inheritance.
 class Loading {
        void one(int a) {
                System.out.println(a);
        }
        void one(int a, int b) {
                System.out.println(a + " " + b);
        }
        
}

public class Overloading {
    public static void main(String[] args) {
        
        Loading obj = new Loading();
        obj.one(2);
        obj.one(3,4);
        
    }
}