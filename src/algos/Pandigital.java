package algos;

import java.util.Arrays;
import java.util.Collections;

public class Pandigital {
    public static boolean is_pandigital_9(String s) {
        if (s.length() != 9)
            return false;
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }

    public static boolean is_pandigital(int n) {
        String[] s_arr = String.valueOf(n).split("");
        String max = Collections.max(Arrays.asList(s_arr));
        if (Integer.parseInt(max) != s_arr.length)
            return false;
        for (int i = 0; i < s_arr.length; i++) {
            for (int j = 0; j < s_arr.length; j++) {
                if ((s_arr[i].equals(s_arr[j]) && i != j) || s_arr[j].equals("0"))
                    return false;
            }
        }
        return true;
    }

    public static boolean has_pandigital_product(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && is_pandigital_9("" + n + i + n / i))
                return true;
        }
        return false;
    }
}
