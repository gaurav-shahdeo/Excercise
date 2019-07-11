import java.util.ArrayList;
import java.util.List;

public class Graph {
    int V;
    List<Integer>[] adjList;

    public Graph(int v) {
        V = v;
        this.adjList = new ArrayList[V+1];

        for(int i=0; i<=V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest) {
        this.adjList[src].add(dest);
        this.adjList[dest].add(src);
    }

    public void createGraph() {
        this.addEdge(0, 1);
        this.addEdge(0, 2);
        this.addEdge(1, 2);
        this.addEdge(2, 0);
        this.addEdge(2, 3);
        this.addEdge(3, 3);
    }
}
