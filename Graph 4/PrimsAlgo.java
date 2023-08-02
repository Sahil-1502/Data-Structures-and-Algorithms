import java.util.*;
public class PrimsAlgo {

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
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        //vetex 1
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        // vertex 2
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        //vertex 3
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

    }

    static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n,int cost){
            this.node = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; 
        }
    }

    public static void prims(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,0));
        int finalCost = 0;  //MST OR min Weight AL<Edge>

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(visited[curr.node] != true){
                visited[curr.node] = true;
                finalCost += curr.cost;

                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("Final cost to make mst is " + finalCost);
    }


    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }    
}
