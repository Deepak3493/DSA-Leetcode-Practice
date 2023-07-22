/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null && temp2!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(headA == headB){
            return headA;
        }
        if(temp1==null){
            temp1 = headB;
            return checkAns(temp1, temp2, headA);
        }
        else{
            temp2 = headA;
            return checkAns(temp2, temp1, headB);
        }
    }
    public static ListNode checkAns(ListNode temp1 , ListNode temp2, ListNode head) {
        while(temp1!=null){
            if(temp2 == null){
                temp2 = head;
            }
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}