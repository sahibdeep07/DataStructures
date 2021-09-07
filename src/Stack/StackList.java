package Stack;

public class StackList {
    public static void main(String[] args) {
        StackL s = new StackL(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

class Node{
    int data;
    Node next;
}

class StackL{
    Node head = new Node();

    StackL(int data){
        head.data = data;
    }

    void push(int data){
        Node t = head;
        Node n = new Node();
        n.data = data;
        while (t.next!= null){
            t = t.next;
        }
        t.next = n;
    }

    int pop(){
        if (head == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        Node n = head;
        Node p = new Node();
        while (n.next != null){
            p = n;
            n = n.next;
        }
        p.next = null;
        return n.data;
    }

    void isEmpty(){

    }

    int peek(){
       return 0;
    }

}
