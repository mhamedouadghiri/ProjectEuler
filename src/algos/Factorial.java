package algos;

import java.math.BigInteger;
import java.util.ArrayList;

public class Factorial {
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static BigInteger binomial_coefficient(BigInteger n, BigInteger k) {
        if (k.compareTo(BigInteger.ZERO) == 0) return BigInteger.ONE;
        else if (k.compareTo(n.divide(BigInteger.TWO)) > 0) return binomial_coefficient(n, n.subtract(k));
        else return factorial(n).divide(factorial(k).multiply(factorial(n.subtract(k))));
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static ArrayList<String> permutations = new ArrayList<>();

    public static String[] permute(String str, int l, int r) {
        if (l == r) permutations.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
        return Sort.insertion_sort(permutations.toArray(new String[0]));
    }
}
