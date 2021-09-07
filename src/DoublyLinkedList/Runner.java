package DoublyLinkedList;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.deleteAtIndex(2);

        list.show();
    }
}
