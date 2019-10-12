import algos.Pandigital;

public class Prob032 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10000; i++) {
            if (Pandigital.has_pandigital_product(i))
                sum += i;
        }
        System.out.println(sum);
    }
}
