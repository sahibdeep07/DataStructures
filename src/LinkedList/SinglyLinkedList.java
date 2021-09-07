package LinkedList;

public class SinglyLinkedList {
    Node head;
    Node temp;

    void insert(int value){
        Node node = new Node();
        node.data = value;
        if (head == null) head = node;
        else {
            temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next = node;
        }
    }

    void insertAtStart(int value){
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    void insertAtIndex(int index, int value){
        Node node = new Node();
        node.data = value;
        temp = head;
        int i = 0;

        if (index == 0){
            insertAtStart(value);
            return;
        }

        while(i != index-1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteFirstNode(){
        head = head.next;
    }

    void deleteLastNode(){
        temp = head;
        Node priorTemp = head;
        while(temp.next != null){
            priorTemp = temp;
            temp = temp.next;
        }
        priorTemp.next = null;
    }

    void deleteAtIndex(int index){
        temp = head;
        int i = 0;
        while(i != index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    void show(){
        if (head == null) System.out.println("List is empty");
        else{
            temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
