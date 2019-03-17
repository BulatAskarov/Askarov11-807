package com.company;


import java.util.LinkedList;
import java.util.List;

public class LinkedStack {

    private List<Integer> arr = new LinkedList<>();
    private int count = 0;


    public void add(int elem) {
       arr.add(elem);
       count++;
    }

    public void removeElem() {
        count--;
        arr.remove(count);
    }

    public int showElem() {
        return arr.get(count - 1);
    }

    public int getCount() {
        return count;
    }
}
