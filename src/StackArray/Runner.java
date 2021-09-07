package StackArray;

public class Runner {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(5);
        s.push(7);
        s.push(99);
        s.push(100);
        s.push(22);
        s.show();
        s.pop();
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.show();
        s.pop();
        s.show();
        System.out.println(s.isEmpty());
    }
}
