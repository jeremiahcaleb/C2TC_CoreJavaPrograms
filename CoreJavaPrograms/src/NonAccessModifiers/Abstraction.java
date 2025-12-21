package NonAccessModifiers;

abstract class Shape {
    abstract void draw();
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();

    }
}
