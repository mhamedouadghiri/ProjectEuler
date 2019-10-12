import algos.Divisors;

public class Prob023 {
    private static final int LIMIT = 28123;
    private static boolean[] isAbundant = new boolean[LIMIT + 1];

    public static void main(String[] args) {
        for (int i = 1; i < isAbundant.length; i++) {
            isAbundant[i] = Divisors.is_abundant(i);
        }

        int sum = 0;
        for (int i = 1; i <= LIMIT; i++) {
            if (!is_sum_of2_ab(i))
                sum += i;
        }

        System.out.println(sum);
    }

    private static boolean is_sum_of2_ab(int n) {
        for (int i = 0; i <= n; i++) {
            if (isAbundant[i] && isAbundant[n - i])
                return true;
        }
        return false;
    }
}
