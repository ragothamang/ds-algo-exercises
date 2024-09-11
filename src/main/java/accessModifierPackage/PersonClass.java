package accessModifierPackage;


public class PersonClass {
    // Fields with different access modifiers
    public String publicName;           // Accessible from anywhere
    protected int protectedAge;         // Accessible within package and subclasses
    String defaultCountry;              // Accessible only within the package (default)
    private String privateSSN = "123";  // Accessible only within this class

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }
}