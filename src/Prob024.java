import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob024 {
    public static int cnt = 0;

    public static void main(String[] args) {
        List<String> chars = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        iterate("", chars);
    }

    private static void iterate(String s, List<String> remains) {
        for (String chr : remains) {
            List<String> nextRemains = new ArrayList<>(remains);
            nextRemains.remove(chr);
            if (nextRemains.size() == 0) {
                cnt++;
                if (cnt == 1000000)
                    System.out.println(s + chr);
            } else {
                iterate(s + chr, nextRemains);
            }
        }
    }
}
