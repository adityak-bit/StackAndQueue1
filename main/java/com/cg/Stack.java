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
    public INode<K> pop(){
    	return linkedList.pop();
    }
    public boolean isEmpty() {
    	if(linkedList.size() == 0)
    		return true;
    	else
    		return false;
    }
    public int size() {
    	return linkedList.size();
    }
}