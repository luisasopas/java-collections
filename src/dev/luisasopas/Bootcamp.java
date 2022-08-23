package dev.luisasopas;

import java.util.*;

public class Bootcamp {
    private int bootcampNumber;
    private String jedi;
    private List<Season> seasonList = new LinkedList<>();
    //we may use LinkedHashSet if we want to preserve the order of added elements
    private Set<Cadet> cadetSet = new HashSet<>();
    private Map<Integer, Cadet> applicationNumberToCadet = new HashMap();

    public Bootcamp(int bootcampNumber, String jedi) {
        this.bootcampNumber = bootcampNumber;
        this.jedi = jedi;
    }

    public List<Season> getSeasonList() {
        //defensive programming - get returns an unmodifiable list
        return Collections.unmodifiableList(seasonList);
    }


    //encapsulated add logic - only this class may modify its properties
    public void addSeason(Season season) {
        this.seasonList.add(season);
    }

    public int getTotalChapters() {
        return seasonList.stream().mapToInt(Season::getChapters).sum();
    }

    public Set<Cadet> getCadetSet() {
        return Collections.unmodifiableSet(cadetSet);
    }

    public void enrollApplication(Cadet cadet) {
        this.cadetSet.add(cadet);
        this.applicationNumberToCadet.put(cadet.getApplicationNumber(), cadet);
    }

    public Map<Integer, Cadet> getApplicationNumberToCadet() {
        return Collections.unmodifiableMap(applicationNumberToCadet);
    }

    public String getCadetByApplicationNumber(int applicationNumber) {
        if (!applicationNumberToCadet.containsKey(applicationNumber))
            throw new NoSuchElementException("Cadet not enrolled or inexistent");
        return applicationNumberToCadet.get(applicationNumber).getName();
    }

    @Override
    public String toString() {
        return "[Bootcamp" +
                "number: " + bootcampNumber +
                ", jedi='" + jedi + '\'' +
                ", seasonList=" + seasonList +
                ']';
    }
}
