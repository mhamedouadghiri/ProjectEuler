import algos.Divisors;

public class Prob033 {
    public static void main(String[] args) {
        // Let n = 10 * n1 + n0 be the numerator
        // Let d = 10 * d1 + d0 be the denominator.
        // By absurd:
        // either n1 = d0
        // or n0 = d1
        // so we check that n1/d0 = n/d and n0/d1 = n/d
        int num = 1;
        int den = 1;
        for (int d = 10; d < 100; d++) {
            for (int n = 10; n < d; n++) {
                int n0 = n % 10;
                int n1 = n / 10;
                int d0 = d % 10;
                int d1 = d / 10;
                if (n1 == d0 && n0 * d == n * d1 || n0 == d1 && n1 * d == n * d0) {
                    num *= n;
                    den *= d;
                }
            }
        }
        System.out.println(den / Divisors.gcd(num, den));
    }
}
