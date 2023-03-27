package g1101_1200.s1185_day_of_the_week;

// #Easy #Math #2022_03_30_Time_0_ms_(100.00%)_Space_41.7_MB_(31.89%)

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int counter = 0;
        for (int i = 1971; i < year; i++) {
            if (isLeapYear(i)) {
                counter += 366;
            } else {
                counter += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            counter += dayOfMonth(i);
        }
        for (int i = 1; i <= day; i++) {
            counter += 1;
        }
        if (isLeapYear(year) && month > 2) {
            counter++;
        }
        switch (counter % 7) {
            case 1:
                return "Friday";
            case 2:
                return "Saturday";
            case 3:
                return "Sunday";
            case 4:
                return "Monday";
            case 5:
                return "Tuesday";
            case 6:
                return "Wednesday";
            default:
                return "Thursday";
        }
    }

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }

    private int dayOfMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 28;
        }
    }
}
