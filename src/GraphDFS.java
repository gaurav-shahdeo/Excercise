import java.util.List;

public class GraphDFS {

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.createGraph();
        dfs(graph);
    }

    private static void dfs(Graph graph) {
        boolean[] visited = new boolean[graph.V];
        dfsUtil(graph, 2, visited);
    }

    private static void dfsUtil(Graph graph, int src, boolean[] visited) {

        visited[src] = true;
        System.out.println(src);

        List<Integer> nodes = graph.adjList[src];
        for(Integer node : nodes) {
            if(!visited[node])
                dfsUtil(graph, node, visited);
        }
    }
}
