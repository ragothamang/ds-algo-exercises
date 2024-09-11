package inheritanceLearning;

public class ChildClass extends ParentClass{
	String name = "Dog";

    // Constructor of the child class
	ChildClass() {
        // Calls the parent class constructor
        super();  
        System.out.println("Dog constructor called");
    }

    // Overriding the parent class method
    @Override
    void sound() {
        // Calls the parent class method
        super.sound();  
        System.out.println("Dog barks");
    }

    // Method to show usage of parent class variable
    void printName() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name);  // Accessing parent class variable
    }

   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChildClass dog = new ChildClass();
	        dog.sound();
	        dog.printName();
	}

}
