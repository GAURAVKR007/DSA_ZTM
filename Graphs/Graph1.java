// Storing a Graph Using Adajacency list 
// Array of ArrayList

import java.util.ArrayList;

class Graph1 {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph( ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        for(int i=0; i<graph.length; i++){
            System.out.print(i+" -> ");
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.dest+" ");
            }
            System.out.println("");
        }
    }
}