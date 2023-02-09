package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

import binarySearchTree.BSTcrud.BST;

public class FindKthLargestValueInBST {
	
	static class BST {
	    public int value;
	    public BST left = null;
	    public BST right = null;

	    public BST(int value) {
	      this.value = value;
	    }
	    
	    public BST insert(int value) {
		      // Write your code here.
		      // Do not edit the return statement of this method.
		      if (value < this.value) {
		        if (left == null) {
		          BST node = new BST(value);
		          left = node;
		        } else left.insert(value);
		      } else {
		        if (right == null) {
		          BST node = new BST(value);
		          right = node;
		        } else right.insert(value);
		      }

		      return this;
		    }
	    
	    private int mininumValue() {
		      if (left == null) return this.value;
		      else return left.mininumValue();
		    }

		    private void remove(int value, BST root) {
		      if (value < this.value) {
		        if (left != null) left.remove(value, this);
		      } else if (value > this.value) {
		        if (right != null) right.remove(value, this);
		      } else {
		        if (left != null && right != null) {
		          this.value = right.mininumValue();
		          right.remove(this.value, this);
		        } else if (root == null) {
		          if (left != null) {
		            this.value = left.value;
		            right = left.right;
		            left = left.left;
		          } else if (right != null) {
		            this.value = right.value;
		            left = right.left;
		            right = right.right;
		          } else {
		            // Single Node
		          }
		        } else if (root.left == this) root.left = left != null ? left : right;
		        else if (root.right == this) root.right = left != null ? left : right;
		      }
		    }
		    
		    private static void inOrderTraverseHelper(BST root, List<Integer> array) {
			    if (root != null) {
			      inOrderTraverseHelper(root.left, array);
			      array.add(root.value);
			      inOrderTraverseHelper(root.right, array);
			    }
			  }
		    
		    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
			    // Write your code here.
			    inOrderTraverseHelper(tree, array);
			    return array;
			  }
	    
	  }

	class Node {
	    int value;
	    int numberOfNodesVisited;

	    public Node(int value, int numberOfNodesVisited) {
	      this.value = value;
	      this.numberOfNodesVisited = numberOfNodesVisited;
	    }
	  }

	
	
	private void findKthLargestValueInBst(BST root, Node current, int k) {
	    if (root == null || current.numberOfNodesVisited >= k) return;

	    findKthLargestValueInBst(root.right, current, k);

	    if (current.numberOfNodesVisited < k) {
	      current.numberOfNodesVisited += 1;
	      current.value = root.value;
	      findKthLargestValueInBst(root.left, current, k);
	    }
	  }

	  
	  
	  public int findKthLargestValueInBst(BST tree, int k) {
	    // Write your code here.
	    Node current = new Node(-1, 0);

	    findKthLargestValueInBst(tree, current, k);

	    return current.value;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BST sbtTree = new BST(10);
		sbtTree.insert(92);
		sbtTree.insert(63);
		sbtTree.insert(49);
		sbtTree.insert(35);
		sbtTree.insert(61);
		sbtTree.insert(74);
		sbtTree.insert(86);
		sbtTree.insert(9);
		
		
		int minValue = sbtTree.mininumValue();
		System.out.println(" minValue "+  minValue);
		
		BSTcrud bstcrudObj = new BSTcrud();
		
		 
		List<Integer> inArray = new ArrayList<Integer>();
						
				System.out.println("Inorder");
				System.out.println( sbtTree.inOrderTraverse(sbtTree, inArray));
				
				FindKthLargestValueInBST obj = new FindKthLargestValueInBST();		
		int nthMaxValue = 	obj.findKthLargestValueInBst(sbtTree, 3);
		
		System.out.println(" nthMaxValue  "+ nthMaxValue);
		
	}

}
