package com.bridgelabz.llstackqueue;

public class MyLinkedList <K> {

	private INode head;
	private INode tail;
	
	public MyLinkedList(){
		this.head=null;
		this.tail=null;
	}
	
	public void push(INode newNode) {
		add(newNode);
	}
	
	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}		
	}
	
	public void peek() {
		System.out.println(this.head.getKey());
	}
	
	public void pop() {
		INode tempNode = head.getNext();
		this.head = tempNode;
	}
	
	public void printStack() {
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
