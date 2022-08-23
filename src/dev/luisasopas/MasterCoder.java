package dev.luisasopas;

public class MasterCoder implements Comparable{
    private String name;
    private int age;

    public MasterCoder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
       MasterCoder mcToCompare = (MasterCoder) o;
        return this.age - ((MasterCoder) o).getAge();
    }

    @Override
    public String toString() {
        return "MasterCoder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
