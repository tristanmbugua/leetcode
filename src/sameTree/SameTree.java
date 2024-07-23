package sameTree;

import invertBinaryTree.TreeNode;

public class SameTree{

	public static void main(String args[]) {
		TreeNode root = new TreeNode();
		TreeNode root2 = new TreeNode();
		
		root.val = 1;
		root.left = null;
		root.right = new TreeNode(3);
		
		root2.val = 1;
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		
		System.out.println(isSameTree(root, root2));
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
        	return true;
        }
        
        if (p == null || q == null) {
        	return false;
        }
        
		if (p.val == q.val) {
        	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
