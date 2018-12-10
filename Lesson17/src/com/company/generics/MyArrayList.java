package com.company.generics;

public class MyArrayList<T> { //ообщение типа
    private T[] elements;
    private int count = 0;


    public MyArrayList(){
        this.elements = (T[]) new Object[10];
    }


    public void add(T e){
        elements[count++] = e;
    }

    public T get(int index) {
        return elements[index];
    }
    
}
