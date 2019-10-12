package algos;

import java.util.LinkedHashSet;

public class Divisors {
    public static LinkedHashSet<Integer> divisors(int n) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        for (int i = 2; i * 2 <= n; i++) {
            if (n % i == 0) hs.add(i);
        }
        hs.add(n);
        return hs;
    }

    public static LinkedHashSet<Integer> proper_divisors(int n) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        for (int i = 2; i * 2 <= n; i++) {
            if (n % i == 0) hs.add(i);
        }
        return hs;
    }

    private static int sum_proper_divisors(int n) {
        LinkedHashSet<Integer> pd = proper_divisors(n);
        int sum = 0;
        for (Integer i : pd) {
            sum += i;
        }
        return sum;
    }

    public static boolean are_amicable(int a, int b) {
        boolean yes = false;
        int sa = sum_proper_divisors(a), sb = sum_proper_divisors(b);
        if (sa == b && sb == a)
            yes = true;
        return yes;
    }

    public static boolean is_perfect(int n) {
        boolean yes = false;
        if (sum_proper_divisors(n) == n)
            yes = true;
        return yes;
    }

    public static boolean is_deficient(int n) {
        boolean yes = false;
        if (sum_proper_divisors(n) < n)
            yes = true;
        return yes;
    }

    public static boolean is_abundant(int n) {
        boolean yes = false;
        if (sum_proper_divisors(n) > n)
            yes = true;
        return yes;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int gcd_n(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = gcd(arr[i], res);
        return res;
    }
}
