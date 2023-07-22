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
            while(temp1!=null){
                if(temp2 == null){
                    temp2 = headA;
                }
                if(temp1 == temp2){
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        if(temp2 == null){

            temp2 = headA;
            while(temp2!=null){
                if(temp1 == null){
                    temp1 = headB;
                }
                if(temp2 == temp1){
                    return temp2;
                }
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
        }
        return null;
    }
}