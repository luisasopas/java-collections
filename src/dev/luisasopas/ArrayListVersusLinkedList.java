package dev.luisasopas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// AUTHOR:
public class ArrayListVersusLinkedList {

    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");

        List<Integer> numbersArrayList = new ArrayList<>();
        List<Integer> numbersLinkedList = new LinkedList<>();
        int elements = 1000000;

        long arrayListTime = insertElements(numbersArrayList, elements);
        long linkedListTime = insertElements(numbersLinkedList, elements);

        System.out.println("Insertion into ArrayList took  " + arrayListTime);
        System.out.println("Insertion into LinkedList took " + linkedListTime);

        arrayListTime = removeFirstElement(numbersArrayList);
        linkedListTime = removeFirstElement(numbersLinkedList);

        System.out.println("Removal from ArrayList took  " + arrayListTime);
        System.out.println("Removal from LinkedList took " + linkedListTime);
    }

    /*
     * removendo 100 elementos sempre na primeira posição
     */
    private static long removeFirstElement(List<Integer> numbers) {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numbers.remove(0); //removendo sempre o primeiro elemento
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }

    private static long insertElements(List<Integer> numbers, int amount) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            numbers.add(i);
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }

}
