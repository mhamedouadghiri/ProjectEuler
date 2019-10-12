package algos;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;

public class Collatz {
    public static LinkedList<Integer> collatz_seq(int n) {
        LinkedList<Integer> cs = new LinkedList<>();
        cs.add(n);
        while (n != 1) {
            if (EvenOdd.is_even(n)) n /= 2;
            else n = 3 * n + 1;
            cs.add(n);
        }
        return cs;
    }

    public static int collatz_cnt(int n) {
        int cnt = 1;
        while (n != 1) {
            if (EvenOdd.is_even(n)) n /= 2;
            else n = 3 * n + 1;
            cnt += 1;
        }
        return cnt;
    }

    private static HashMap<BigInteger, BigInteger> cache = new HashMap<>();

    public static BigInteger collatz_cnt_optimized(BigInteger n) {
        cache.put(BigInteger.ONE, BigInteger.ONE);
        if (cache.containsKey(n))
            return cache.get(n);
        if (n.remainder(BigInteger.TWO).equals(BigInteger.ZERO))
            cache.put(n, BigInteger.ONE.add(collatz_cnt_optimized(n.divide(BigInteger.TWO))));
        else
            cache.put(n, BigInteger.TWO.add(collatz_cnt_optimized(((n.multiply(new BigInteger("3"))).add(
                    BigInteger.ONE)).divide(BigInteger.TWO))));
        return cache.get(n);
    }
}
