import java.io.*;
import java.util.*;

public class Solution {
    public static String kthEvenPali(int k){
        Queue<String> q=new LinkedList<>();
        q.add("11");
        q.add("22");
        String ans="";
        for(int i=1; i<=k; i++){
            ans=q.remove();
            int n=ans.length();
            q.add(ans.substring(0,n/2)+"11"+ans.substring((n/2),n));
                  q.add(ans.substring(0,n/2)+"22"+ans.substring((n/2),n));
        }
                        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(kthEvenPali(n));
    }
}