package Tree;

public class BST {
    public static void main(String[] args) {
        BSTNode node = new BSTNode();
        node.data = 3;
        node.insert(node, 4);
        node.insert(node, 1);
        node.insert(node, 3);
        node.insert(node, 6);
        node.insert(node, 9);
        node.inOrder(node);
    }

}

class BSTNode {
    BSTNode leftChild;
    BSTNode rightChild;
    int data;

    void insert(BSTNode root, int value) {
        if (root == null) {
            root = new BSTNode();
            root.data = value;
            return;
        } else if (value < root.data) {
            if (root.leftChild == null) {
                root.leftChild = new BSTNode();
                root.leftChild.data = value;
            } else {
                root.leftChild.insert(root.leftChild, value);
            }
        } else {
            if (root.rightChild == null) {
                root.rightChild = new BSTNode();
                root.rightChild.data = value;
            } else {
                root.rightChild.insert(root.rightChild, value);
            }
        }
    }
    void inOrder(BSTNode root){
        if(root.leftChild != null){
            root.leftChild.inOrder(root.leftChild);
        }
        System.out.println(root.data+" ");
        if (root.rightChild != null){
            root.rightChild.inOrder(root.rightChild);
        }
    }
}




