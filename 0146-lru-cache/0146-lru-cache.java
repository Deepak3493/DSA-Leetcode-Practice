class LRUCache {
    Node head ;
    Node tail;
    HashMap<Integer,Node> mp = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
           Node node = mp.get(key);
           if(mp.size()>1){
               // remove from curr pos;
               removeNode(node);
               insertAfterHead(node);
           }
           return node.val;
        }
        return -1;
        
    }
    private void removeNode(Node node) {
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }
    private void insertAfterHead(Node node) {
        Node next = head.next;
        node.next = next;
        next.prev = node;
        head.next = node;
        node.prev = head;
    }

    
    public void put(int key, int value) {
        // if already exists
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.val = value;
            mp.put(key,node);
            removeNode(node);
            insertAfterHead(node);
        }
        else{
            int size = mp.size();
            Node node = new Node(key, value);
            if(size>=capacity){
                Node tailfirstPrev = tail.prev;
                removeNode(tailfirstPrev);
                mp.remove(tailfirstPrev.key);
            }
            insertAfterHead(node);
            mp.put(key,node);
        }
    }


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
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */