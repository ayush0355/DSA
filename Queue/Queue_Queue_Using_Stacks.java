class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(s1.size()==0){
	       return -1;
	   }
	  int n=s1.size();
	  for(int i=1; i<=n; i++){
	      s2.push(s1.pop());
    }
    int ans=s2.pop();
    for(int i=1; i<=n-1; i++){
        s1.push(s2.pop());
    }
    return ans;
}
}
