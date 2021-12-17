package Graphs;

import java.util.LinkedList;
import java.util.List;

public class ListGraph {
    LinkedList<Integer> adjList[];
    int vertices;

    ListGraph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    void printGraph(){
        for (LinkedList list: adjList) {
            list.forEach(o -> System.out.print(o+" -> "));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListGraph listGraph = new ListGraph(5);
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 2);
        listGraph.addEdge(0, 3);
        listGraph.addEdge(0, 4);
        listGraph.printGraph();
    }
}
