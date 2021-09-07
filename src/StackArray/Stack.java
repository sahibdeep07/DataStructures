package StackArray;

public class Stack {
    int top = -1;
    int[] stack = new int[5];

    boolean isEmpty(){
        return (top < 0);
    }

    void push(int value){
        if(top<4){
            top++;
            stack[top] = value;
        }else{
            System.out.println("Stack over flow");
        }
    }

    void pop(){
        if(top>-1){
            stack[top] = -1;
            top--;
        }else{
            System.out.println("Stack under flow");
        }
    }

    void show(){
        for (int i = 0; i<= top; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println("");
    }

    void peek(){
        if (top>-1)
        System.out.println(stack[top]);
    }
}
