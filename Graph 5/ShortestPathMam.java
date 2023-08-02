import java.util.*;
import java.util.LinkedList;

public class ShortestPathMam {
    
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int arr[][]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<arr.length;i++){
            graph[arr[i][0]].add(new Edge(arr[i][0],arr[i][1],arr[i][2]));
        }
    }

    static class Pair {
        int node;
        int dist;
        int stops;
        public Pair(int n, int d, int s){
            this.node = n;
            this.dist = d;
            this.stops =s;
        }    
    }

    public static int dijkstra(ArrayList<Edge> graph[], int src, int dest, int k){

        int dist[] = new int[graph.length];
        dist[src] = 0;
        for(int i=0;i<graph.length;i++){
            if(i!=src ){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Pair> pq = new LinkedList<>();  
        pq.add(new Pair(src,0,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(curr.stops>k){
                break;
            }

            for(int i =0;i<graph[curr.node].size();i++){
                Edge e = graph[curr.node].get(i);
                int u =e.src;
                int v =e.dest;
                int wt = e.wt;
                if(curr.dist+wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.dist + wt;
                    pq.add(new Pair(v,dist[v],curr.stops+1));
                }
                
            }
            
        }
        if(dist[dest] != Integer.MAX_VALUE){
            return dist[dest];
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[][] = {{0,1,100},
                        {1,2,100},
                        {2,0,100},
                        {1,3,600},
                        {2,3,200}};

        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, arr);
        int src=0,dest=3,k=1;
        System.out.println(dijkstra(graph, src, dest, k));
    }    

}
