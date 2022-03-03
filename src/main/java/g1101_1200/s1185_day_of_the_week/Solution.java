package g1101_1200.s1185_day_of_the_week;

// #Easy #Math #2022_03_03_Time_1_ms_(51.16%)_Space_41_MB_(42.25%)

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int yr = chooseYear((year - 1) % 400) % 7;
        int m = chooseMonth(month) % 7;
        int d = day % 7;
        int sum = 0;

        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month > 2) {
            sum = sum + 1;
        }

        sum = sum + yr + m + d;
        return chooseDay(sum % 7);
    }

    private int chooseYear(int year) {
        if (year >= 100 && year < 200) {
            return (int) Math.floor((year - 100.0) / 4) + year - 100 + 5;
        } else if (year >= 200 && year < 300) {
            return (int) Math.floor((year - 200.0) / 4) + year - 200 + 3;
        } else if (year >= 300 && year < 400) {
            return (int) Math.floor((year - 300.0) / 4) + year - 300 + 1;
        } else {
            return (int) Math.floor(year * 1.0 / 4) + year;
        }
    }

    private int chooseMonth(int month) {
        switch (month) {
            case 2:
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 11;
            case 7:
                return 13;
            case 8:
                return 16;
            case 9:
                return 19;
            case 10:
                return 21;
            case 11:
                return 24;
            case 12:
                return 26;
            default:
                return 0;
        }
    }

    private String chooseDay(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "";
        }
    }
}
