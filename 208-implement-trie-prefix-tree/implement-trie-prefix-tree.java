class Trie {
    Node root = new Node();
    public Trie() {

    }
    public void insert(String word) {
        Node root1 = root;
        for(int i=0;i<word.length();i++){
            int k = word.charAt(i) - 'a';
            if(root1.node[k]==null){
                root1.node[k] = new Node();
            }
            root1 = root1.node[k];
        }
        root1.isEnd = true;
    }
    
    public boolean search(String word) {
       Node root1 = root;
        for(int i=0;i<word.length();i++){
            int k = word.charAt(i) - 'a';
            if(root1.node[k]==null){
                return false;
            }
            root1 = root1.node[k];
        }
        return root1.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node root1 = root;
        for(int i=0;i<prefix.length();i++){
            int k = prefix.charAt(i) - 'a';
            if(root1.node[k]==null){
                return false;
            }
            root1 = root1.node[k];
        }
        return true;
    }
}
class Node{
    Boolean isEnd ;
    Node [] node ;
    Node(){
      isEnd = false;
      node = new Node[26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */