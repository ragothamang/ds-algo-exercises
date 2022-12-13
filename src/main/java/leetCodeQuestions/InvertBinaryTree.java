package leetCodeQuestions;

public class InvertBinaryTree {
	
	private static BinaryTree invertBinaryTreeHelper(BinaryTree root) {
	    if (root == null) return null;

	    BinaryTree left = invertBinaryTreeHelper(root.left);
	    BinaryTree right = invertBinaryTreeHelper(root.right);

	    root.left = right;
	    root.right = left;

	    return root;
	  }

	  public static void invertBinaryTree(BinaryTree tree) {
	    // Write your code here.
	    tree = invertBinaryTreeHelper(tree);
	  }

	  static class BinaryTree {
	    public int value;
	    public BinaryTree left;
	    public BinaryTree right;

	    public BinaryTree(int value) {
	      this.value = value;
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
