package com.bridgelabz.llstackqueue;

public class StackRunner {

public static void main(String[] args) {
	MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
	MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
	
	MyLinkedList stack = new MyLinkedList();
	
	stack.push(myFirstNode);
	stack.push(mySecondNode);
	stack.push(myThirdNode);
	stack.printStack();
	
	}
}
