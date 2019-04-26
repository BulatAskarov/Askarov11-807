package com.company.Task02;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Comparator comparatorByGroup = (Runnner o1, Runnner o2) -> o1.getSpeed() - o2.getSpeed();

        Speed speed = new Speed(arr);

        speed.top10(10, comparatorByGroup);
    }
}
