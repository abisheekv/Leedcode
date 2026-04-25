class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int gcdValue = gcd(curr.val, curr.next.val);

            // Create new node
            ListNode newNode = new ListNode(gcdValue);

            // Insert between curr and curr.next
            newNode.next = curr.next;
            curr.next = newNode;

            // Move to next original node
            curr = newNode.next;
        }

        return head;
    }

    // Function to find GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}