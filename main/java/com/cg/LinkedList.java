package com.cg;

public class LinkedList<K extends Comparable<K>> {
	INode<K> head;
	INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	public void addSort(INode<K> newNode) {
		INode<K> node1 = head;
		INode<K> node2 = null;
		while(node1 != null && newNode.getKey().compareTo(node1.getKey()) > 0) {
			node2 = node1;
			node1 = node1.getNext();
		}
		if(node2 == null) {
			this.head = newNode;
		}else {
			node2.setNext(newNode);
		}
		newNode.setNext(node1);
		while(node1 != null) {
			this.tail = node1;
			node1 = node1.getNext();
		}

	}

	public void insert(INode<K> preNode, INode newNode, INode nextNode) {
		preNode.setNext(newNode);
		newNode.setNext(nextNode);
	}

	public void insert(INode<K> preNode, INode<K> newNode) {
		INode<K> tempNode = preNode.getNext();
		preNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode<K> pop() {
		INode<K> tempNode = head;
		head = head.getNext();
		return tempNode;
	}

	public void pop(INode<K> node) {
		INode<K> tempNode = head;
		while (tempNode.getNext() != node) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(node.getNext());
	}

	public int size() {
		int size = 0;
		INode<K> tempNode = head;
		while (tempNode != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}

	public INode<K> popLast() {
		INode<K> tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode<K> searchNode(K key) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey() == key)
				return tempNode;
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void print() {
		System.out.println("Printing LinkedList");
		StringBuffer myNodes = new StringBuffer();
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

} 