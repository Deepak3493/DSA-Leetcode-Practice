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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((p,q)->p.val - q.val);
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null)
               continue;
            pq.add(lists[i]);
        }
        while(!pq.isEmpty()){
             ListNode p = pq.poll();
             dummyHead.next = p;
             dummyHead = dummyHead.next;
             if(p.next!=null){
                 p = p.next;
                 pq.add(p);
             }
        }
        return head.next;

    }

    // static class comparator implements Comparator<ListNode>{
    //     public int compare(ListNode p, ListNode q){
    //         if(p.val>q.val){
    //             return +1;
    //         }
    //         else  if(p.val<q.val){
    //             return -1;
    //         }
    //         else{
    //             return 0;
    //         }
    //     }
    // }
}