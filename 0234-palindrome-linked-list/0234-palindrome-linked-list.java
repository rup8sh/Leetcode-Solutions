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
    public boolean isPalindrome(ListNode head) {
        Stack <ListNode> st = new Stack<>();
        ListNode current = head;

        while(current!=null)
        {
            st.push(current);
            current= current.next;
        }
        current = head;
        while(current != null)
        {
            ListNode node = st.pop();
            if(node.val != current.val)
            {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}