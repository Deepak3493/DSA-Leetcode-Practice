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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        int count = 0;
        while(count<n && second!=null){
            count++;
            second = second.next;
        }
        if(second ==null && count!=n){
            return head;
        }
        if(second ==null && count ==n){
            return first.next;
        }
        while(second!=null && second.next!=null){
            first = first.next;
            second = second.next;
        }
        if(first.next!=null){
          first.next = first.next.next;
        }
        return head;
    }
}