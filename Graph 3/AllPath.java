import java.util.*;

// import javax.sound.sampled.SourceDataLine;

public class AllPath {

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

        //vertex 0
        graph[0].add(new Edge(0,3));

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

    public static void findAllPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src == dest){
            System.out.println(path+src);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            findAllPath(graph, e.dest, dest, path+src);
        }
    }



    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src=5, dest = 1;
        findAllPath(graph, src, dest, "");
    }
}
