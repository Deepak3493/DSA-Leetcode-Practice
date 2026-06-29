class StockSpanner {
    Stack<Pair> st ;
    int curr ;
    public StockSpanner() {
        st = new Stack<>();
        curr = 1;
    }
    
    public int next(int price) {
        while(st.size()>0 && st.peek().val<=price){
             st.pop();
        }
        int size = st.size()>0 ? curr -  st.peek().ind  : curr;
        st.push(new Pair(curr, price));
        curr++;
        return size;
    }
    class Pair{
        int ind; 
        int val;
        Pair(int ind, int val){
            this.ind = ind;
            this.val = val;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */