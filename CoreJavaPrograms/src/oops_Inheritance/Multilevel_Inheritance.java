package oops_Inheritance;

class GrandParent {
    void gp() {
        System.out.println("Grand Parent Class");
    }
}

class Parent extends GrandParent {
    void p() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void c() {
        System.out.println("Child Class");
    }
}
