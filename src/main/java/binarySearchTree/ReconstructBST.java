package binarySearchTree;

import java.util.ArrayList;

public class ReconstructBST {
	
	static class BST {
	    public int value;
	    public BST left = null;
	    public BST right = null;

	    public BST(int value) {
	      this.value = value;
	    }

	    public BST(int value, BST left, BST right) {
	      this.value = value;
	      this.left = left;
	      this.right = right;
	    }
	  }

	  static class TreeInfo {
	    int idx;

	    public TreeInfo(int idx) {
	      this.idx = idx;
	    }
	  }

	  private BST reconstructBst(ArrayList<Integer> nodes, int minValue, int maxValue, TreeInfo root) {
	    if (root.idx == nodes.size()) return null;

	    int rootValue = nodes.get(root.idx);

	    if (rootValue < minValue || rootValue >= maxValue) return null;

	    root.idx += 1;

	    BST leftSubtree = reconstructBst(nodes, minValue, rootValue, root);
	    BST rightSubtree = reconstructBst(nodes, rootValue, maxValue, root);

	    return new BST(rootValue, leftSubtree, rightSubtree);
	  }

	  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
	    // Write your code here.
	    return reconstructBst(
	        preOrderTraversalValues, Integer.MIN_VALUE, Integer.MAX_VALUE, new TreeInfo(0));
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
