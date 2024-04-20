package g2101_2200.s2103_rings_and_rods;

// #Easy #String #Hash_Table #2022_05_31_Time_2_ms_(46.84%)_Space_42.2_MB_(29.77%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countPoints(String rings) {
        Map<Integer, Integer> redHashMap = new HashMap<>();
        Map<Integer, Integer> greenHashMap = new HashMap<>();
        Map<Integer, Integer> blueHashMap = new HashMap<>();
        for (int i = 0; i <= rings.length() - 2; i = i + 2) {
            char charOne = rings.charAt(i);
            char charTwo = rings.charAt(i + 1);

            if (charOne == 'R') {
                redHashMap.put(Character.getNumericValue(charTwo), 123);
            } else if (charOne == 'G') {
                greenHashMap.put(Character.getNumericValue(charTwo), 123);
            } else {
                blueHashMap.put(Character.getNumericValue(charTwo), 123);
            }
        }
        int result = 0;
        for (int i = 0; i <= 9; i++) {
            if (redHashMap.containsKey(i)
                    && greenHashMap.containsKey(i)
                    && blueHashMap.containsKey(i)) {
                result++;
            }
        }
        return result;
    }
}
