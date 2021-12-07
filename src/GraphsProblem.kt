import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.util.*
import java.util.function.Consumer

val COMMA = ","

fun main() {
    val map = mutableMapOf<String, MutableList<String>>()

    File("Graph.csv").readLines().forEach {
        val data = it.split(COMMA)
        println()
//        map.computeIfAbsent(data.first()) { _ -> data.drop(1).toMutableList() }
//        map.computeIfPresent(data.first()) { _, value -> value.apply { addAll(data.drop(1)) } }
        if (map.containsKey(data.first())) {
            val current = map.get(data.first()) ?: mutableListOf()
            current.add(data.drop(1).toString())
            map.put(data.first(), current)
        } else {
            map.put(data.first(), mutableListOf(data.drop(1).toString()))
        }
    }

    println(map)
}

object test {
    @Throws(FileNotFoundException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val hash = HashMap<String, MutableList<String>>()
        val fis = FileInputStream("Graph.csv")
        val sc = Scanner(fis)
        while (sc.hasNextLine()) {
            val arr = sc.nextLine().split(",".toRegex()).toTypedArray()
            for (i in 1 until arr.size) {
                if (!hash.containsKey(arr[0])) {
                    val arrayList = ArrayList<String>()
                    arrayList.add(arr[i])
                    hash[arr[0]] = arrayList
                } else {
                    val currentValue = hash[arr[0]]!!
                    currentValue.add(arr[i])
                    hash[arr[0]] = currentValue
                }
            }
        }
        println(hash)
        val nodeMap = HashMap<String, Node>()
        hash.forEach { (s: String, strings: List<String>?) ->
            val node = Node()
            node.tableName = s
            node.columns = strings
            node.edges = ArrayList()
            nodeMap[s] = node
        }
        nodeMap.forEach { (s: String?, node: Node) ->
            node.columns!!.forEach(Consumer { s1: String ->
                if (s1.contains(".")) {
                    val str = s1.substring(0, s1.indexOf("."))
                    if (nodeMap.containsKey(str)) {
                        node.edges!!.add(nodeMap[str])
                    }
                }
            })
        }
        nodeMap.forEach { (s: String?, node: Node) -> println(node.toString()) }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of vertices");
//        int v = sc.nextInt();
//        System.out.println("Enter the number of edges");
//        int e = sc.nextInt();
//        Graph graph = new Graph(v);
//        System.out.println();
    }
}


internal class Node {
    var tableName: String? = null
    var columns: List<String>? = null
    var edges: MutableList<Node?>? = null
}