package algos;

import java.util.HashSet;
import java.util.Hashtable;

public class Multiple {
    public static boolean is_multiple(int n, int x) {
        return x % n == 0;
    }

    public static HashSet<Integer> list_multiples(int n, int max) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < max; i++)
            hs.add((is_multiple(n, i) ? i : 0));
        return hs;
    }


    public static Hashtable<Integer, Integer> smallest_multiple_ht(int n) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 2; i <= n; i++) {
            Hashtable<Integer, Integer> pf = Prime.prime_facts_of_ht(i);
            for (int key : pf.keySet()) {
                if (!ht.containsKey(key))
                    ht.put(key, pf.get(key));
                if (pf.get(key) > ht.get(key))
                    ht.compute(key, (k, v) -> v = pf.get(key));
            }
        }
        return ht;
    }

    public static int smallest_multiple(int n) {
        final int[] res = {1};
        Hashtable<Integer, Integer> h = smallest_multiple_ht(n);
        h.forEach((k, v) -> res[0] *= Math.pow(k, v));
        return res[0];
    }
}
