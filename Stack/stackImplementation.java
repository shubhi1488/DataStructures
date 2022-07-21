//Implementing stack using stack class Of collection framework
import java.util.*;
import java.io.*;
public class Stack1 {
	static void push(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
	}
	static void pop(Stack<Integer> stack) {
		System.out.println("pop operation-");
		for(int i=0;i<5;i++) {
			Integer y=(Integer)stack.pop();
			System.out.println(y);
		}
	}
	static void peek(Stack<Integer> stack) {
		Integer element=(Integer)stack.peek();
		System.out.println("element is:"+element);
	}
	static void search(Stack<Integer>stack,int element) {
		Integer pos=(Integer)stack.peek();
		if(pos==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println("element is found at:"+pos);
		}
	}

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<Integer>();
		push(stack);
		push(stack);
		pop(stack);
		push(stack);
		peek(stack);
		search(stack,1);
		

	}

}
