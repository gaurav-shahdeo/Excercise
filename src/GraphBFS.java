import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.createGraph();
        bfs(graph);
    }

    private static void bfs(Graph graph) {
        boolean[] visited = new boolean[graph.V];
        bfsUtil(graph, 2, visited);
    }

    private static void bfsUtil(Graph graph, int src, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()) {
            int temp = q.poll();
            System.out.println(temp);

            List<Integer> nodes = graph.adjList[temp];
            //System.out.println(nodes);
            for(Integer node : nodes) {
                if(!visited[node]) {
                    q.add(node);
                    visited[node] = true;
                }
            }
        }
    }
}
