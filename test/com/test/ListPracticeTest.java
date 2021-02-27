package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListPracticeTest {


    private ListPractice listPractice;

    @BeforeEach
    void setUp() {
        listPractice = new ListPractice();
    }

    @Test
    void testListSizeIsReturned() {
        //prepare
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        //execute
        int size = listPractice.getMeSizeOfList(testList);
        //verify
        assertEquals(2, size);
    }

    @Test
    void testAddReturnsIncreasedList() {
        //prepare
        List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        initialList.add(2);
        initialList.add(2);
        initialList.add(2);
        //execute
        listPractice.addElement(initialList, 50);
        //verify
        assertEquals(5, initialList.size());
        assertEquals(50, initialList.get(initialList.size()-1));
    }
    @Test
    void testRemoveReturnsDecreasedList(){
        //Prepare
        List<Integer> primaryList =new ArrayList<>();
        primaryList.add(2);
        primaryList.add(3);
        primaryList.add(6);
        //Execute
        listPractice.removeElement(primaryList, 3);
        //Verify
        assertEquals(2, primaryList.size());
        assertFalse(primaryList.contains(6));

    }
}