package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node temp;
    void insert(int value){
        Node node = new Node();
        node.data = value;
        if(head == null){
            head = node;
        } else{
            temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }

    void insertAtIndex(int index, int value){
        Node node = new Node();
        node.data = value;
        temp = head;
        int i = 0;

        if(index == 0){
            insertAtStart(value);
        }

        while(i != index-1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    void insertAtStart(int value){
        Node node = new Node();
        node.data = value;
        node.next = head;
        head.prev = node;
        head = node;
    }

    void deleteLastNode(){
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

    void deleteFirstNode(){
        head.next.prev = null;
        head = head.next;
    }

    void deleteAtIndex(int index){
        temp = head;
        int i = 0;
        while(i != index){
            temp = temp.next;
            i++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
    }

    void show(){
        if (head == null){
            System.out.println("List is empty");
        }else{
            temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

}
