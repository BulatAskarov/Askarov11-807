package com.company;

public class MainTestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> a = new MyLinkedList<>();
        a.add(5);//0
        a.add(6);//1
        a.add(7);//2
        System.out.println(a.get(1));
        System.out.println(a.HasValue(6));
        MyLinkedList<Integer> b = new MyLinkedList<>();
        b.add(1);//3
        b.add(2);//4
        b.add(3);//5
        b.add(4);//6
        System.out.println(a.HasValue(1));
        a.AddEnd(b);
        System.out.println(a.get(4));

    }
}
