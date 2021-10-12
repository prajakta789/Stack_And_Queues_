package com.bridgelabz.stackqueue;

public class Stack {


	private class Node<T> {
		T data;
		Node link;
	}

	Node topper;


	public Stack() {
		this.topper = null;
	}

	/* create  in class push method
	 * push stack operation to add the element at top
	 */
	public <K> void push(K x) {

		Node temp = new Node();
		if (temp == null) {
			System.out.println("stack overflow");
		}
		else {
			temp.data = x;
			temp.link = topper;
			topper = temp;
		}
	}

	//display method to give the stack data
	public void display() {
		Node temp = null;
		if (topper == null) {
			System.out.println("stack underflow");
		}
		temp = topper;
		while (temp != null) {
			System.out.print(temp.data);
			System.out.print("->"+temp.data);
			temp = temp.link;
		}
	}
}