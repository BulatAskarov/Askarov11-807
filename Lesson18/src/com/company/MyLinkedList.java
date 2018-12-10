package com.company;

public class MyLinkedList<T> {
    private MyNode head;
    private int count = 0;

    public void add(T e){ //работает также как и в IntLinkedList
        MyNode newNode;
        newNode = new MyNode();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null){
            MyNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public T get(int index){//работает также как и в IntLinkedList
        if (index < 0 || index >= count){
            throw new  IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return (T) current.getValue();
    }

    public void remove(int index){//работает также как и в IntLinkedList
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyNode beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            MyNode nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }

    public boolean HasValue(T e){
        boolean a = false;
        MyNode value = head;
        if (!head.equals(null)){//если 1ый елемент не 0 запускает цикл
            int i = 0;
            while (!(value.getValue()).equals(e) && i < count - 1){ //ищет похожее занчение
                value = value.getNext();
                i++;
            }
        }
        if ((value.getValue()).equals(e)){//если value равен искомому значению присваевает true
            a = true;
        }
        return a;
    }

    public T[] Array() {
        T[] arr = null;
        return arr;
    }

    public void AddEnd(MyLinkedList<T> elements){

    }

    public void AddMidl(MyLinkedList<T> elements){

    }

}
