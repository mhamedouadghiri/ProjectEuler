import algos.Factorial;

import java.math.BigInteger;

public class Prob020 {
    public static void main(String[] args) {
        BigInteger bi = Factorial.factorial(BigInteger.valueOf(100));
        String str = bi.toString();
        String[] lst = str.split("");
        int[] list = new int[lst.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(lst[i]);
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);
    }
}
