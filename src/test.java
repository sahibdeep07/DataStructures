//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//public class test {
//    public static void main(String[] args) throws FileNotFoundException {
//        HashMap<String, List<String>> hash = new HashMap<>();
//        FileInputStream fis = new FileInputStream("Graph.csv");
//        Scanner sc = new Scanner(fis);
//        while (sc.hasNextLine()) {
//            String[] arr = sc.nextLine().split(",");
//            for (int i = 1; i < arr.length; i++) {
//                if (!hash.containsKey(arr[0])) {
//                    ArrayList<String> arrayList = new ArrayList<>();
//                    arrayList.add(arr[i]);
//                    hash.put(arr[0], arrayList);
//                } else {
//                    List<String> currentValue = hash.get(arr[0]);
//                    currentValue.add(arr[i]);
//                    hash.put(arr[0], currentValue);
//                }
//            }
//        }
//        System.out.println(hash);
//        HashMap<String, Node> nodeMap = new HashMap<>();
//        hash.forEach((s, strings) -> {
//            Node node = new Node();
//            node.tableName = s;
//            node.columns = strings;
//            node.edges = new ArrayList<>();
//            nodeMap.put(s, node);
//        });
//        nodeMap.forEach((s, node) -> {
//            node.columns.forEach(s1 -> {
//                if (s1.contains(".")) {
//                    String str = s1.substring(0, s1.indexOf("."));
//                    if (nodeMap.containsKey(str)) {
//                        node.edges.add(nodeMap.get(str));
//                    }
//                }
//            });
//        });
//        nodeMap.forEach((s, node) -> {
//            System.out.println(node.toString());
//        });


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of vertices");
//        int v = sc.nextInt();
//        System.out.println("Enter the number of edges");
//        int e = sc.nextInt();
//        Graph graph = new Graph(v);
//        System.out.println();
//    }
//}
//
//class Graph {
//    LinkedList<Integer> adj[];
//
//    public Graph(int v) {
//        adj = new LinkedList[v];
//        for (int i = 0; i < v; i++) {
//            adj[i] = new LinkedList<>();
//        }
//    }
//
//    public void addEdge(int source, int destination) {
//        adj[source].add(destination);
//    }
//}

//class Node {
//    String tableName;
//    List<String> columns;
//    List<Node> edges;
//
//    @Override
//    public String toString() {
//        return "Node{" +
//                "tableName='" + tableName + '\'' +
//                ", columns=" + columns +
//                ", edges=" + edges.forEach(node -> node.s) +
//                '}';
//    }
//}
