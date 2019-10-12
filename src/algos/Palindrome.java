package algos;

public class Palindrome {
    public static boolean is_palindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    public static int largest_palindrome() {
        int largest = 0;
        int a = 100;
        while (a <= 999) {
            int b = 100;
            while (b <= 999) {
                if (is_palindrome(String.valueOf(a * b)) && a * b > largest)
                    largest = a * b;
                b++;
            }
            a++;
        }
        return largest;
    }
}
