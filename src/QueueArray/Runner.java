package QueueArray;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.size);
        System.out.println("element :" + queue.dequeue());
        System.out.println("element :" + queue.dequeue());
        System.out.println("element :" + queue.dequeue());
        System.out.println("element :" + queue.dequeue());
        System.out.println("element :" + queue.dequeue());
        System.out.println("element :" + queue.dequeue());
    }
}
