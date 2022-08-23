package dev.luisasopas;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetTest {
    public static void main(String[] args) {
        //TreeSet does not accept duplicated elements
        MasterCoder mc0 = new MasterCoder("Priscila", 19);
        MasterCoder mc2 = new MasterCoder("Rolo", 80);
        MasterCoder mc1 = new MasterCoder("Benny", 27);

        //we may create a class OrderedByAge that implemented Comparable to pass
        //as argument to the TreeSet constructor method
        Set<MasterCoder> mcTreeset = new TreeSet<>();
        //if we try to add a type that doesn't implement Comparable, it throws a ClassCastException
        mcTreeset.add(mc0);
        mcTreeset.add(mc1);
        mcTreeset.add(mc2);

        Iterator<MasterCoder> iterator = mcTreeset.iterator();

        while (iterator.hasNext()) {
            MasterCoder mc = iterator.next();
            System.out.println(mc);
        }


    }
}
