package com.greatlearning.Test;
import com.greatlearning.BST.BinarySearchTree;
import com.greatlearning.BST.BinarySearchTree.Node;
import com.greatlearning.Right_Skewed_Binary_Tree.RightSkewedBT;


public class Driver {

	public static void main(String[] args) {

		Node root = null;

		root = BinarySearchTree.insert(root, 50);

		BinarySearchTree.insert(root, 30);
		BinarySearchTree.insert(root, 10);
		BinarySearchTree.insert(root, 60);
		BinarySearchTree.insert(root, 55);
	
		System.out.println("Created Binary search tree  as follows :");
	    BinarySearchTree.printTree( root);
		RightSkewedBT.inOrder(root);
		System.out.println();
		RightSkewedBT.rightSkewed();
		 
	}
	
		
			
		
	}

	

	
