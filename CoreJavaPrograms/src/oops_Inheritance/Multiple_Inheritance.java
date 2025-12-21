package oops_Inheritance;

//Multiple Inheritance (Using Interface)

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    public void methodB() {
        System.out.println("Method from Interface B");
    }
}
