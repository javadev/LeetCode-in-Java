package g0101_0200.s0166_fraction_to_recurring_decimal_medium_top_interview_questions_string_hash_table_math;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S2153")
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        // negative case
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            sb.append("-");
        }

        long x = Math.abs(Long.valueOf(numerator));
        long y = Math.abs(Long.valueOf(denominator));

        sb.append(x / y);

        long remainder = x % y;
        if (remainder == 0) {
            return sb.toString();
        }

        // decimal case
        sb.append(".");

        // store the remainder in a Hashmap because in the case of recurring decimal, the remainder
        // repeats as dividend.
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }
            // store the remainder and the index of it's occurence in the String
            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder / y);
            remainder %= y;
        }
        return sb.toString();
    }
}
