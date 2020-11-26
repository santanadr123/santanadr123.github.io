package com.santana.sortapplication.models;

import java.util.*;

public class SelectionSort {


    public ArrayList selectionSort(ArrayList<Integer> list){

        int length = list.size();
        int minVal = 0;
        int temp = 0;

        for(int i = 0; i < length - 1; i++){
            minVal = i;

            for (int j = i + 1; j < length; j++) {
                if (list.get(j) < list.get(minVal)) {
                    minVal = j;
                }
            }

            temp = list.get(minVal);
            list.set(minVal, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}
