https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1



public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
       ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        vis[0]=true;
        while(q.size()>0){
            int rem=q.remove();
            bfs.add(rem);
            List<Integer> nbrs=adj.get(rem);
            for(int v:nbrs){
                if(vis[v]==false){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
        return bfs;
    }
}