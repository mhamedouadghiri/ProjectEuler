package algos;

import java.util.Arrays;

public class Misc {
    public static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    @SafeVarargs
    public static <T> T[] concat_all(T[] first, T[]... rest) {
        int totalLength = first.length;
        for (T[] array : rest)
            totalLength += array.length;
        T[] result = Arrays.copyOf(first, totalLength);
        int offset = first.length;
        for (T[] array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }

    public static <T> int position(T str, T[] lst) {
        int index = -1;
        for (int i = 0; i < lst.length; i++) {
            if (lst[i].equals(str)) {
                index = i;
                break;
            }
        }
        return index + 1;
    }

    public static int word_value(String word) {
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            total += (int) word.charAt(i) - 64;
        }
        return total;
    }
}
