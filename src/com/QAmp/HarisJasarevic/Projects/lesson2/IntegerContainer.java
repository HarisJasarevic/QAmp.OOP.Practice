package com.QAmp.HarisJasarevic.Projects.lesson2;

import java.util.ArrayList;
import java.util.List;

public class IntegerContainer {

    //LinkedLists, ArrayLists and Maps practice

    private List<Integer> integerList;

    public IntegerContainer () {
        this.integerList = new ArrayList<>();
    }

    public int addElement (final int n) {
        integerList.add(n);
        return n;
    }

    public int sum () {
        int sum = 0;
        for (final  Integer n : integerList) {
            sum += n;
        }
        return sum;
    }

    public boolean remove (final List<Integer> toRemove) {
        return integerList.removeAll(toRemove);
    }

    @Override
    public String toString () {
        return integerList.toString();
    }
}
