package com.omer.balancedBinaryTree;

public class Node {
	private Node left;
	private Node right;
	private Node parent;
	private int key;
	
	public Node () {
		left = null;
		right = null;
		parent = null;
		key = 0;
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}	
}


