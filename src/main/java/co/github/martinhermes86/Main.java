package co.github.martinhermes86;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek tuesday = DaysOfWeek.TUESDAY;
        DaysOfWeek saturday = DaysOfWeek.SATURDAY;
        System.out.println(DaysOfWeek.isWeekday(tuesday));
        System.out.println(DaysOfWeek.isWeekday(saturday));

        PersonRepository personRepository = new PersonRepository();
        personRepository.add(new Person(1, "John", DaysOfWeek.MONDAY, Gender.MALE));
        personRepository.add(new Person(2, "Lisa", DaysOfWeek.FRIDAY, Gender.FEMALE));
        personRepository.add(new Person(3, "Jane", DaysOfWeek.TUESDAY, Gender.FEMALE));
        personRepository.add(new Person(4, "Kiki", DaysOfWeek.WEDNESDAY, Gender.DIVERSE));
        personRepository.add(new Person(5, "Koko", DaysOfWeek.THURSDAY, Gender.DIVERSE));
        personRepository.add(new Person(6, "Manfred", DaysOfWeek.SATURDAY, Gender.MALE));

        System.out.println(personRepository.findPersonById(1));
        System.out.println(personRepository.findPersonById(6));
        System.out.println(personRepository.findPersonById(8));

        personRepository.countPersonsByGenders();

        personRepository.findPersonsByFavoriteDay(DaysOfWeek.TUESDAY).forEach(System.out::println);
        personRepository.findPersonsByFavoriteDay(DaysOfWeek.SATURDAY).forEach(System.out::println);
    }
}