import algos.Pandigital;
import algos.Prime;

public class Prob041 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 1; i <= 987654321; i++) {
            if (Pandigital.is_pandigital(i) && Prime.is_prime(i))
                max = i;
        }
        System.out.println(max);
    }
}
