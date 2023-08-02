import java.util.*;
public class TopologicalSortingDFS {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src =s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        //vertex 2
        graph[2].add(new Edge(2,3));

        //vertex 3
        graph[3].add(new Edge(3,1));

        //vertex 4 
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        //vertex 5
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topologicalsort(ArrayList<Edge> graph[]){
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(visited[i] != true){
                topologicalsortUtil(graph,visited, s, i);
            }    
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    public static void topologicalsortUtil(ArrayList<Edge> graph[],boolean visited[],Stack<Integer> s,int src){
        //visit
        visited[src] = true;

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);

            if(visited[e.dest] != true){
                topologicalsortUtil(graph,visited,s,e.dest);
            }

        }
        s.push(src);

    }   

    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalsort(graph);
    }
}
