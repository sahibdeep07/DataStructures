package Heap;

import java.util.Arrays;

public class Heap {
    int capacity = 10;
    int size = 0;
    int items[] = new int[capacity];

    int getLeftChildIndex(int parentIndex) {return 2*parentIndex+1;}
    int getRightChildIndex(int parentIndex) {return 2*parentIndex+2;}
    int getParentIndex(int childIndex) {return (childIndex-1)/2;}

    boolean hasLeftChild(int parentIndex) {return getLeftChildIndex(parentIndex) < size;}
    boolean hasRightChild (int parentIndex) {return getRightChildIndex(parentIndex) < size;}
    boolean hasParent (int childIndex) {return getParentIndex(childIndex) >= 0;}

    int getLeftChild(int parentIndex) {return items[getLeftChildIndex(parentIndex)];}
    int getRightChild(int parentIndex) {return items[getRightChildIndex(parentIndex)];}
    int getParent(int childIndex) {return items[getParentIndex(childIndex)];}

    void ensureExtraCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity *= 2;
        }
    }

    void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    void insert(int value){
        ensureExtraCapacity();
        items[size] = value;
        size++;
        heapifyUp();
    }

    int poll(){
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    void heapifyUp(){
        int index = size-1;
        while(hasParent(index) && getParent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index) ){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index) < getLeftChild(index))
                smallerChildIndex = getRightChildIndex(index);
            if(items[index] <= items[smallerChildIndex]) break;
            else {
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
            }
        }
    }

    void print(){
        for (int i:items) {if(i>0)System.out.print(i+" ");}
        System.out.println("");
    }
}

