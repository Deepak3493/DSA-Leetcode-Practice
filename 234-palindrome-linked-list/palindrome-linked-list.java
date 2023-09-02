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
        if(head ==null || head.next ==null)
             return true;
        Pair p  = findMid(head); 
        ListNode first = head;
        ListNode second = head;
        System.out.println(p.length);
        if(p.length%2==0)
            second = p.mid.next;
        else
            second = p.mid.next.next;
        p.mid.next = null;
        //System.out.println(second.val);
        second = reverse(second);
       // System.out.println(second.val);
        while(first!=null && second!=null){
            if(first.val!=second.val)
               return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        if(head ==null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
    public static Pair findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode temp = head;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        int count =0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        return new Pair(count,prev);
    }
    static class Pair{
        int length;
        ListNode mid;
        Pair(int length, ListNode mid){
            this.length = length;
            this.mid = mid;
        }
    }
}
   