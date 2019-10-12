import algos.Prime;

import java.util.LinkedList;

public class Prob010 {
    public static void main(String[] args) {
        LinkedList<Integer> list = Prime.primes_till(2000000);
        long sum = 0;
        for (int value: list) sum += value;
        System.out.println(sum);
    }
}
