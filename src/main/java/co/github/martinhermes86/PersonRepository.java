package co.github.martinhermes86;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private final List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public Optional<Person> findPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public void countPersonsByGenders() {
        int countMale = 0;
        int countFemale = 0;
        int countDiverse = 0;
        for (Person p : persons) {
            if (p.gender() == Gender.MALE) {
                countMale++;
            }
            if (p.gender() == Gender.FEMALE) {
                countFemale++;
            }
            if (p.gender() == Gender.DIVERSE) {
                countDiverse++;
            }

        }
        System.out.println("Male: " + countMale);
        System.out.println("Female: " + countFemale);
        System.out.println("Diverse: " + countDiverse);
    }

    public List<Person> findPersonsByFavoriteDay(DaysOfWeek day) {
        List<Person> personsByDay = new ArrayList<>();
        for (Person person : persons) {
            if (person.favoriteDay() == day) {
                personsByDay.add(person);
            }
        }
        return personsByDay;
    }

}
