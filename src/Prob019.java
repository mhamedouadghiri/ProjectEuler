import java.util.Calendar;

public class Prob019 {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(1901, Calendar.JANUARY, 1);
        end.set(2000, Calendar.DECEMBER, 31);
        int cnt = 0;
        while (start.compareTo(end) <= 0) {
            start.add(Calendar.DATE, 1);
            if ((start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) && start.get(Calendar.DAY_OF_MONTH) == 1)
                cnt += 1;
        }
        System.out.println(cnt);
    }
}
