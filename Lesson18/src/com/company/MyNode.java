package com.company;

public class MyNode<T> {
    private T value;
    private MyNode next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return next;
    }
}
