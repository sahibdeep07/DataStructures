package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{4,9,2,6,11};
        sort(array);
    }
    static void sort(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j = 0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i: array) {
            System.out.println(i);
        }
    }
}
