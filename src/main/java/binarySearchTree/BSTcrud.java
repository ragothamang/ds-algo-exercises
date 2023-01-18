package binarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import binarySearchTree.BSTConstruction.BST;

public class BSTcrud {
	 static class BST {
		    public int value;
		    public BST left;
		    public BST right;

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

		    public boolean contains(int value) {
		      // Write your code here.
		      if (this.value < value) {
		        if (right == null) return false;
		        else return right.contains(value);
		      } else if (this.value > value) {
		        if (left == null) return false;
		        else return left.contains(value);
		      }

		      return true;
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

			  private static void preOrderTraverseHelper(BST root, List<Integer> array) {
			    if (root != null) {
			      array.add(root.value);
			      preOrderTraverseHelper(root.left, array);
			      preOrderTraverseHelper(root.right, array);
			    }
			  }

			  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
			    // Write your code here.
			    preOrderTraverseHelper(tree, array);
			    return array;
			  }

			  private static void postOrderTraverseHelper(BST root, List<Integer> array) {
			    if (root != null) {
			      postOrderTraverseHelper(root.left, array);
			      postOrderTraverseHelper(root.right, array);
			      array.add(root.value);
			    }
			  }

			  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
			    // Write your code here.
			    postOrderTraverseHelper(tree, array);
			    return array;
			  }

		    public BST remove(int value) {
		      // Write your code here.
		      // Do not edit the return statement of this method.
		      remove(value, null);
		      return this;
		    }
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
		
		List<Integer> preArray = new ArrayList<Integer>(); 
		List<Integer> inArray = new ArrayList<Integer>();
		List<Integer> postArray = new ArrayList<Integer>();
				
//		inputArray = sbtTree.inOrderTraverse(sbtTree, inputArray);
				System.out.println("Pre-Order");
				System.out.println( sbtTree.preOrderTraverse(sbtTree, preArray));
				
				System.out.println("Inorder");
				System.out.println( sbtTree.inOrderTraverse(sbtTree, inArray));
				
				System.out.println("Post Order");
				System.out.println( sbtTree.postOrderTraverse(sbtTree, postArray));
		
	}

}
