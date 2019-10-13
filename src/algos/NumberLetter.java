package algos;

public class NumberLetter {
    private static final String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine"};
    private static final String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String to_english(int n) {
        if (n < 100)
            return tens(n);
        else {
            String big = "";
            if (n >= 1000)
                big += tens(n / 1000) + " thousand";
            if (n / 100 % 10 != 0)
                big += ONES[n / 100 % 10] + " hundred";
            return big + (n % 100 != 0 ? " and " + tens(n % 100) : "");
        }
    }

    private static String tens(int n) {
        if (n < 10)
            return ONES[n];
        else if (n < 20)
            return TEENS[n - 10];
        else
            return TENS[n / 10 - 2] + " " + (n % 10 != 0 ? ONES[n % 10] : "");
    }
}
