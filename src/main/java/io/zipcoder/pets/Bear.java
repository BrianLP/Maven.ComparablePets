package io.zipcoder.pets;
import java.lang.Comparable;

public class Bear extends Pet {
    public Bear(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "*chews Human*";
    }
}