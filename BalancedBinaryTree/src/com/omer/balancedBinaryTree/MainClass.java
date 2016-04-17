package com.omer.balancedBinaryTree;

import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("Balanced Binary Tree.");
		
		Node root = new Node();
		root.setKey(15);
		BinaryTree binaryTree = new BinaryTree(root);
		int[] input = {5, 3, 7, 30, 19, 35, 20, 25};
		for (int i = 0; i < input.length; i++) {
			Node node = new Node();
			node.setKey(input[i]);
			binaryTree.insertNode(node);
		}	
			
			Stack<Integer> results = new Stack<Integer>();
			results = binaryTree.inOrderRec(root, new Stack<Integer>());
//			results = binaryTree.postOrder(root);
//			results = binaryTree.inOrderWalk(root);
			
			System.out.println("Max height " + binaryTree.getMaxHeight(root));
			while (!results.isEmpty()) {
				System.out.println("-" + results.pop());
			}
		
	}
	
	
}
