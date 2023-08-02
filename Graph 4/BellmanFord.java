import java.util.*;

public class BellmanFord{

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

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,1,2));

        //vertex 1
        graph[1].add(new Edge(1,2,-4));

        //vertex 2
        graph[2].add(new Edge(2,3,2));

        //vertex 3
        graph[3].add(new Edge(3,4,4));

        //vertex 4
        graph[4].add(new Edge(4,1,-1));

    }

    //O(VE)
    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        dist[src] = 0;
        for(int i =0;i<graph.length;i++){
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // O(E)
        for(int i =1 ;i<graph.length;i++){                  //outer loop V-1

            // edges - O(E)
            for(int j= 0; j<graph.length;j++){              //all vertices
                for(int k=0;k<graph[j].size();k++){         //all edges
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){                         //(dist[u]+wt<dist[v])
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }

        for(int i=0;i<graph.length;i++){
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        bellmanFord(graph, 0);

    }
}