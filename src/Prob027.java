import algos.Prime;

public class Prob027 {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int max = 0;
        for (int a = -999; a < 1000; a++) {
            for (int b = -999; b < 1000; b++) {
                int c = nb_consecutive_primes(a, b);
                if (c > max) {
                    max = c;
                    A = a;
                    B = b;
                }
            }
        }
        System.out.println(A * B);
    }

    private static int nb_consecutive_primes(int a, int b) {
        for (int i = 0; ; i++) {
            int n = i * i + a * i + b;
            if (n <= 0 || !Prime.is_prime(n))
                return i;
        }
    }
}
