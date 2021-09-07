package CircularLinkedList;

public class Runner {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(44);
        list.insertAtStart(11);
        list.insertAtIndex(2,99);
        list.deleteAtIndex(2);
        list.show();
    }
}
