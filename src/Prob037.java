import algos.Prime;

public class Prob037 {
    public static void main(String[] args) {
        long sum = 0;
        for (int count = 0, n = 10; count < 11; n++) {
            if (is_truncatable(n)) {
                sum += n;
                count++;
            }
        }
        System.out.println(sum);
    }

    public static boolean is_truncatable(int n) {
        for (long i = 10; i <= n; i*=10) {
            if (!Prime.is_prime(n % (int) i))
                return false;
        }

        for (; n != 0; n /= 10) {
            if (!Prime.is_prime(n))
                return false;
        }
        return true;
    }
}
