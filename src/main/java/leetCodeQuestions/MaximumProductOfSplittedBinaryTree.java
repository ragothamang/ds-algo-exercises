package leetCodeQuestions;

import leetCodeQuestions.CountCompleteTreeNode.TreeNode;

public class MaximumProductOfSplittedBinaryTree {
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
	
	long res = 0, total = 0, sub;
    public int maxProduct(TreeNode root) {
        total = s(root); s(root);
        return (int)(res % (int)(1e9 + 7));
    }

    private long s(TreeNode root) {
        if (root == null) return 0;
        sub = root.val + s(root.left) + s(root.right);
        res = Math.max(res, sub * (total - sub));
        return sub;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
