package g1301_1400.s1323_maximum_69_number;

// #Easy #Math #Greedy #2022_03_19_Time_3_ms_(32.03%)_Space_39.5_MB_(67.69%)

import java.util.stream.IntStream;

public class Solution {
    public int maximum69Number(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        IntStream.range(0, chars.length)
                .filter(i -> chars[i] == '6')
                .findFirst()
                .ifPresent(i -> chars[i] = '9');
        return Integer.parseInt(new String(chars));
    }
}
