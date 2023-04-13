package com.QAmp.HarisJasarevic.Projects.lesson2;

import java.util.*;

public class Lists {

    //LinkedLists, ArrayLists and Maps practice

    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<>();
        final List<Integer> list2 = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

//        for (final Integer n : list2) {
//            System.out.println(n);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        final Map<Integer, String> map = new HashMap<>();

        map.put(1, "String");
        map.put(2, "String2");
        map.put(3, "String3");

        for (Integer x : map.keySet()) {
            System.out.println(map.get(x));
        }
    }
}
