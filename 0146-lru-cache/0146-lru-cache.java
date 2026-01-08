class LRUCache {

    HashMap<Integer,Node> mp = new HashMap<>();
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new HashMap();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int val = -1;
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            val = node.val;
            insertAfterHead(node);
        }
        return val; 
    }
    
    public void put(int key, int value) {
        int size = mp.size();
        if(mp.containsKey(key)){
                Node node = mp.get(key);
                node.val = value;
                insertAfterHead(node);
        }
        else{
            if(size>=capacity )
                deleteNodeFromTail();
            insertAfterHead(new Node(key,value));
            
        }

        return;
    }

    public void insertAfterHead(Node node){
        if(mp.containsKey(node.key)){
            node = mp.get(node.key);
            Node next = node.next;
            Node prev = node.prev;
            prev.next = next;
            next.prev = prev;
            
            Node nextOfHead = head.next;
            head.next = node;
            node.prev = head;
            node.next = nextOfHead;
            nextOfHead.prev = node;
        }
        else{
            mp.put(node.key, node);
            Node temp = head.next;
            head.next = node;
            node.next = temp;
            temp.prev = node;
            node.prev = head;
        }
    }

    public void deleteNodeFromTail(){ 
        // if(head.next.val == tail.val)
        //    return;
        mp.remove(tail.prev.key);
        Node prev = tail.prev.prev;
        prev.next = tail;
        tail.prev = prev;
    }

    static class Node {
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