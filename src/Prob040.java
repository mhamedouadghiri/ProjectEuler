import java.math.BigInteger;
import java.util.Arrays;

public class Prob040 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 1000000; i++) {
            str.append(i);
        }
        int product = 1;
        for (int i = 0; i <= 6; i++) {
            product *= str.charAt((int) (Math.pow(10, i) - 1)) - '0';
        }
        System.out.println(product);
    }
}