public class Prob009 {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < a; b++) {
                int c = 1000 - a - b;
                if ((a * a + b * b) == c * c) System.out.println(a * b * c);
            }
        }
    }
}
