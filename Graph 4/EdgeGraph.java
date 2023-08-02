import java.util.*;

//Same time Complexity as befor bas dekhneme thoda aacha lagta hai coz 2 for loop nahi hai
public class EdgeGraph {
    
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

    public static void createGraph(ArrayList<Edge> edges){

        //vertex 0
        edges.add(new Edge(0,1,2));
        edges.add(new Edge(0,1,2));

        //vertex 1
        edges.add(new Edge(1,2,-4));

        //vertex 2
        edges.add(new Edge(2,3,2));

        //vertex 3
        edges.add(new Edge(3,4,4));

        //vertex 4
        edges.add(new Edge(4,1,-1));

    }

    //O(VE)
    public static void bellmanFord(ArrayList<Edge> edges, int src, int V){
        int dist[] = new int[V];
        dist[src] = 0;
        for(int i =0;i<V;i++){
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // O(E)
        for(int i =1 ;i<V;i++){                  //outer loop V-1

            // edges - O(E)
            for(int k=0;k<edges.size();k++){         //all edges
                Edge e = edges.get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){                         //(dist[u]+wt<dist[v])
                    dist[v] = dist[u]+wt;
                }
            
            }
        }

        for(int i=0;i<V;i++){
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String args[]){
        // Edge Graph        
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        bellmanFord(edges, 0, 5);
    }


}
