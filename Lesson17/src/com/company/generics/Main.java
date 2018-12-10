package com.company.generics;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        //l.add(5); не скомиплится
        l.add("ABC");
        String s = l.get(0);

    }
}
