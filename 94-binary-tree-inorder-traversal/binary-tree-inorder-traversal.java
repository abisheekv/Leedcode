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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            // Backtrack from the empty left child
            curr = stack.pop();
            res.add(curr.val);
            
            // We have visited the node and its left subtree. 
            // Now, it's the right subtree's turn.
            curr = curr.right;
        }
        
        return res;
    }
}