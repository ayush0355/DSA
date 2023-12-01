import java.io.*;
import java.util.*;

public class Solution {
public static String kth(int k){
Queue<String> q =new LinkedList<>();
q.add("1");
q.add("2");
 String ans="0";
 for(int i=0; i<k; i++){
 ans=q.remove();
 q.add(ans+'1');
 q.add(ans+'2');
 }
 return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(kth(n));

    }
}