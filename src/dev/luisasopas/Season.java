package dev.luisasopas;

import java.util.Comparator;

public class Season implements Comparable<Season> {
    String title;
    int chapters;

    public Season(String title, int chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "[Season name: " + this.title + ", classes: " + this.chapters + "]";
    }

    @Override
    public int compareTo(Season season) {
        return this.title.compareTo(season.getTitle());
    }


}
