import algos.Prime;

public class Prob035 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (is_circular_prime(i))
                count++;
        }
        System.out.println(count);
    }

    private static boolean is_circular_prime(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (!Prime.is_prime(Integer.parseInt(s.substring(i) + s.substring(0, i))))
                return false;
        }
        return true;
    }
}
