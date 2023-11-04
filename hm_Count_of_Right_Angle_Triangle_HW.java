import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int countTriangle(int x[],int y[]){
        HashMap<Integer,Integer> fx=new HashMap<>();
        HashMap<Integer,Integer> fy=new HashMap<>();
        for(int i=0; i<x.length; i++){
            if(fx.containsKey(x[i])==true){
                int temp=fx.get(x[i]);
                fx.put(x[i],temp+1);
            }
            else{
                fx.put(x[i],1);
            }
            if(fy.containsKey(y[i])==true){
                int temp=fy.get(y[i]);
                fy.put(y[i],temp+1);
            }
            else{
                fy.put(y[i],1);
            }
        }
        int ans=0;
        for(int i=0;i<x.length; i++){
            int count_x=fx.get(x[i]);
            int count_y=fy.get(y[i]);
            ans=ans+(count_x-1)*(count_y-1);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int [n];
        int y[]=new int [n];
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        System.out.println(countTriangle(x,y));
    }
}