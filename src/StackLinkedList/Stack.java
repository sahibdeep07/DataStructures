package StackLinkedList;

public class Stack {
    Node head;
    Node temp;

    void push(int value) {
        Node node = new Node();
        node.data = value;
        if (head == null)
            head = node;
        else {
            temp = head;
            head = node;
            head.next = temp;
        }
        print();
    }

    int pop() {
        int data;
        if (head != null) {
            data = head.data;
            head = head.next;
            print();
            return data;
        }else{
            System.out.println("Stack under flow");
            return -1;
        }
    }

    int top() {
        return head.data;
    }

    void print() {
        temp = head;
        System.out.println("printing: ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
