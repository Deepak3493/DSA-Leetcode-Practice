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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
           return list2;
        if(list2==null)
           return list1;
        ListNode dummyHead = new ListNode(0);
        ListNode tempHead = dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummyHead.next = list1;
                list1 = list1.next;
                dummyHead = dummyHead.next;
            }
            else{
                dummyHead.next = list2;
                list2 = list2.next;
                dummyHead = dummyHead.next;
            }
        }
        if(list2!=null){
            dummyHead.next = list2;
        }
        if(list1!=null){
            dummyHead.next = list1;
        }
        return tempHead.next;
    }
}