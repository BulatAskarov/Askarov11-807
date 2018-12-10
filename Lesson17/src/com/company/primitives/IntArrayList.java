package com.company.primitives;

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
        return count;
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
        while (index != count) {
            elements[index++] = elements[index + 1];
        }
        count--;
    }


    @Override
    public void sort() {
        int a;
        for (int j = 0; j < count; j++) {
            for (int i = 1; i < count; i++) {
                if (elements[i] < elements[i - 1]) {
                    a = elements[i];
                    elements[i] = elements[i - 1];
                    elements[i - 1] = a;
                }
            }
        }
    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 1; i < intList.size(); i++) {
            elements[count + 1] = intList.get(i);
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        for (int i = 0; i < intList.size(); i++) {
            elements[startPosition + 1 + i] = intList.get(i);
        }
    }

    @Override
    public int[] toArray() {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = elements[i];
        }
        return arr;
    }

    @Override
    public int indexOf(int value) {
        int r = 0;
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                r = i;
                break;
            }
        }
        if (r == 0) {
            System.out.println("no such value");
        }
        return r;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
//            int val = elements[currentIndex];
//            currentIndex++;
//            return val;
            return elements[currentIndex++];
        }
    }
}
