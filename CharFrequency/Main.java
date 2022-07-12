import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            var x = new Scanner(System.in);
            String str = x.nextLine();
            var charFrequncy = new CharFrequency();
            System.out.println(charFrequncy.frequencySort(str));
    }
}
