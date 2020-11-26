package com.santana.sortapplication.models;

import java.util.ArrayList;

public class SortModel {

    private ArrayList<Integer> listToSort = new ArrayList<>();
    private final int MAX_SIZE = 20;

    public ArrayList listOfNumbers(int value){
        for(int i = 0; i < value; i++){
            listToSort.add((int)(Math.random() * MAX_SIZE + 1));
        }
        return listToSort;
    }

    public ArrayList<Integer> getListToSort() {
        return listToSort;
    }

    public void setListToSort(ArrayList<Integer> listToSort) {
        this.listToSort = listToSort;
    }
}
