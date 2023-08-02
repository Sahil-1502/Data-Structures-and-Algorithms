import java.util.*;
public class IsCycleDirected{

    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,2));

        //vertex 1
        graph[1].add(new Edge(1,0));

        //vertex 2
        graph[2].add(new Edge(2,3));

        //vertex 3
        graph[3].add(new Edge(3,0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(visited[i] != true){
                if(isCycleUtil(graph,visited,stack,i) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[],boolean visited[],boolean stack[], int src){
        //visit
        visited[src] =true;
        stack[src] =true;

        for(int i=0; i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            // neighbour is already in stack
            if(stack[e.dest]==true){
                return true;
            }
            if(visited[e.dest] != true){
                if(isCycleUtil(graph,visited,stack,e.dest)){
                    // stack[e.dest] = false;                      //not needed
                    return true;
                }
            }
        }
        stack[src] = false;
        return false;
    }

    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}