package com.test;

import java.util.List;

public class ListPractice {

    public void removeElement(List<Integer> primaryList, int positionToBeRemoved) {
        primaryList.remove(positionToBeRemoved-1);
    }



    public int getMeSizeOfList(List<String> testList) {
        int size = testList.size();
        return size;
    }

    public void addElement(List<Integer> initialList, int elementToBeAdded) {
        initialList.add(elementToBeAdded);
    }
}
