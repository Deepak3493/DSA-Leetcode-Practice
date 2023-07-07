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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode head1 = reverse(l1);
        // ListNode head2 = reverse(l2);
        return add(l1,l2);
    }
    // public static ListNode reverse(ListNode head){
    //     if(head == null || head.next == null)
    //         return head;
    //     ListNode newHead = reverse(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newHead;
    // }

    // public static ListNode reverse(ListNode head){
    //     ListNode pre = null;
    //     ListNode curr = head;
    //     while(curr!=null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }

    public static ListNode add(ListNode head1, ListNode head2){
        if(head1==null)
           return head2;
        if(head2==null)
           return head1;

        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        int carry = 0;
        int sum = 0;
        while(head1!=null && head2!=null){
            int first = head1.val;
            int second = head2.val;
            int presumVal = first+second+carry;
            int val = presumVal%10;
            carry = presumVal/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1!=null){
            int first = head1.val;
            int presumVal = first+carry;
            int val = presumVal%10;
            carry = presumVal/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            head1=head1.next;
        }
        while(head2!=null){
            int second = head2.val;
            int presumVal = second+carry;
            int val = presumVal%10;
            carry = presumVal/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            head2 = head2.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return newHead.next;
    }
}