package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt(); //РАЗМЕР ДАННЫХ
        WorkWithFile workWithFile = new WorkWithFile();
        Random random = new Random();
        int[] arr = new int[counter];
        for (int i = 0; i < counter; i++) { //ГЕНЕРАЦИЯ МАССИВА
            arr[i] = random.nextInt(10000);
        }
        workWithFile.create(arr);//СОЗДАНИЕ ФАЙЛА
        PSort sort = new PSort();
        LinkedPSort linkedPSort = new LinkedPSort();
        long time1 = System.currentTimeMillis();
        sort.sorting(workWithFile.read());//СОРТИРОВКА НА МАССИВАХ
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);//
        System.out.println(" ");
        System.out.println(sort.getIterCount());//КОЛ-ВО ИТЕРАЦИЙ 1-ОЙ СОРТИРОВКИ
        System.out.println(" ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        long time3 = System.currentTimeMillis();
        arr = workWithFile.read();
        for (int i = 0; i < arr.length; i++) {//ПЕРЕВОД СГЕНЕРИРУЕМОГО МАССИВА В ЛИСТ
            linkedList.add(arr[i]);
        }
        linkedPSort.sorting(linkedList);//СОРТИРОВКА НА ЛИСТАХ
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);//ВРЕМЯ 2-ОЙ СОРТИРОВКИ
        System.out.println(" ");
        System.out.println(linkedPSort.getIterCount());//КОЛ-ВО ИТЕРАЦИЙ 2-ОЙ СОРТИРОВКИ
    }
}
