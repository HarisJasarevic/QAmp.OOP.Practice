package com.QAmp.HarisJasarevic.Projects.lesson2;

import java.util.ArrayList;
import java.util.List;

public class IntegerContainerMain {

    //LinkedLists, ArrayLists and Maps practice

    public static void main(String[] args) {

        final IntegerContainer container = new IntegerContainer();

        container.addElement(5);
        container.addElement(2);
        container.addElement(4);
        container.addElement(1);

        System.out.println(container.sum());
        System.out.println(container.toString());

        final List<Integer> toRemove = new ArrayList<>();

        toRemove.add(2);
        toRemove.add(3);
        toRemove.add(1);

        container.remove(toRemove);

        System.out.println(container.sum());
        System.out.println(container);

    }
}
