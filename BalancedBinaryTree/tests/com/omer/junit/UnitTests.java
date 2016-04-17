package com.omer.junit;

import com.omer.balancedBinaryTree.*;
import static org.junit.Assert.*;

import java.util.Stack;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting the unit tests.");	
			
	}
	
	
	@Test
	public void testMethods() {
		
		Node root = new Node();
		root.setKey(15);
		BinaryTree binaryTree = new BinaryTree(root);
		int[] input = {5, 3, 7, 30, 19, 35, 20, 25};
		for (int i = 0; i < input.length; i++) {
			Node node = new Node();
			node.setKey(input[i]);
			binaryTree.insertNode(node);
		}

		Stack<Integer> inOrder = new Stack<Integer>();
		inOrder.push(3);
		inOrder.push(5);
		inOrder.push(7);
		inOrder.push(15);
		inOrder.push(19);
		inOrder.push(20);
		inOrder.push(25);
		inOrder.push(30);
		inOrder.push(35);
		
		Stack<Integer> postOrder = new Stack<Integer>();
		postOrder.push(3);
		postOrder.push(7);
		postOrder.push(5);
		postOrder.push(25);
		postOrder.push(20);
		postOrder.push(19);
		postOrder.push(35);
		postOrder.push(30);
		postOrder.push(15);
		
		assertEquals("The maximum valued node of the binary tree should be 35", 35, binaryTree.getMaximum(root));
		assertEquals("The minimum valued node of the binary tree should be 3", 3, binaryTree.getMinimum(root));
		assertEquals("The maximum height of the tree shouls be 5", 5, binaryTree.getMaxHeight(root));
		
		assertEquals("The inOrder sequence for the binary tree should be [3,5,7,15,19,20,25,30,35]", inOrder, binaryTree.inOrderWalk(root));
		assertEquals("The inOrder sequence using recursive algorithm for the binary tree should be [3,5,7,15,19,20,25,30,35]", inOrder, binaryTree.inOrderRec(root, new Stack<Integer>()));
		assertEquals("The postOrder sequence for the binary tree should be [3,7,5,25,20,19,35,30,15]", postOrder, binaryTree.postOrder(root));
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Finished unit tests. All tests passed.");
	}

}
