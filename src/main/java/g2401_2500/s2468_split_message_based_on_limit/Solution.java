package g2401_2500.s2468_split_message_based_on_limit;

// #Hard #String #Binary_Search #2023_01_11_Time_27_ms_(99.08%)_Space_50.2_MB_(94.85%)

@SuppressWarnings("java:S3518")
public class Solution {
    public String[] splitMessage(String message, int limit) {
        int total = 0;
        int running = 0;
        int count;
        int totalReq;
        int valUsed = -1;
        int minLimitReq;
        for (int i = 1; i <= message.length(); ++i) {
            count = getCount(i);
            running += count;
            total = running + (count * i) + 3 * i;
            totalReq = total + message.length();
            minLimitReq = (totalReq + i - 1) / i;
            if (minLimitReq <= limit) {
                valUsed = i;
                break;
            }
        }
        if (valUsed == -1) {
            return new String[] {};
        }
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        StringBuilder sb2 = new StringBuilder();
        int left;
        String[] result = new String[valUsed];
        for (int i = 1; i <= valUsed; ++i) {
            sb2.setLength(0);
            sb.setLength(0);
            sb2.append('<');
            sb2.append(i);
            sb2.append('/');
            sb2.append(valUsed);
            sb2.append('>');
            left = limit - sb2.length();
            while (idx < message.length() && left-- > 0) {
                sb.append(message.charAt(idx++));
            }
            sb.append(sb2);
            result[i - 1] = sb.toString();
        }
        return result;
    }

    private int getCount(int val) {
        int result = 0;
        while (val != 0) {
            val /= 10;
            ++result;
        }
        return result;
    }
}
