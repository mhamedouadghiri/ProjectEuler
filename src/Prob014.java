import algos.Collatz;

import java.math.BigInteger;

public class Prob014 {
    public static void main(String[] args) {
        BigInteger max = BigInteger.ZERO;
        BigInteger ans = BigInteger.ZERO;
        for (int i = 500000; i <= 1000000; i++) {
            BigInteger j = new BigInteger(String.valueOf(i));
            if (Collatz.collatz_cnt_optimized(j).compareTo(max) > 0) {
                max = Collatz.collatz_cnt_optimized(j);
                ans = j;
            }
        }
        System.out.println(ans);
    }
}
