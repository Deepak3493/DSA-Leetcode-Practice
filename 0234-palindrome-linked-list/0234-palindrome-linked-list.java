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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start = head;
        ListNode reversedHead = reverse(slow);
        slow.next = null;
        
        while( start!=null  && reversedHead !=null && start.val == reversedHead.val ) {
              System.out.println(start.val);
              start = start.next;
              reversedHead = reversedHead.next;
        }
        return reversedHead == null;

    }
    public static ListNode reverse(ListNode head){
        if(head ==null || head.next == null)
             return head;
        ListNode head1 = reverse(head.next);
        
        head.next.next = head;
        head.next = null;
        return head1;
    }
}