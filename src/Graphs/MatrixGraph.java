package Graphs;

public class MatrixGraph {
    int vertices;
    int edges;
    int adjMatrix[] [];

    MatrixGraph(int vertices){
        this.vertices = vertices;
        edges = 0;
        adjMatrix = new int[vertices][vertices];
    }

    void addEdge(int u, int v){
        edges++;
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    void printGraph(){
        for(int i=0; i<vertices; i++){
            for(int j=0; j<vertices; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(4);
        graph.addEdge(0, 3);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.printGraph();
    }
}

