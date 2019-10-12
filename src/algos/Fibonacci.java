package algos;

import java.math.BigInteger;
import java.util.LinkedList;

public class Fibonacci {
    public static LinkedList<Integer> fib_max(int max, int f, int s) {
        LinkedList<Integer> fibs = new LinkedList<>();
        fibs.add(f);
        fibs.add(s);
        int i = 2;
        while (fibs.get(i - 1) <= max) {
            fibs.add(fibs.get(i - 1) + fibs.get(i - 2));
            i++;
        }
        return fibs;
    }

    public static LinkedList<Integer> fib_num(int num, int f, int s) {
        LinkedList<Integer> fibs = new LinkedList<>();
        fibs.add(f);
        fibs.add(s);
        int i = 2;
        while (fibs.size() < num) {
            fibs.add(fibs.get(i - 1) + fibs.get(i - 2));
            i++;
        }
        return fibs;
    }

    public static int fib_len_digits(int len, int f, int s) {
        int cnt = 2;
        BigInteger a = new BigInteger(String.valueOf(f));
        BigInteger b = new BigInteger(String.valueOf(s));
        BigInteger c = b;
        while (c.toString().length() < len) {
            c = a.add(b);
            a = b;
            b = c;
            cnt++;
        }
        return cnt;
    }
}
