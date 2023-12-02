class MyStack {
Queue<Integer> q;
    public MyStack() {
   q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int n=q.size();
        for(int i=0; i<n-1; i++){
           q.add(q.remove());
        }
        int ans=q.remove();
        return ans;
    }
    
    public int top() {
        for(int i=0; i<q.size()-1; i++)
        {
           
            q.add(q.remove());
             
        }
        int ans=q.peek();
            q.add(q.remove());
            return ans;
        
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }
            return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */