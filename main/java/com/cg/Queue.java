package com.cg;

public class Queue<K> {

	private final LinkedList<K> linkedList;

	public Queue() {
		this.linkedList = new LinkedList<K>();
	}

	public void enQueue(INode<K> newNode) {
		linkedList.append(newNode);
	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		if (linkedList.size() == 0)
			return true;
		else
			return false;
	}

	public void printQueue() {
		linkedList.print();
	}
	public INode<K> deQueue(){
		return linkedList.pop();
	}
}