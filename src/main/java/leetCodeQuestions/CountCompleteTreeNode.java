package leetCodeQuestions;

public class CountCompleteTreeNode {
	
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	  int height(TreeNode root) {
	        return root == null ? -1 : 1 + height(root.left);
	    }
	    public int countNodes(TreeNode root) {
	        int h = height(root);
	        return h < 0 ? 0 :
	               height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
	                                         : (1 << h-1) + countNodes(root.left);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
