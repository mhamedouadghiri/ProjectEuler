public class Prob039 {
    public static void main(String[] args) {
        int max_per = 0;
        int max_tri = 0;
        for (int p = 1; p <= 1000; p++) {
            int triangles = count(p);
            if (triangles > max_tri) {
                max_per = p;
                max_tri = triangles;
            }
        }
        System.out.println(max_per);
    }

    private static int count(int p) {
        int cnt = 0;
        for (int a = 1; a <= p; a++) {
            for (int b = a; b <= p; b++) {
                int c = p - a - b;
                if (b <= c && a * a + b * b == c * c)
                    cnt++;
            }
        }
        return cnt;
    }
}
