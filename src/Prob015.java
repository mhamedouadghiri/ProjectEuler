import java.math.BigInteger;

public class Prob015 {
    public static void main(String[] args) {
        BigInteger up = BigInteger.ONE;
        BigInteger down = BigInteger.ONE;
        for (int i = 20 + 1; i <= 2 * 20; i++) {
            up = up.multiply(new BigInteger(i + ""));
            down = down.multiply(new BigInteger((i - 20) + ""));
        }
        System.out.println(up.divide(down));
    }
}
