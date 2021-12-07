package BinaryTree;

import java.util.Scanner;

public class Tree {
    Scanner sc = new Scanner(System.in);

    Node createTree() {
        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left for" + data);
        root.leftChild = createTree();
        System.out.println("Enter right for" + data);
        root.rightChild = createTree();
        return root;
    }

    void postOrder(Node root) {
        //System.out.print("Postorder : ");
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }

    void preOrder(Node root) {
        //System.out.print("Preorder");
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }

    }

    void inorder(Node root) {
        //System.out.println("Inorder");
        if (root != null) {
            inorder(root.leftChild);
            System.out.print(root.data + " ");
            inorder(root.rightChild);
        }
    }
}
