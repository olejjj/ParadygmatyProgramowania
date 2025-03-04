package pl.kolejnik;

import java.util.List;

public class Sort {
    public static void sortBubble(List<Person> persons) {
        int n = persons.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persons.get(j).getAge() > persons.get(j + 1).getAge()) {
                    Person temp = persons.get(j);
                    persons.set(j, persons.get(j + 1));
                    persons.set(j + 1, temp);
                }
            }
        }
    }
}
