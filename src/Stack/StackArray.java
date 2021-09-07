package Stack;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class StackArray {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("Sahib");
        s.push("Hardeep");
        s.push("Sandeep");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

class Stack<E>{

    private Object arr[];
    private int top = -1;

    public Stack() {
        arr = new Object[20];
    }

     void push(E e) {
        arr[++top] = e;
    }

    E pop() {
        E e = (E) arr[top--];
        return e;
    }

    E peek() {
        E e = (E) arr[top];
        return e;
    }

    boolean isEmpty(){
        if (top == 0) return true;
        else return false;
    }
}
