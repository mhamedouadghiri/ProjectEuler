public class Prob030 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 2; i < 6 * Math.pow(9, 5); i++) {
            if (i == sum_digits_p5(i))
                res += i;
        }
        System.out.println(res);
    }

    private static int sum_digits_p5(int num) {
        int sum = 0;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 5);
        }
        return sum;
    }
}
