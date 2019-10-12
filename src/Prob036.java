import algos.Palindrome;

public class Prob036 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (Palindrome.is_palindrome("" + i) && Palindrome.is_palindrome(Integer.toBinaryString(i)))
                sum += i;
        }
        System.out.println(sum);
    }
}
