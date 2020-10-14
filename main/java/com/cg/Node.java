package com.cg;

public class Node<K extends Comparable<K>> implements INode<K> {
	private INode next;
	private K key;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setNext(INode next) {
		this.next = (Node<K>) next;
	}
}