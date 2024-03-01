package g1901_2000.s1980_find_unique_binary_string;

// #Medium #Array #String #Backtracking #2022_05_21_Time_7_ms_(31.88%)_Space_42_MB_(59.01%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        int len = nums[0].length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < len) {
            sb.append(1);
            i++;
        }
        int max = Integer.parseInt(sb.toString(), 2);
        for (int num = 0; num <= max; num++) {
            String binary = Integer.toBinaryString(num);
            if (binary.length() < len) {
                sb.setLength(0);
                sb.append(binary);
                while (sb.length() < len) {
                    sb.insert(0, "0");
                }
                binary = sb.toString();
            }
            if (!set.contains(binary)) {
                return binary;
            }
        }
        return null;
    }
}
