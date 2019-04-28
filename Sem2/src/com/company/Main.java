package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BTree<Integer> bTree = new BTree<>();
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt(); //РАЗМЕР ДАННЫХ
        WorkWithFile workWithFile = new WorkWithFile();
        Random random = new Random();
        int[] arr = new int[counter];
        for (int i = 0; i < counter; i++) { //ГЕНЕРАЦИЯ МАССИВА
            arr[i] = random.nextInt(10000);
        }
        workWithFile.create(arr);//СОЗДАНИЕ ФАЙЛА

        long time1 = System.nanoTime();

        for (int e : arr) {// ДОБАВЛЕНИЕ
            bTree.insert(e);
        }

        long time2 = System.nanoTime();

        System.out.println("ВРЕМЯ ДОБАВЛЕНИЕ");
        System.out.println(time2 - time1);
        System.out.println(" ");


        time1 = System.nanoTime();

        if (bTree.isMember(arr[counter / 2])) {
            System.out.println("found");//ПОИСК
        } else {
            System.out.println(arr[counter / 2] + " not found in tree");
        }

        time2 = System.nanoTime();
        System.out.println("ВРЕМЯ ПОИСКА");
        System.out.println(time2 - time1);
        System.out.println(" ");

        time1 = System.nanoTime();

        if (bTree.isMember(counter / 2)) {//удаление
            bTree.delete(counter / 2);
        } else {
            System.out.println(arr[counter / 2] + " not found in tree");
        }

        time2 = System.nanoTime();
        System.out.println("ВРЕМЯ УДАЛЕНИЯ");
        System.out.println(time2 - time1);
        System.out.println(" ");

    }
}