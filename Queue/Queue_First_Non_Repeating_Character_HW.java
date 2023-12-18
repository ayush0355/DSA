//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        char ch[]=new char[A.length()];
        for(int i=0; i<A.length(); i++){
            q.add(A.charAt(i));
            if(hm.containsKey(A.charAt(i))==true){
                int temp=hm.get(A.charAt(i));
                hm.put(A.charAt(i),temp+1);
            }
            else{
                hm.put(A.charAt(i),1);
            }
            while(q.size()>0 && hm.get(q.peek())>1){
                q.remove();
            }
            if(q.size()>0){
                ch[i]=q.peek();
            }
            else{
                ch[i]='#';
            }
        }
        
        return String.valueOf(ch);
    }
}