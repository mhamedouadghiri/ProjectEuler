package algos;

public class Sum {
    public static int sum_square(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i * i;
        }
        return res;
    }

    public static int square_sum(int n) {
        return (int) Math.pow(n * (n + 1) / 2, 2);
    }

    public static int triangle_number(int n) {
        return n * (n + 1) / 2;
    }

    public static boolean is_triangular(int nb) {
        int sum = 0;
        for (int n = 1; sum <= nb; n++) {
            sum += n;
            if (sum == nb)
                return true;
        }
        return false;
    }

    public static int pentagonal_number(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static boolean is_pentagonal(int nb) {
        int i = 1;
        int M;
        do {
            M = i * (3 * i - 1) / 2;
            i += 1;
        } while (M < nb);
        return M == nb;
    }
}
