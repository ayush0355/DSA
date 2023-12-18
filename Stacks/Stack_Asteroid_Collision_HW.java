class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<n){
            if(arr[i]>0){
                st.push(arr[i]);
                i++;
            }
            else{if(st.size()==0 || st.peek()<0){
                    st.push(arr[i]);
                    i++;}
                else if(st.peek()>Math.abs(arr[i])){
                    i++;}
                else if(st.peek()<Math.abs(arr[i])){
                    st.pop();}
                else{st.pop();
                    i++;}
            }
        }
        int ar[]=new int[st.size()];
        for(int ie=ar.length-1; ie>=0; ie--){
            ar[ie]=st.pop();
        }
        return ar;
    }
}