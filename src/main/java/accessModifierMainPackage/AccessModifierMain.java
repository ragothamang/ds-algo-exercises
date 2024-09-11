package accessModifierMainPackage;

//import accessModifierPackage.PersonClass;
class PersonClass {
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
public class AccessModifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PersonClass person = new PersonClass();
	        
	        // Accessing public variable
	        person.publicName = "John";  // Accessible from anywhere
	        System.out.println(person.publicName);

	        // Accessing protected variable (accessible in the same package)
	        person.protectedAge = 25;  // Accessible within the package or subclass
	        System.out.println(person.protectedAge);

	        // Accessing default (package-private) variable
	        person.defaultCountry = "USA";  // Accessible within the same package
	        System.out.println(person.defaultCountry);

	        // Trying to access private variable (This will cause an error)
	        // person.privateSSN = "123-45-6789"; // Not accessible outside the Person class
	        
	        // Calling methods
	        person.publicMethod();
	        person.protectedMethod();
	        person.defaultMethod();
	        // person.privateMethod(); // Error: privateMethod() is not accessible
	}

}
