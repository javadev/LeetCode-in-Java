package g1101_1200.s1154_day_of_the_year;

// #Easy #String #Math #2022_03_05_Time_9_ms_(95.40%)_Space_42.2_MB_(90.80%)

public class Solution {
    public int dayOfYear(String date) {
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateArr = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        int dayCount = 0;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        for (int i = 1; i < month; i++) {
            dayCount += monthDays[i];
        }
        dayCount += day;
        if (leapYear && month > 2) {
            dayCount++;
        }
        return dayCount;
    }
}
