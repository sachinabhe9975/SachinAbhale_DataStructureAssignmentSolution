package com.greatlearning.Right_Skewed_Binary_Tree;

import java.util.LinkedList;

import com.greatlearning.BST.BinarySearchTree;
import com.greatlearning.BST.BinarySearchTree.Node;

public class RightSkewedBT

{
	static LinkedList<Integer> ll = new LinkedList<>();
	public static Node root1 = null;
	static Node currentPointer = null;

	public static void inOrder(Node root) {
		if (root == null)
			return;
		else {
			inOrder(root.left);
			ll.add(root.key);
			inOrder(root.right);
		}

	}

	public static void rightSkewed()

	{

		root1 = BinarySearchTree.newNode(ll.pop());
		currentPointer = root1;
		while (!ll.isEmpty()) {
			currentPointer = RightSkewedBT.implementRightSkewed(currentPointer, ll.pop());
		}
		System.out.println("Converted Binary search tree to right Skewed Tree as follows :");
		RightSkewedBT.traverseRightSkewed(root1);
	}

	public static Node implementRightSkewed(Node currentRoot, int Tempkey) {

		Node newNode = BinarySearchTree.newNode(Tempkey);

		currentRoot.right = newNode;

		currentRoot.left = null;

		return currentRoot.right;
	}
	
	 
	 public static void traverseRightSkewed(Node root1) 
	 {
				if (root1 == null)
					return;
				else {
					traverseRightSkewed(root1.left);
					System.out.print("  "+root1.key+",");
					traverseRightSkewed(root1.right);
				}
	 }
	
	

}
