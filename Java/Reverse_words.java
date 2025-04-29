import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_words {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.concat(" ?").split(" "))
                .map(word -> new StringBuffer(word).reverse().toString())
                .limit(original.concat(" ?").split(" ").length - 1)
                .collect(Collectors.joining(" "));
    }
}
