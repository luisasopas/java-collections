package dev.luisasopas;

import java.util.Collections;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Bootcamp bootcamp61 = new Bootcamp(61,"Rolo");

        Season season3 = new Season("Building Software", 9);
        Season season4 = new Season("Going Pro", 7);
        Season season5 = new Season("JavaScript", 6);

        bootcamp61.addSeason(new Season("The Flashback", 9));
        bootcamp61.addSeason(new Season("Java and OOP", 13));
        bootcamp61.addSeason(new Season("Advanced Java", 4));
        bootcamp61.addSeason(season3);
        bootcamp61.addSeason(season4);
        bootcamp61.addSeason(season5);

        Cadet cadet0 = new Cadet("Veiga", 123);
        Cadet cadet1 = new Cadet("Daniel", 234);
        Cadet cadet2 = new Cadet("Natasha", 345);

        bootcamp61.enrollApplication(cadet0);
        bootcamp61.enrollApplication(cadet1);
        bootcamp61.enrollApplication(cadet2);

        //order of insertion will not be preserved, but there won't be duplicated items
        bootcamp61.getCadetSet().forEach(System.out::println);


        //why use empty set? To represent, for example, a bootcamp that was canceled by lack of applications
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?

        //collections are not thread-safe, but the method synchronized of Collections class return thread-safe collections
        Set<Cadet> synchronizedCadetSet = Collections.synchronizedSet(bootcamp61.getCadetSet());




    }
}
