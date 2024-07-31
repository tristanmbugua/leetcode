package balancedBinaryTree;

import invertBinaryTree.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.left = two;
        root.right = three;

        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        two.left = four;
        two.right = five;
        three.left = six;
//        three.right = seven;

        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        TreeNode eleven = new TreeNode(11);
        TreeNode twelve = new TreeNode(12);
        TreeNode thirteen = new TreeNode(13);
        TreeNode fourteen = new TreeNode(14);
        TreeNode fifteen = new TreeNode(15);
        four.left = eight;
        four.right = nine;
        five.left = ten;
        five.right = eleven;
        six.left = twelve;
        six.right = thirteen;
//        seven.left = fourteen;
//        seven.right = fifteen;

//        System.out.println(findHeight(root, 0));
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        /**
         * A height-balanced binary tree is defined as a
         * binary tree in which the height of the left
         * and the right subtree of any node differ
         * by not more than 1.
         */

        int leftHeight = findHeight(root.left, 0);
        int rightHeight = findHeight(root.right, 0);

        int diff = Math.abs(leftHeight - rightHeight);

        if (leftHeight < 2 && rightHeight < 2) {
            return true;
        }

        if ((diff > 1)) {
            return false;
        } else {
            return true;
        }
    }

    public static int findHeight(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }

        depth++;

        return Math.max(findHeight(root.right, depth), findHeight(root.left, depth));
    }
}
