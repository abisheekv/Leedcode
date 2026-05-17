/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { 
 *         this.val = val; 
 *         this.next = next; 
 *     }
 * }
 */

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode prevA = list1;
        ListNode afterB = list1;

        // Find node before index a
        for(int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        // Find node after index b
        afterB = prevA;
        for(int i = 0; i < (b - a + 2); i++) {
            afterB = afterB.next;
        }

        // Connect prevA to list2
        prevA.next = list2;

        // Find last node of list2
        while(list2.next != null) {
            list2 = list2.next;
        }

        // Connect last of list2 to afterB
        list2.next = afterB;

        return list1;
    }
}