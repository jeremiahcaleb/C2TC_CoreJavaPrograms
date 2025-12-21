package oops_Polymorphism;

public class MethodOverloading {

    int addition(int a, int b) {
        return a + b;
    }

    float addition(float a, float b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    float addition(int a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading mol = new MethodOverloading();

        // Using different overloaded methods
        System.out.println("Addition of two integers: " + mol.addition(5, 15));
        System.out.println("Addition of two floats: " + mol.addition(5.6f, 9.8f));
        System.out.println("Addition of three integers: " + mol.addition(2, 4, 6));
        System.out.println("Addition of int and float: " + mol.addition(5, 7.5f));
    }
}
