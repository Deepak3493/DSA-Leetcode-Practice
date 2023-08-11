class LRUCache {

    static class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    HashMap<Integer, Node> mp = new HashMap<>();
    Node head = null;
    Node tail = null;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head  = new Node(-1,-1);
        tail  = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node nd = mp.get(key);
        if(nd ==null){
            return -1;
        }
        remove(nd);
        insert(nd);
        return nd.val;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            remove(mp.get(key));
        }
        if(mp.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    public void insert(Node node){
        mp.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next.prev  = node;
        head.next = node;
    }

    public void remove(Node node){
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

 