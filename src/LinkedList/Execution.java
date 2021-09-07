package LinkedList;

public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(100);
        list.deleteAtIndex(2);
        list.show();
    }
}
