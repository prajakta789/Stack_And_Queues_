package com.bridgelabz.stackqueue;

public class StackMain<K> {

	public static void main(String args[]){
		//  stack implement use linked list

		System.out.println("Welcome to Stacks and Queues");

		//create object and give the push method value

		Stack StacksandQueuesdemo = new Stack();

		StacksandQueuesdemo.push(56);
		StacksandQueuesdemo.push(30);
		StacksandQueuesdemo.push(70);
		StacksandQueuesdemo.display();

		System.out.println("\nPeek Value "+StacksandQueuesdemo.peek());

		StacksandQueuesdemo.pop();
		StacksandQueuesdemo.pop();
		System.out.println("After Pop");
		StacksandQueuesdemo.display();
}
}