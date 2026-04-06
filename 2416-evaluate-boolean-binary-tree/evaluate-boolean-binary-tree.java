/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        
        // Leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        // Evaluate left & right
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        // Apply operation
        if (root.val == 2) { // OR
            return left || right;
        } else { // AND (val == 3)
            return left && right;
        }
    }
}