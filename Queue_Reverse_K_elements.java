class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
         Stack<Integer> st=new Stack<>();
   for(int i=0; i<k; i++){
       st.add(q.remove());
   }
   for(int i=0; i<k; i++){
       q.add(st.pop());
   }
   for(int i=0; i<q.size()-k; i++){
       q.add(q.remove());
   }
   return q;
    }
}