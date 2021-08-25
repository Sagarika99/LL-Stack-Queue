package com.bridgelabz.llstackqueue;

public class QueueRunner {

	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue(myThirdNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myFirstNode);
		
		queue.dequeue();
		queue.printQueue();
		
	}
}
