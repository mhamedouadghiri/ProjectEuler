package algos;

public class Sort {
    public static <T> T[] selection_sort(T[] lst) {
        int p;
        T tmp;
        for (int i = 0; i < lst.length; i++) {
            p = i;
            for (int j = i + 1; j < lst.length; j++) {
                if (lst[j].toString().compareTo(lst[p].toString()) < 0)
                    p = j;
            }
            if (p != i) {
                tmp = lst[i];
                lst[i] = lst[p];
                lst[p] = tmp;
            }
        }
        return lst;
    }

    public static <T> T[] insertion_sort(T[] lst) {
        T x;
        int j;
        for (int i = 0; i < lst.length; i++) {
            x = lst[i];
            j = i;
            while (j > 0 && lst[j - 1].toString().compareTo(x.toString()) > 0) {
                lst[j] = lst[j - 1];
                j--;
            }
            lst[j] = x;
        }
        return lst;
    }
}
