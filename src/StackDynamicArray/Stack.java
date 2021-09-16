package StackDynamicArray;

public class Stack {
    int stack[] = new int[4];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            doubleTheArray(value);
        } else {
            top++;
            stack[top] = value;
        }
    }

    int pop() {
        if (top > -1) {
            int x = stack[top];
            top--;
            return x;
        } else {
            System.out.println("Stack under flow");
            return 0;
        }
    }

    int peek() {
        if (top > -1) {
            return stack[top];
        } else {
            System.out.println("Stack under flow");
            return 0;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "");
        }
    }

    void doubleTheArray(int value){
        int newStack[] = new int[stack.length*2];
        for(int i = 0; i <= top; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
        top++;
        stack[top] = value;
        print();
        System.out.println("Stack doubled");
    }

}
