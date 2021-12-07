package QueueArray;

public class Queue {
    int front = 0, rear = -1, size = 0;
    int[] queue = new int[5];

    void enqueue(int value) {
        if (rear < queue.length - 1) {
            rear++;
            queue[rear] = value;
            size++;
        }else System.out.println("Full queue exception");
        print();
    }

    int dequeue() {
        int data;
        if (size > 0) {
            data = queue[front];
            queue[front] = 0;
            front++;
            print();
            size--;
            return data;
        } else {
            System.out.println("Empty Queue Exception");
            return -1;
        }
    }

    int size() {
        return size;
    }

    void print(){
        System.out.println("Printing: ");
        for(int i = 0; i<size; i++){
            System.out.println(queue[i]+" ");
        }
    }

}
