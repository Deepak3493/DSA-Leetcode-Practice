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
        int l1 = findLength(headA);
        int l2 = findLength(headB);
        int diff = l1-l2;
        ListNode temp1 = null;
        ListNode temp2 = null;
        if(diff>0){
           temp1 = headA;
           temp2 = headB;
        }
        else{
           temp1 = headB;
           temp2 = headA;
           diff = -diff;
        }
        while(diff!=0 && temp1!=null){
           temp1=temp1.next;
           diff--;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.equals(temp2)){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    public int findLength(ListNode headA){
        int count = 0;
        while(headA!=null){
            count++;
            headA = headA.next;
        }
        return count;
    }
}