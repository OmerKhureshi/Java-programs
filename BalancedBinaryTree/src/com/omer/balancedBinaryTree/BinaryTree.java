package com.omer.balancedBinaryTree;

import java.util.Stack;

public class BinaryTree {
	Node root;
	public BinaryTree(Node root) {
		setRoot(root);
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insertNode(Node node) {
		Node ptr = root;
		Node last = null;
		
		while (ptr != null) {
			last = ptr;
			if (node.getKey() < ptr.getKey()) {
				ptr = ptr.getLeft();	
			} else if (node.getKey() >= ptr.getKey()) {
				ptr = ptr.getRight();
			}
		}
		node.setParent(last);
		if (root == null) {
			root = node;
		}else if ( node.getKey()< last.getKey() ) {
			last.setLeft(node);
		}else if ( node.getKey() >= last.getKey() ) {
			last.setRight(node);
		}
		
	}
	
	public int getMinimum(Node root) {
		Node ptr = root;
		while ( ptr.getLeft() != null ) {
			ptr = ptr.getLeft();
		}
		return ptr.getKey();
	}

	public int getMaximum(Node root) {
		Node ptr = root;
		while ( ptr.getRight() != null ) {
			ptr = ptr.getRight();
		}
		return ptr.getKey();
	}
	
	public Stack<Integer> inOrderRec(Node root, Stack<Integer> results) {
		if (root == null)
			return null; 
		inOrderRec(root.getLeft(), results);
		results.push(root.getKey());
		inOrderRec(root.getRight(), results);
		
		return results;
	}
	
	public Stack<Integer> inOrderWalk(Node root) {
		Stack<Node> temp = new Stack<Node>();
		Stack<Integer> results = new Stack<Integer>();
		Node cur = root;
		
		while (cur != null) {
			temp.push(cur);
			cur = cur.getLeft();
		}
		while (!temp.isEmpty()) {
			cur = temp.pop();
			results.push(cur.getKey());
			cur = cur.getRight();
			while (cur != null) {
				temp.push(cur);
				cur = cur.getLeft();
			}
		}
		return results;
	}
	
	public int getMaxHeight(Node root) {
		int heightLeft = 0;
		int heightRight = 0;
		
		if (root == null)
			return 0; 
		
		heightLeft = getMaxHeight(root.getLeft());
		heightRight = getMaxHeight(root.getRight());
		return heightLeft > heightRight ? heightLeft + 1 : heightRight + 1;
	}
	
	public Stack<Integer> postOrder(Node root) {
		Node prev = null;
		Node cur = null;
		Stack<Node> s = new Stack<Node>();
		Stack<Integer> results = new Stack<Integer>();
		s.push(root);
		while (!s.isEmpty()) {
			cur = s.peek();
			//if we are walking down the tree
			if (prev == null || prev.getLeft() == cur || prev.getRight() == cur) {
				if(cur.getLeft() != null) {
					s.push(cur.getLeft());
				} else if (cur.getRight() != null) {
					s.push(cur.getRight());
				}
			} 
			// if we are walking up the tree
			else if ( prev == cur.getLeft()) {
				if (cur.getRight() != null) {
					s.push(cur.getRight());
				}
			}
			//if we have reached the last node
			else {
				results.push(s.pop().getKey());
			}
			prev = cur;			
		}
		
		return results;
	}
	
//	public Stack<Node> postOrderTwoStacks(Node root) {
//		Stack<Node> ordered = new Stack<Node>();
//		Stack<Node> s = new Stack<Node>();
//		Node cur = root;
//		s.push(root);
//		while(s.peek() != null) {
//			cur = s.pop();
//			ordered.push(cur);
//			if (cur.getLeft() != null) {
//				s.push(cur.getLeft());
//				cur = cur.getLeft();
//			} else if (cur.getRight() != null) {
//				s.push(cur.getRight());
//				cur = cur.getRight();
//			} else {
//				cur = s.pop();
//			}
//			
//		}
//		return ordered;
//	}


}

