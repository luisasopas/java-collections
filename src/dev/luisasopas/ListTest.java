package dev.luisasopas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        Bootcamp bootcamp61 = new Bootcamp(61,"Rolo");

        Season season3 = new Season("Building Software", 9);
        Season season4 = new Season("Going Pro", 7);
        Season season5 = new Season("JavaScript", 6);
        //order of insertion will be preserved. but you my have duplicated items
        bootcamp61.addSeason(new Season("The Flashback", 9));
        bootcamp61.addSeason(new Season("Java and OOP", 13));
        bootcamp61.addSeason(new Season("Advanced Java", 4));
        bootcamp61.addSeason(season3);
        bootcamp61.addSeason(season4);
        bootcamp61.addSeason(season5);

        List<Season> mutableSeasonList = new LinkedList<>(bootcamp61.getSeasonList());

        Collections.sort(mutableSeasonList);

        System.out.println(bootcamp61);
        System.out.println(mutableSeasonList);
        System.out.println(bootcamp61.getSeasonList());
        System.out.println("This bootcamp has a total of " + bootcamp61.getTotalChapters() + " chapters");

    }
}
