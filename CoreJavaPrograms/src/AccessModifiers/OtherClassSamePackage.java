package AccessModifiers;

public class OtherClassSamePackage {

    public void accessDemo() {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Can access public, protected, and default
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);

        // Cannot access private directly → compile error
        // System.out.println("Private: " + obj.privateVar);

        // Access private via getter
        System.out.println("Private (via getter): " + obj.getPrivateVar());
    }
}
