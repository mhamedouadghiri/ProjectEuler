import java.util.HashSet;

public class Prob029 {
    public static void main(String[] args) {
        HashSet<Double> hs = new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                hs.add(Math.pow(a, b));
            }
        }
        System.out.println(hs.size());
    }
}
