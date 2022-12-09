package tree;

public class BinaryTree {

	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		return -1;
	}

	static class Node{
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
		}
	} 
	
	

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}		
	}
	
	static BST insert(BST root, int value) {
		if (root == null)
				return new BST(value);
		else if(root.value > value)  {
			root.left = insert(root.left,value );			
		}
		else if(root.value < value)  {
			root.right = insert(root.right,value );			
		}
		return root;		
	}
	static void inorder(BST root)
    {
		int closestValue = 0;
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
	
	static int inorder(BST root, int target)
    {
		int closestValue = 0;
        if(root == null)
//            return;

        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
        if(root.value <= target) {
        	closestValue= root.value;        	
        }
        return closestValue;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bTree = new BST(10);
		insert(bTree, 5);
		insert(bTree, 2);
		insert(bTree, 1);
		insert(bTree, 15);
		insert(bTree, 13);
		insert(bTree, 22);
		insert(bTree, 6);
		insert(bTree, 14);
		inorder(bTree);		
	}

}
