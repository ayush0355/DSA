import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPath(int n,int m,int edges[][],int sn,int dn){
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean [n];
        for(int i=0; i<n; i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);            
            graph.get(v).add(u);
        }
        q.add(sn);
        vis[sn]=true;
        while(q.size()>0){
            int rem=q.remove();
        List<Integer> nbrs=graph.get(rem);
            for(int v:nbrs){
                if(vis[v]==false){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
        if(vis[dn]==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int edges[][]=new int [m][2];
        for(int i=0; i<m; i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        int sn=sc.nextInt();
        int dn=sc.nextInt();
        System.out.println(isPath(n,m,edges,sn,dn));

    }
}