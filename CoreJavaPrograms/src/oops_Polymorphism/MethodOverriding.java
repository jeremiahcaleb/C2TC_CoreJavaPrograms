package oops_Polymorphism;

//Parent class
class AnimalClass {
 void sound() {
     System.out.println("Animals can make sound");
 }
}

//Child class overriding the sound method
class Lion extends AnimalClass {
 @Override
 void sound() {
     System.out.println("Lion roars...");
 }
}

//Main class
public class MethodOverriding {

 public static void main(String[] args) {
	 
     AnimalClass a = new AnimalClass();
     a.sound();

     // Runtime polymorphism: child class object referred by parent reference
     AnimalClass l = new Lion();
     l.sound();  // Calls overridden method in Lion class
 }
}
