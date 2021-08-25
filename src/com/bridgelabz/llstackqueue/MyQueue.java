package com.bridgelabz.llstackqueue;

public class MyQueue <K> {

	private INode head;
	private INode tail;
	
	public MyQueue(){
		this.head=null;
		this.tail=null;
	}
	
	public void enqueue(INode newNode) {
		append(newNode);
	}
	
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void dequeue() {
		System.out.println("Removed first element: " +head.getKey());
		INode tempNode = head.getNext();
		this.head = tempNode;
		
	}
	
	public void printQueue() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode != null) {
			printformat.append(tempNode.getKey());
			if (tempNode != tail) {
				printformat.append("-->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.println(printformat);
	}
	
}
