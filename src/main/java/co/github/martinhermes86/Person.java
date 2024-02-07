package co.github.martinhermes86;

enum Gender {
    MALE,
    FEMALE,
    DIVERSE

}
public record Person(int id, String name, DaysOfWeek favoriteDay, Gender gender) {
}
