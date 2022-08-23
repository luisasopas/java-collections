package dev.luisasopas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

        Bootcamp bootcamp61 = new Bootcamp(69, "Mari");
        Cadet cadet0 = new Cadet("Veiga", 123);
        Cadet cadet1 = new Cadet("Daniel", 234);
        Cadet cadet2 = new Cadet("Natasha", 345);

        bootcamp61.enrollApplication(cadet0);
        bootcamp61.enrollApplication(cadet1);
        bootcamp61.enrollApplication(cadet2);

        Map<Integer, Cadet> cadetsMap = new HashMap<Integer, Cadet>(bootcamp61.getApplicationNumberToCadet());
        cadetsMap.keySet().forEach(applicationNumber -> System.out.println(cadetsMap.get(applicationNumber)));
        System.out.println(bootcamp61.getCadetByApplicationNumber(123));

        //to retrieve keys
        Set<Integer> keys = cadetsMap.keySet();
        for (Integer k:keys) {
            System.out.println("Application number: "+ k);
        }

        //to retrieve values
        Collection<Cadet> values = cadetsMap.values();
        for (Cadet c:values) {
            System.out.println("Cadet name: " + c.getName());
        }

        //to retrieve associations
        Set<Map.Entry<Integer,Cadet>> associations = cadetsMap.entrySet();
        for (Map.Entry<Integer, Cadet> entry:associations) {
            System.out.println("The key " + entry.getKey() + " refers to " + entry.getValue());
        }


    }
}
