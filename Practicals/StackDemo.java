package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack);
		
		stack.pop(); //deletes an element
		System.out.println(stack.peek()); //this shows which element is going to be deleted
		System.out.println(stack); 
		
		

	}

}
