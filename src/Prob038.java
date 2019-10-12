import algos.Pandigital;

public class Prob038 {
    public static void main(String[] args) {
        int max = 0;
        for (int n = 2; n <= 9; n++) {
            for (int i = 1; i < Math.pow(10, 9 / n); i++) {
                String concat = "";
                for (int j = 1; j <= n; j++)
                    concat += i * j;
                if (Pandigital.is_pandigital_9(concat))
                    max = Math.max(Integer.parseInt(concat), max);
            }
        }
        System.out.println(max);
    }
}
