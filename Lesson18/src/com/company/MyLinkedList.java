package com.company;

public class MyLinkedList<T> {
    private MyNode head;
    private int count = 0;

    public MyNode myNode() {
        return head;
    }

    public int getCount() {
        return count;
    }

    public void add(T e) { //работает также как и в IntLinkedList
        MyNode<T> newNode;
        newNode = new MyNode();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null) {
            MyNode<T> current = head;
            while ((current.getNext()) != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public T get(int index) {//работает также как и в IntLinkedList
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public void remove(int index) {//работает также как и в IntLinkedList
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyNode<T> beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            MyNode<T> nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }

    public boolean HasValue(T e) {
        boolean a = false;
        MyNode<T> value = head;
        if ((head.getValue()) != null) {//если 1ый елемент не 0 запускает цикл
            int i = 0;
            while (!(value.getValue()).equals(e) && i < count - 1) { //ищет похожее занчение
                value = value.getNext();
                i++;
            }
        }
        if ((value.getValue()).equals(e)) {//если value равен искомому значению присваевает true
            a = true;
        }
        return a;
    }

    public T[] Array() {
        T[] arr = null;
        return arr;
    }

    public void AddEnd(MyLinkedList<T> elements) {
        MyNode<T> my = head;
        MyNode<T> h = elements.myNode();
        while ((my.getNext() != null)) {
            my = my.getNext();
        }
        
        for (int i = 0; i < elements.getCount(); i++) {
            MyNode<T> newNode = new MyNode<>();
            newNode.setValue(h.getValue());
            my.setNext(newNode);
            my = newNode;
            h = h.getNext();
            count++;
        }
    }

    public void AddMidl(MyLinkedList<T> elements) {

    }

}
