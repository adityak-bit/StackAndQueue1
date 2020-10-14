package com.cg;

import org.junit.Test;
import com.cg.Stack;
import static org.junit.Assert.*;

import org.junit.Assert;

public class StackTest {

	@Test
	public void stackPeakTest() {
		Stack<Integer> stack = new Stack<Integer>();
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(65);
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode node = stack.peak();
		stack.printStack();
		Assert.assertEquals(thirdNode, node);
	}
}
