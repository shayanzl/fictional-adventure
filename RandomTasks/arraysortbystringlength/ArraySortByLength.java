import java.util.Arrays;
import java.util.Comparator;

public class ArraySortByLength {

        public static String[] sortArrayByLength(String[] strs, Sort direction) {
            if (direction.equals(Sort.ASC)) {
                return Arrays.stream(strs)
                        .sorted(Comparator.comparingInt(String::length))
                        .toArray(String[]::new);
            } else {
                return Arrays.stream(strs)
                        .sorted(Comparator.comparingInt(String::length)
                                .reversed())
                        .toArray(String[]::new);
            }
        }

        public static enum Sort {
            ASC, DESC
        }
}
