/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node temp = head;
       HashMap<Node, Node> mp = new HashMap<>();
       Node newHead = null;
       Node newTemp = null;
       while(temp!=null){
           mp.put(temp, new Node(temp.val));
           temp = temp.next;
       }
       temp = head;
       while(temp!=null){
           if(newHead ==null){
               newHead = mp.get(temp);
               newTemp = newHead;
           }
           newTemp.next = mp.get(temp.next);
           newTemp.random = mp.get(temp.random);
           newTemp = newTemp.next;
           temp = temp.next;
       }
       return newHead;

    }
}