package NonAccessModifiers;

//'final' class cannot be extended
final public class Final {

 // 'final' variable cannot be reassigned
 final int x = 100;

 // 'final' method cannot be overridden
 final void print() {
     System.out.println("Print the value of x: " + x);
 }

 public static void main(String[] args) {

     Final fe = new Final();
     fe.print(); // Output: Print the value of x: 100

     // Cannot reassign 'x' because it is final
     // fe.x = 200; //This would cause a compilation error
 }
}

//Cannot create a subclass of a final class
//class Example extends Final { } // Compilation error
