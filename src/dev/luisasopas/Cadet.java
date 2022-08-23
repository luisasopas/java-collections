package dev.luisasopas;

import java.util.Objects;

public class Cadet {
    private String name;
    private int applicationNumber;

    public Cadet(String name, int applicationNumber) {
        if(name == null) {
            throw new NullPointerException("Name cannot be null!");
        }
        this.name = name;
        this.applicationNumber = applicationNumber;
    }

    public String getName() {
        return name;
    }

    public int getApplicationNumber() {
        return applicationNumber;
    }

    @Override
    public boolean equals(Object o) {
        Cadet comparedCadet = (Cadet) o;
    return this.name.equals(comparedCadet.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "[Cadet " +
                "name: '" + name + '\'' +
                ", application number: " + applicationNumber +
                ']';
    }
}
