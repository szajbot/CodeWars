import java.util.List;

public class Chinese_Zodiac {
    public static String chineseZodiac(int year) {
        var animals = List.of("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig");
        var elements = List.of("Wood", "Fire", "Earth", "Metal", "Water");
        return elements.get((int) ((double) ((year - 1924) % 10) / 2)) + ' ' + animals.get((year - 1924) % 12);
    }
}
