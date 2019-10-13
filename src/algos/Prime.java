package algos;

import java.util.Hashtable;
import java.util.LinkedList;

public class Prime {
    /**
     * prime factors of n
     *
     * @param n number Long
     * @return LinkedList ex(12): [2, 2, 3]
     */
    public static LinkedList<Long> prime_facts_of_ll(Long n) {
        LinkedList<Long> pf = new LinkedList<>();
        while (n % 2 == 0) {
            pf.add((long) 2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                pf.add((long) i);
                n /= i;
            }
        }
        if (n > 2)
            pf.add(n);
        return pf;
    }

    /**
     * prime factors of n
     *
     * @param n number int
     * @return Hashtable ex(12): {2=2, 3=1}
     */
    public static Hashtable<Integer, Integer> prime_facts_of_ht(int n) {
        Hashtable<Integer, Integer> pf = new Hashtable<>();
        int cnt = 0;
        while (n % 2 == 0) {
            cnt++;
            n /= 2;
        }
        if (cnt != 0) pf.put(2, cnt);

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            pf.put(i, cnt);
        }
        if (n > 2)
            pf.put(n, 1);
        return pf;
    }

    public static boolean is_prime(int n) {
        if (n == 0 || n == 1) return false;
        if (n != 2 && n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int n) {
        if (!is_prime(n)) n = nextPrime(++n);
        return n;
    }

    public static LinkedList<Integer> primes_till(int n) {
        LinkedList<Integer> pt = new LinkedList<>();
        pt.add(2);
        for (int i = 3; i <= n; i += 2) {
            if (is_prime(i)) pt.add(i);
        }
        return pt;
    }

    public static LinkedList<Integer> n_primes(int n) {
        LinkedList<Integer> np = new LinkedList<>();
        int i = 1;
        while (np.size() < n) {
            i++;
            if (!np.contains(nextPrime(i))) np.add(nextPrime(i));
        }
        return np;
    }

    public static int divisors_count(int n) {
        int cnt = 2;
        for (int i = 2; i * 2 <= n; i++) {
            if (n % i == 0) cnt++;
        }
        return cnt;
    }

    public static boolean coprime(int a, int b) {
        return Divisors.gcd(a, b) == 1;
    }

    public static int totient(int n) {
        int cnt = 1;
        for (int m = 2; m <= n; m++) {
            if (coprime(m, n))
                cnt += 1;
        }
        return cnt;
    }
}
