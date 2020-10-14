package com.cg;

public interface INode<K> {
	  K getKey();
	  void setKey(K key);

	  INode getNext();
	  void setNext(INode next);
	}
