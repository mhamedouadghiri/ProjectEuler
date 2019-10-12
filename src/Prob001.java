import algos.Multiple;

import java.util.HashSet;

public class Prob001 {
    public static void main(String[] args) {
        HashSet<Integer> hs;
        hs = Multiple.list_multiples(3, 1000);
        hs.addAll(Multiple.list_multiples(5, 1000));
        int sum = 0;
        while (hs.iterator().hasNext()) {
            sum += hs.iterator().next();
            hs.remove(hs.iterator().next());
        }
        System.out.println(sum);
    }
}
