package sampleCodesForCoreJava;

import java.util.Stack;

public class StackUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
        int[] a = new int[] {5,8};
        String temp = animals.peek();
        System.out.println(" animals[]" + temp);

	}

}
