package demo;

import java.util.Arrays;
import java.util.List;

public class DataHelper {

    public static List<Person> makePersonList() {
        return Arrays.asList(
            new Person("Sheldon", "Cooper"),
            new Person("Leonard", "Hofstadter"),
            new Person("Raj", "Koothrappali"),
            new Person("Howard", "Wolowitz")
        );
    }
}
