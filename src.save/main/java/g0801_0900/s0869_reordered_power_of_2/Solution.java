package g0801_0900.s0869_reordered_power_of_2;

// #Medium #Math #Sorting #Counting #Enumeration
// #2022_03_28_Time_9_ms_(25.97%)_Space_42.8_MB_(11.69%)

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean reorderedPowerOf2(int n) {
        int i = 0;
        while (Math.pow(2, i) < (long) n * 10) {
            if (isValid(String.valueOf((int) (Math.pow(2, i++))), String.valueOf(n))) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid(String a, String b) {
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> mTwo = new HashMap<>();
        for (char c : a.toCharArray()) {
            m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
        }
        for (char c : b.toCharArray()) {
            mTwo.put(c, mTwo.containsKey(c) ? mTwo.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : mTwo.entrySet()) {
            if (!m.containsKey(entry.getKey())
                    || !Objects.equals(entry.getValue(), m.get(entry.getKey()))) {
                return false;
            }
        }
        return a.charAt(0) != '0' && m.size() == mTwo.size();
    }
}
