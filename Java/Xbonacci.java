import java.util.Arrays;
import java.util.List;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        switch (n) {
            case 0:
                return new double[]{};
            case 1:
                return new double[]{s[0]};
            case 2:
                return new double[]{s[0], s[1]};
            case 3:
                return new double[]{s[0], s[1], s[2]};
        }

        List<Double> newList = new java.util.ArrayList<>(Arrays.stream(s).boxed().toList());
        while(newList.size() < n) {
            newList.add(
                    newList.get(newList.size() - 3) +
                    newList.get(newList.size() - 2) +
                    newList.get(newList.size() - 1)
            );
        }
        return newList.stream().mapToDouble(Double::doubleValue).toArray();
    }

}
