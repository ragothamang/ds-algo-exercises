package tree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
	public static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    BinaryTree(int value) {
	      this.value = value;
	      this.left = null;
	      this.right = null;
	    }
	  }

	  public static List<Integer> branchSums(BinaryTree root) {
	    // Write your code here.
		  List<Integer> sums = new ArrayList<Integer>();
		  calculateBranchSums(root, 0, sums);
	    return sums;
	  }
	  
	  public static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
//		  System.out.println("Node   "+node + "  Value    "+  node.value + "  runningSum  "+  runningSum + "  sums  "+ sums);
		  if(node == null) return;
		  int newRunningSum = runningSum + node.value;
		 if(node.left == null && node.right == null) {
			 sums.add(newRunningSum);
			 return;
		 }
		 System.out.println("**********  Left ********************");
		  System.out.println("[Left ]Node   "+node + "  Value    "+  node.value + "  newRunningSum  "+  newRunningSum + "  sums  "+ sums);
		  calculateBranchSums(node.left, newRunningSum, sums);
		  System.out.println("**********  right ********************");
		  System.out.println("Node   "+node + "  Value    "+  node.value + "  newRunningSum  "+  newRunningSum + "  sums  "+ sums);
		  calculateBranchSums(node.right, newRunningSum, sums);
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		BinaryTree node2 = new BinaryTree(3);
		BinaryTree node3 = new BinaryTree(4);
		BinaryTree node4 = new BinaryTree(5);
		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);
		BinaryTree node7 = new BinaryTree(8);
		BinaryTree node8 = new BinaryTree(9);
		BinaryTree node9 = new BinaryTree(10);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node7;
		node3.right = node8;
		node4.left = node9;
		node2.left = node5;
		node2.right = node6;
		
		
		
		List<Integer> rst = branchSums(root);
		System.out.println(rst);

	}

}
