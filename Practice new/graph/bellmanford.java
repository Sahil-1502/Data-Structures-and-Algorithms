class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int dist[] = new int[V];
        dist[S] = 0;
        for(int i=0;i<V;i++){
            if(i!=S){
                dist[i]=100000000;
            }
        }
        
        for(int i=0;i<V-1;i++){
            for(int j=0;j<edges.size();j++){
                int u = edges.get(j).get(0);
                int v = edges.get(j).get(1);
                int wt = edges.get(j).get(2);
                if(dist[u] != 100000000 && dist[u] + wt < dist[v]){
                    dist[v] = dist[u]+wt;
                }
            }
        }
        
        for(int j=0; j<edges.size();j++){
            int v = edges.get(j).get(1);
            int u = edges.get(j).get(0);
            int wt = edges.get(j).get(2);
            if(dist[u] != 100000000 && dist[v]>dist[u]+wt){
                int ans[] = {-1};
                return ans;
            }
        }
        
        
        return dist;
    }
}