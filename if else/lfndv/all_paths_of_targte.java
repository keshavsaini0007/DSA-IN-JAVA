import java.util.*; 
public class all_paths_of_targte {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void makegraph(ArrayList<Edge>[] graph){

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        /*
        
         1 --- 3
       / |     | \
      0  |     |   5 -- 6
       \ |     | /
         2 --- 4
         */

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 4));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));
        // graph[1].add(new Edge(1, 3));
        // graph[1].add(new Edge(1, 5));

        // graph[2].add(new Edge(2, 0));
        // graph[1].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));
        // graph[1].add(new Edge(2, 5));

        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 2));
        // graph[3].add(new Edge(3, 5));

        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 2));

        // graph[5].add(new Edge(5, 1));
        // graph[5].add(new Edge(5, 2));
        // graph[5].add(new Edge(5, 3));
    }

    public static void DFST(ArrayList<Edge>[] graph,int target, boolean[] vis,String path,int curr){
        if(target == curr){
            System.out.println(path);
            return;
        }
        for(int i = 0; i<graph[curr].size(); i++){
            Edge E = graph[curr].get(i);
            if(!vis[E.dest]){
               vis[curr] = true;
               DFST(graph,target,vis,path+E.dest,E.dest);
               vis[curr] = false;
            }
        }
    }
  
    public static void main(String args[]){
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        makegraph(graph);

        boolean[] vis = new boolean[v];
        // for(int i = 0; i<v; i++){
        //     if(vis[i] == false){
        //         
        //     }
        // }
        DFST(graph,5,vis,"",0);
    }
}
