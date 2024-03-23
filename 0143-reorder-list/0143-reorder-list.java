/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        // Step 1: Find the middle point of the linked list
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Split the linked list into two halves
        ListNode secondHalf = slow.next;
        slow.next = null;
        
        // Step 3: Reverse the second half using a stack
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = secondHalf;
        
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        
        // Step 4: Merge the first and reversed second half of the linked list alternately
        ListNode first = head;
        
        while (!stack.isEmpty()) {
            ListNode nextFirst = first.next;
            ListNode reversedNode = stack.pop();
            
            first.next = reversedNode;
            reversedNode.next = nextFirst;
            
            first = nextFirst;
        }
    }
}
