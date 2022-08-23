package dev.luisasopas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        Season season0 = new Season("The Flashback", 9);
        Season season1 = new Season("Java and OOP", 13);
        Season season2 = new Season("Advanced Java", 4);
        Season season3 = new Season("Building Software", 9);
        Season season4 = new Season("Going Pro", 7);
        Season season5 = new Season("JavaScript", 6);

        LinkedList<Season> seasonList = new LinkedList<>();
        seasonList.add(season0);
        seasonList.add(season1);
        seasonList.add(season2);
        seasonList.add(season3);
        seasonList.add(season4);
        seasonList.add(season5);
        System.out.println(seasonList);

        //if we don't override the compareTo method, there will be an error, since it's an object
        //no suitable method found for sort
        Collections.sort(seasonList);
        System.out.println(seasonList);
        //Java 8 method reference
        seasonList.sort(Comparator.comparing(Season::getChapters));
        System.out.println(seasonList);
    }
}
