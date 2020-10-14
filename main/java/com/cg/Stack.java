package com.cg;

public class Stack<K>{
private final LinkedList<K> linkedList;
    
    public Stack() {
    	this.linkedList = new LinkedList<K>();
    }
    public void push(INode<K> node) {
    	linkedList.add(node);
    }
    public void printStack() {
    	linkedList.print();
    }
    public INode<K> peak() {
    	return linkedList.head;
    }
}