import java.util.Arrays;
import java.util.stream.Collectors;

public class int32_to_IPv4 {
    public static String longToIP(long ip) {
        String binary = "";
        for (int i = 31; i >= 0; i--) {
            double pow = Math.pow(2, i);
            if (ip >=  pow) {
                ip -= (long) pow;
                binary = binary.concat("1");
            } else {
                binary = binary.concat("0");
            }
            if (i % 8 == 0 && i != 0) {
                binary = binary.concat(".");
            }
        }

        return Arrays.stream(binary.split("\\."))
                .map(e -> Integer.parseInt(e, 2))
                .map(Object::toString)
                .collect(Collectors.joining("."));
    }
}
