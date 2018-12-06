package com.company;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(42);//{42}
        System.out.println(list.get(0));
        IntList list2 = new IntArrayList();
        list2.add(46);
        list2.add(47);
        list2.add(45);
        list.addAll(list2);
        list2.sort();
        System.out.println(list2.indexOf(47));
    }
}
