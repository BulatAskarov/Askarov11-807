package com.company;

public class MainTestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> a = new MyLinkedList();
        a.add(5);
        a.add(6);
        a.add(7);
        a.remove(1);
        System.out.println(a.get(1));
        System.out.println(a.HasValue(6));
    }
}
