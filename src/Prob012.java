import algos.Prime;
import algos.Sum;

public class Prob012 {
    public static void main(String[] args) {
        int i = 1;
        int tn = 0;
        while(true) {
            tn = Sum.triangle_number(i);
            if (Prime.divisors_count(tn) >= 500) {
                System.out.println(tn);
                break;
            }
            i++;
        }
    }
}
