public class Solution {
    public static void main(String[] args) {
        var t1 = new TreeNode(4);
        // children
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(7);
        // children's children
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(3);
        t1.right.left = new TreeNode(6);
        t1.right.right = new TreeNode(9);

        dfs(t1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Traverse the tree from left to right
    static void dfs(TreeNode node) {
        if (node == null) return;

        var left = node.left;

        node.left = node.right;
        node.right = left;

        dfs(node.left);
        dfs(node.right);
    }

    public static TreeNode invertTree(TreeNode root) {
        dfs(root);

        return root;
    }
}