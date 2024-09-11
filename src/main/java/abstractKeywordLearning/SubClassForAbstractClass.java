package abstractKeywordLearning;

public class SubClassForAbstractClass extends AbstractClassSample{
	public void sound() {
        System.out.println("The dog barks.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassSample dog = new SubClassForAbstractClass();
	        dog.sound();  // Outputs: The dog barks.
	        dog.sleep();  // Outputs: This animal is sleeping

	}

}
