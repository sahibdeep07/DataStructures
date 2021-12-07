package BinaryTree;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        tree.postOrder(root);
        System.out.println("");
        tree.preOrder(root);
        System.out.println("");
        tree.inorder(root);
    }
}
