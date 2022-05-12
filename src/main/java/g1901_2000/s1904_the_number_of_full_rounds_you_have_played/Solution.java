package g1901_2000.s1904_the_number_of_full_rounds_you_have_played;

// #Medium #String #Math #2022_05_12_Time_0_ms_(100.00%)_Space_40_MB_(96.23%)

public class Solution {
    private static final int MID_NIGHT_END = 1440;
    private static final int MID_NIGHT_START = 0;
    private static final int ROUND_INTERVAL = 15;

    public int numberOfRounds(String loginTime, String logoutTime) {
        int loginSerializeTime = serializeTime(loginTime);
        int logoutSerializeTime = serializeTime(logoutTime);
        if (logoutSerializeTime - 14 < loginSerializeTime
                && logoutSerializeTime > loginSerializeTime) {
            return 0;
        }
        loginSerializeTime = maskSerializeTime(loginSerializeTime, 14);
        logoutSerializeTime = maskSerializeTime(logoutSerializeTime, 0);
        if (loginSerializeTime == logoutSerializeTime) {
            return 0;
        }
        if (loginSerializeTime > logoutSerializeTime + 14) {
            return calculateFullRounds(loginSerializeTime, MID_NIGHT_END)
                    + calculateFullRounds(MID_NIGHT_START, logoutSerializeTime);
        }
        return calculateFullRounds(loginSerializeTime, logoutSerializeTime);
    }

    private int maskSerializeTime(int serializeTime, int mask) {
        return (serializeTime + mask) / ROUND_INTERVAL * ROUND_INTERVAL;
    }

    private int serializeTime(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
    }

    private int calculateFullRounds(int login, int logout) {
        return (logout - login) / ROUND_INTERVAL;
    }
}
