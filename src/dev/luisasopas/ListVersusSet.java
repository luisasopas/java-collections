package dev.luisasopas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ListVersusSet {

        public static void main(String[] args) {
            //first try it using an ArrayList, after try using HashSet
            //Collection<Integer> numeros = new ArrayList<Integer>();
            Collection<Integer> numbers = new HashSet<>();
            long begin = System.currentTimeMillis();

            for (int i = 1; i <= 50000; i++) {
                numbers.add(i);
            }

            for (Integer number : numbers) {
                numbers.contains(number);
            }

            long end = System.currentTimeMillis();

            long executionTime = end - begin;

            System.out.println("Time spent: " + executionTime);

        }


}
