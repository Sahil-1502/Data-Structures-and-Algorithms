import java.util.*;

public class DFS {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //vertex 2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //vertex 3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //vertex 4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,4,1));

        //vertex 5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //vertex 6
        // graph[5].add(new Edge(6,5,1));

    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(visited[i] != true){
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean visited[]){
        //visit
        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest]!=true){
                dfsUtil(graph,e.dest,visited);
            }          
        }

    }


    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph);
    }
}
