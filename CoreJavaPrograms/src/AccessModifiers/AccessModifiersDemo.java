package AccessModifiers;

public class AccessModifiersDemo {
    
	// Variables with different access modifiers
    public int publicVar = 10;        // Accessible everywhere
    protected int protectedVar = 20;  // Accessible in same package & subclasses
    private int privateVar = 30;      // Accessible only in this class
    int defaultVar = 40;              // Accessible in same package

    // Method to show all variables
    public void showDetails() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
    }

    // Getter and Setter for private variable
    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int value) {
        privateVar = value;
    }

    // Main method
    public static void main(String[] args) {
        AccessModifiersDemo amd = new AccessModifiersDemo();
        amd.showDetails();

        System.out.println("\nAccess from another class in the same package:");
        OtherClassSamePackage other = new OtherClassSamePackage();
        other.accessDemo();
    }
}
