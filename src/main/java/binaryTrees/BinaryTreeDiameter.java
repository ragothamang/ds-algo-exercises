package binaryTrees;

public class BinaryTreeDiameter {
	 // This is an input class. Do not edit.
	  static class TreeInfo {
	    int diameter;
	    int height;

	    public TreeInfo(int diameter, int height) {
	      this.diameter = diameter;
	      this.height = height;
	    }
	  }

	  static class BinaryTree {
	    public int value;
	    public BinaryTree left = null;
	    public BinaryTree right = null;

	    public BinaryTree(int value) {
	      this.value = value;
	    }
	  }

	  private static TreeInfo binaryTreeDiameterHelper(BinaryTree root) {
	    if (root == null) return new TreeInfo(0, 0);

	    TreeInfo leftTreeInfo = binaryTreeDiameterHelper(root.left);
	    TreeInfo rightTreeInfo = binaryTreeDiameterHelper(root.right);

	    int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);
	    int maxSubtreeDiameter = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);

	    // Diameter always is the maximum
	    // value of the three following
	    // values:
	    // 1. Diameter of the left subtree
	    // 2. Diameter of the right subtree
	    // 3. Longest path passing through the current node
	    return new TreeInfo(
	        Math.max(maxSubtreeDiameter, leftTreeInfo.height + rightTreeInfo.height), currentHeight);
	  }

	  public static int binaryTreeDiameter(BinaryTree tree) {
	    // Write your code here.
	    return binaryTreeDiameterHelper(tree).diameter;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(3);
		BinaryTree node2 = new BinaryTree(2);
		BinaryTree node3 = new BinaryTree(7);
		BinaryTree node4 = new BinaryTree(4);
		BinaryTree node5 = new BinaryTree(8);
		BinaryTree node6 = new BinaryTree(5);
		BinaryTree node7 = new BinaryTree(9);
		BinaryTree node8 = new BinaryTree(6);
		
//		BinaryTree node9 = n new BinaryTree(11);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node5;
		node5.left = node7;
		node4.right= node6;
		node6.right= node8;
		
//		node7.right = node9;
//		node9.right = node10;
		
		int result = binaryTreeDiameter(root);
		System.out.println("Result::  "+ result);
	}

}
