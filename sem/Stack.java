package com.company;


public class Stack {

    private int[] arr = new int[10];
    private int count = 0;


    public void add(int elem) {
        if (count == arr.length) {
            int[] arr1 = new int[count + count / 2];
            for (int i = 0; i < count; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
            arr[count] = elem;
            count++;
        } else {
            arr[count] = elem;
            count++;
        }
    }

    public void removeElem() {
        count--;
    }

    public int showElem() {
        return arr[count - 1];
    }

    public int getCount() {
        return count;
    }
}
