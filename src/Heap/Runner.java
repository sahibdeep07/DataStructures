package Heap;

public class Runner {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(1);
        heap.insert(5);
        heap.insert(2);
        heap.insert(6);
        heap.insert(7);
        heap.insert(4);
        heap.insert(3);
        heap.print();
        heap.insert(3);
        heap.print();
        heap.poll();
        heap.print();
    }
}
