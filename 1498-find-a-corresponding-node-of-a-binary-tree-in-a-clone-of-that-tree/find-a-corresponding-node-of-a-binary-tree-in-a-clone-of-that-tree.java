import java.util.*;

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(original);
        q2.add(cloned);

        while (!q1.isEmpty()) {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();

            if (node1 == target) return node2;

            if (node1.left != null) {
                q1.add(node1.left);
                q2.add(node2.left);
            }

            if (node1.right != null) {
                q1.add(node1.right);
                q2.add(node2.right);
            }
        }

        return null;
    }
}