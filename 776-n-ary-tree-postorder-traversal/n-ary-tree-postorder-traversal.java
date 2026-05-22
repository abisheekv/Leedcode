import java.util.*;

public class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.addFirst(current.val);

            if (current.children != null) {
                for (Node child : current.children) {
                    stack.push(child);
                }
            }
        }

        return result;
    }
}