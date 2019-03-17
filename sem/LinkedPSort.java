package com.company;

import java.util.LinkedList;

public class LinkedPSort {
    private int iterCunt = 0;// КОЛ-ВО ИТЕРАЦИЙ

    public LinkedStack[] stacks(int[] arr) {    //СОЗДАНИЕ СТЭКОВ
        LinkedStack[] stacks = new LinkedStack[arr.length]; // МАССИВ ДЛЯ СОЗДАНИЯ СТЭКОВ
        int count = 0;  // СЧЁТЧИК СТЭКОВ
        int flag = 0;
        int last;
        int first;
        int mid;
        LinkedStack stack = new LinkedStack(); // СОЗДАНИЕ 1ГО СТЭКА
        stack.add(arr[0]);         // ДОБАВЛЕНИЯ ЭЛЕМЕНТА В 1ЫЙ СТЭК
        stacks[0] = stack;        // ДОБАВЛЕНИЕ ПЕРВОГО СТЭКА В МАССИВ
        count++;
        for (int i = 1; i < arr.length; i++) { // ЦИКЛ ПО ВСЕМ ЭЛЕМЕНТАМ ВХОДНОГО МАССИВА
            flag = 0;
            last = count - 1;
            first = 0;
            mid = (last + 1) / 2;
            if (arr[i] > stacks[count - 1].showElem()) { // ЕСЛИ БОЛЬШЕГО ЭЛЕМЕНТА ПОСЛЕДНЕГО СТЭКА
                LinkedStack stack1 = new LinkedStack();         //   ТО СОЗДАЁТСЯ НОВЫЙ
                stack1.add(arr[i]);
                stacks[count] = stack1;
                count++;
            } else {
                if (arr[i] <= stacks[0].showElem()) {
                    stacks[0].add(arr[i]);
                    iterCunt++;
                } else {
                    while (flag == 0) { //БИНАРНЫЙ ПОИСК НУЖНОЙ СТОПКИ
                        if (stacks[mid].showElem() >= arr[i] && stacks[mid - 1].showElem() < arr[i]) {
                            flag = 1;
                        } else {
                            if (stacks[mid].showElem() < arr[i]) {
                                first = mid;
                                mid = (last + first + 1) / 2;
                            } else {
                                last = mid;
                                mid = (last + first) / 2;
                            }
                        }
                        iterCunt++;
                    }
                    stacks[mid].add(arr[i]);
                }
            }
            iterCunt++;
        }
        LinkedStack[] stacks1 = new LinkedStack[count]; // СОЗДАНИЕ НОВОГО МАССИВА СТЭКОВ ДЛИНЫ КОЛ-ВА СТЭКОВ
        for (int j = 0; j < stacks1.length; j++) { // И КОПИРОВАНИЕ
            stacks1[j] = stacks[j];
        }
        return stacks1;
    }


    public int[] sorting(LinkedList<Integer> linkedList) {
        int linkedListLenth = 0;
        int k = 0;
        for (int elem : linkedList){
            linkedListLenth++;
        }
        int[] arr = new int[linkedListLenth];
        for (int elem : linkedList){
            arr[k] = elem;
            k++;
        }
        LinkedStack[] stacks = stacks(arr);// СОЗДАНИЕ СТОПОК ИЗ ВХОДНОГО МАССИВА
        int arraySize = arr.length;
        Stack elems = new Stack(); //СТОПКА СОТОЯЩАЯ ИЗ ВЕРХНИХ ЭЛЕМЕНТОВ СТОПОК, ГДЕ ВЕРХНИЙ ЭЛЕМЕНТ МИНИМАЛЬНЫЙ
        for (int i = stacks.length - 1; i > -1; i--) {//ЗАПОЛНЕНИЯ СТОПКИ ИЗ ВЕРХНИХ ЭЛЕМЕНТОВ
            elems.add(stacks[i].showElem());
            stacks[i].removeElem();
        }
        for (int j = 0; j < arraySize; j++) { //ЦИКЛ СОРТИРОВКИ
            if (elems.getCount() < stacks.length) {
                for (int i = 0; i < stacks.length - elems.getCount(); i++) {
                    if (stacks[i].getCount() != 0 && (elems.getCount() == 0 || stacks[i].showElem() < elems.showElem())) {
                        elems.add(stacks[i].showElem());
                        stacks[i].removeElem();
                        i = stacks.length - elems.getCount();
                    }
                    iterCunt++;
                }
            }
            iterCunt++;
            arr[j] = elems.showElem();
            elems.removeElem();
        }
        return arr;
    }

    public int getIterCunt() {
        return iterCunt;
    }
}