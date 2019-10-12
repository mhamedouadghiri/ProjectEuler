import algos.Divisors;

public class Prob021 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 2; a <= 10000; a++) {
            for (int b = a + 1; b <= 10000; b++) {
                if (Divisors.are_amicable(a, b)) {
                    sum += (a + b);
                }
            }
        }
        System.out.println(sum);
    }
}
