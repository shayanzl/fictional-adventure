import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] words = { "hello", "how", "are", "u", "doing" };
        System.out.println("string array before sorting : " + Arrays.toString(words));

        String[] sortedArrayByLength = ArraySortByLength.sortArrayByLength(words, ArraySortByLength.Sort.DESC);

        System.out.println("new string array after sorting : " + Arrays.toString(sortedArrayByLength));
    }
}

