package dev.luisasopas;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static void main(String[] args) {
        String season0 = "The Flashback";
        String season1 = "Java and OOP";
        String season2 = "Advanced Java";
        String season3 = "Building Software";
        String season4 = "Going Pro";
        String season5 = "JavaScript";


        ArrayList<String> seasons = new ArrayList<>();
        seasons.add(season0);
        seasons.add(season1);
        seasons.add(season2);
        seasons.add(season3);
        seasons.add(season4);
        seasons.add(season5);
        System.out.println(seasons);
        seasons.remove(5);
        System.out.println(seasons);

        for (String season : seasons) {

            System.out.println("Seasons with foreach: " + season);
        }

        for (int i = 0; i < seasons.size(); i++) {
            System.out.println("Now with a fori: " + seasons.get(i));
        }

        seasons.forEach(season -> System.out.println("And now with a lambda expression: " + season));

        Collections.sort(seasons);
        System.out.println("Sorted: " + seasons);

        //PERFECT to make a randomizer
        Collections.shuffle(seasons);

        System.out.println("Shuffled: " + seasons);
    }
}
