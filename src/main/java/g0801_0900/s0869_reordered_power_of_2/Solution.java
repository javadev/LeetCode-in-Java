package g0801_0900.s0869_reordered_power_of_2;

// #Medium #Math #Sorting #Counting #Enumeration

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
        for (char c : mTwo.keySet()) {
            if (!m.containsKey(c) || !Objects.equals(mTwo.get(c), m.get(c))) {
                return false;
            }
        }
        return a.charAt(0) != '0' && m.size() == mTwo.size();
    }
}
