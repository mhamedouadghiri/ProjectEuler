import algos.EvenOdd;
import algos.Fibonacci;

import java.util.LinkedList;

public class Prob002 {
    public static void main(String[] args) {
        LinkedList<Integer> f = Fibonacci.fib_max(4000000, 1, 2);
        int sum = 0;
        for (int value : f)
            sum += (EvenOdd.is_even(value) ? value : 0);
        System.out.println(sum);
    }
}
