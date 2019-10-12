import java.math.BigInteger;

public class Prob016 {
    public static void main(String[] args) {
        BigInteger nb = BigInteger.TWO;
        final int EXP = 1000;
        String str = nb.pow(EXP).toString();
        String[] st = str.split("");
        int sum = 0;
        for (String s : st)
            sum += Integer.parseInt(s);
        System.out.println(sum);
    }
}
