import algos.Factorial;

public class Prob034 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 10000000; i++) {
            if (i == sum_digits_fact(i))
                sum += i;
        }
        System.out.println(sum);
    }

    private static int sum_digits_fact(int num) {
        int sum = 0;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            sum += Factorial.factorial(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return sum;
    }
}
