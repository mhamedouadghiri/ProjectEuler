import algos.Sum;

public class Prob006 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(Math.abs(Sum.sum_square(n) - Sum.square_sum(n)));
    }
}
