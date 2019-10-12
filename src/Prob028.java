public class Prob028 {
    public static void main(String[] args) {
        // n^2
        // n^2 - n + 1
        // n^2 - 2n + 2
        // n^2 - 3n + 3
        int res = 1;
        for (int n = 3; n <= 1001; n+=2) {
            res += 4 * Math.pow(n, 2) - 6 * n + 6;
        }
        System.out.println(res);
    }
}
