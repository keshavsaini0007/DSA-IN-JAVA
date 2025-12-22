import java.util.*;
public class basic_weighted {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d,int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    
    public static void MakeGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 3));
        graph[1].add(new Edge(1, 2, -1));
        graph[1].add(new Edge(1, 3, 2));
        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 1, -6));
        graph[2].add(new Edge(2, 3, 3));
        graph[3].add(new Edge(3, 1, 4));
        graph[3].add(new Edge(3, 2, 2));

    }
    
    public static void main(String args[]){
        int vertex = 4;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        MakeGraph(graph);

        // print 2's neighbours 
        System.out.print("destinations and weight of 2 are : ");
        for(int i = 0; i<graph[1].size(); i++){
            Edge E = graph[1].get(i);
            System.out.print("\n("+E.dest+","+ E.wt+")"); 
        }
    }
}