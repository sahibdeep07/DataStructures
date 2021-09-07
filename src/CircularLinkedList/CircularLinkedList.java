package CircularLinkedList;

public class CircularLinkedList {
    Node head;
    Node temp;

    void insert(int value){
        Node node = new Node();
        node.data = value;

        if (head == null){
            head = node;
        }else{
            temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
        }
        node.next = head;
    }

    void insertAtStart(int value){
        Node node = new Node();
        node.data = value;
        if (head == null){
            head = node;
            node.next = head;
        }else{
            temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            head = node;
        }
    }

    void insertAtIndex(int index, int value){
        Node node = new Node();
        node.data = value;
        int i = 0;
        temp = head;
        while(i != index-1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void delete(){
        temp = head;
        Node priorTemp = head;
        while(temp.next != head){
            priorTemp = temp;
            temp = temp.next;
        }
        priorTemp.next = temp.next;
    }

    void deleteAtStart(){
        temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
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
        temp = head;
        while(temp.next != head){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
