class MinStack {
    Stack<Integer> mainStack ;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.size()==0 || minStack.peek()>=value){
            minStack.push(value);
        }
    }
    
    public void pop() {
        int val = mainStack.pop();
        if(minStack.size()>0 && minStack.peek()==val){
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */