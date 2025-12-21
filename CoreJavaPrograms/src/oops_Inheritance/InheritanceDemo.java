package oops_Inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog("Chop", "Rottweiler");
        d.showDetails();

        System.out.println("----------------");

        // Multilevel Inheritance
        Child c = new Child();
        c.gp();
        c.p();
        c.c();

        System.out.println("----------------");

        // Hierarchical Inheritance
        Maths m = new Maths();
        m.allSubjects();
        m.onlyMath();

        Science s = new Science();
        s.allSubjects();
        s.onlyScience();

        System.out.println("----------------");

        // Multiple Inheritance (Interface)
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
