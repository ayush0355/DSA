class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minST=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            minST.push(val);
        }
        else if(val<minST.peek()){
                st.push(val);
                minST.push(val);
        }
        else{
            st.push(val);
            minST.push(minST.peek());
        }

    }
    
    public void pop() {
        if(st.size()==0){
            return;
        }
        st.pop();
        minST.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       if(st.size()==0){
           return 0;
       }
       return minST.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */