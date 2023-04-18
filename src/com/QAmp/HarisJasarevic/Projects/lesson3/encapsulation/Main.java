package com.QAmp.HarisJasarevic.Projects.lesson3.encapsulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(1);
//
//        System.out.println(list);
//
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);

          List<Animal> list = new ArrayList<>();

          list.add(new Animal("Cat"));
          list.add(new Animal("Turtle"));
          list.add(new Animal("Dog"));

        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);


    }
}
