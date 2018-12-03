package com.company;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean contains(int e) {
        boolean b = false;
        for (int element : elements) {
            if (element == e) {
                b = true;
            }
        }
        return b;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        while (elements[index + 1] != Integer.parseInt(null)) {
            elements[index++] = elements[index + 1];
        }
        elements[index] = Integer.parseInt(null);
    }


    @Override
    public void sort() {
        int[] list = elements;
        int[] SortList = new int[elements.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            for (int element : list) {
                if (element > max) {
                    max = element;
                }
            }
            for (int element : list) {
                if (element == max) {
                    element = Integer.parseInt(null);
                    break;
                }
            }
            SortList[i] = max;
            max = Integer.MIN_VALUE;
        }
    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            for (int element : elements) {
                if (element == 0) {
                    element = intList.get(i);
                    break;
                }
            }
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        for (int i = 0; i < intList.size(); i++) {
            elements[startPosition + i] = intList.get(i);
        }
    }

    @Override
    public int[] toArray() {
        return elements;
    }

    @Override
    public int indexOf(int value) {
        int retern = 0;
        for (int element : elements){
            if (element == value) {
                retern = value;
                break;
            }
        }
        return retern;
    }
}
