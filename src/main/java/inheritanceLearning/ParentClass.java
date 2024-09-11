package inheritanceLearning;

class ParentClass {
	String name = "Animal";

    // Constructor of the parent class
	ParentClass() {
        System.out.println("Animal constructor called");
    }

    // Method in the parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
    
    final void vocal() {
    	System.out.println("No animal can have dialects of speaking");
    }
}
