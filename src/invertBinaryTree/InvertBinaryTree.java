package invertBinaryTree;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        
        TreeNode newNode;
        
        newNode = root.left;
        root.left = root.right;
        root.right = newNode;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

}
