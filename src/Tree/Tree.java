package Tree;

import java.util.*;

public class Tree {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.print("Preorder : ");
        preorder(root);
        System.out.print("Inorder : ");
        inorder(root);
        System.out.print("Postorder : ");
        postorder(root);
        System.out.print("Level order : ");
        levelOrder(root);
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new Node(data);
        System.out.println("Enter data for left of " + data + " : ");
        root.leftChild = createTree();
        System.out.println("Enter data for right of " + data + " : ");
        root.rightChild = createTree();
        return root;
    }

    static void preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.data);
            if (node.rightChild != null) stack.push(node.rightChild);
            if (node.leftChild != null) stack.push(node.leftChild);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    static void inorder(Node root) {
        Node current = root;
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean done = false;
        while (!done) {
            while (current != null) {
                stack.push(current);
                current = current.leftChild;
            }
            if (stack.isEmpty()) done = true;
            else {
                current = stack.pop();
                list.add(current.data);
                current = current.rightChild;
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    static void postorder(Node root) {
        Node current = root;
        Stack<Node> stackOne = new Stack<>();
        Stack<Node> stackTwo = new Stack<>();
        stackOne.push(root);
        while (!stackOne.isEmpty()) {
            Node n = stackOne.pop();
            stackTwo.push(n);
            if (n.leftChild != null) stackOne.push(n.leftChild);
            if (n.rightChild != null) stackOne.push(n.rightChild);
        }
        while (!stackTwo.isEmpty()) {
            System.out.print(stackTwo.pop().data + " ");
        }
    }

    static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            list.add(n.data);
            if (n.leftChild != null) {
                queue.add(n.leftChild);
            }
            if (n.rightChild != null) {
                queue.add(n.rightChild);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}


class Node {
    Node leftChild, rightChild;
    int data;

    Node(int data) {
        this.data = data;
    }
}


