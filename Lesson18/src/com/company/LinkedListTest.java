package com.company;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    MyLinkedList<Integer> myLinkedList;
    @Before
    public void setUp1(){
        myLinkedList = new MyLinkedList<>();
    }

    @Test
    public void TestAddOn5(){
        myLinkedList.add(5);
    }

    @Test
    public void TestRemoveOn0(){
        myLinkedList.add(5);
        myLinkedList.remove(0);
    }

    @Test
    public void TestHasValueOn5(){
        myLinkedList.add(5);
        myLinkedList.HasValue(5);
    }

    @Test
    public void TestAddEndOn5(){
        myLinkedList.add(5);
        MyLinkedList<Integer> a = new MyLinkedList<>();
        a.add(4);
        a.add(3);
        myLinkedList.AddEnd(a);
    }

    @Test
    public void TestGetOn5(){
        myLinkedList.add(5);
        myLinkedList.get(0);
    }
}
