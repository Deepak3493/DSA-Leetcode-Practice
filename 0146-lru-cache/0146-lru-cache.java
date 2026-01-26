class LRUCache {
    int capacity;
    Map<Integer,Node> mp;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int valueTobeReturned = -1;
        if(mp.containsKey(key)){
           Node node = mp.get(key);
           valueTobeReturned = node.val;
           insertAfterHead(node);
        }
        return valueTobeReturned;
    }
    
    public void put(int key, int value) {
        if(mp.size() >= capacity){
            if(mp.size() == capacity){
            if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.val = value;
            insertAfterHead(node);
            return;
        }
            }
            deleteBeforeTail();
        }
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.val = value;
            insertAfterHead(node);
            return;
        }
        Node node = new Node(key,value);
        insertAfterHead(node);
    }

    public void insertAfterHead(Node node){
            if(mp.containsKey(node.key)){
                node  = mp.get(node.key);
                Node prev = node.prev;
                Node next = node.next;
                prev.next = next;
                next.prev = prev;
                Node headsnext = head.next;
                head.next = node;
                node.prev = head;
                node.next = headsnext;
                headsnext.prev = node;
            }
            else{
                mp.put(node.key,node);
                Node headsnext = head.next;
                head.next = node;
                node.prev = head;
                node.next = headsnext;
                headsnext.prev = node;
            }
    }

    public void deleteBeforeTail(){
           Node previous = tail.prev;
           Node x = previous.prev;
           x.next = tail;
           tail.prev = x;
           mp.remove(previous.key);
    }



    static class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */