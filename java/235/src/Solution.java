public class Solution {
    public static void main(String[] args) {
        var t1 = new TreeNode(6);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(8);

        var t1Left = t1.left;
        var t1Right = t1.right;
        t1Left.left = new TreeNode(0);
        t1Left.right = new TreeNode(4);
        t1Right.left = new TreeNode(7);
        t1Right.right = new TreeNode(9);

        var t1LeftRight = t1Left.right;
        t1LeftRight.left = new TreeNode(3);
        t1LeftRight.right = new TreeNode(5);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}