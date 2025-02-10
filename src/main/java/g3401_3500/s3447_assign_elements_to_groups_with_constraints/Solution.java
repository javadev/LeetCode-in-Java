package g3401_3500.s3447_assign_elements_to_groups_with_constraints;

// #Medium #2025_02_09_Time_527_ms_(_%)_Space_70.23_MB_(_%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        Map<Integer, Integer> elementIndexMap = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            elementIndexMap.putIfAbsent(elements[i], i);
        }
        int[] result = new int[groups.length];
        for (int i = 0; i < groups.length; i++) {
            result[i] = findSmallestIndex(groups[i], elementIndexMap);
        }
        return result;
    }

    private int findSmallestIndex(int groupSize, Map<Integer, Integer> elementIndexMap) {
        int minIndex = Integer.MAX_VALUE;
        for (int i = 1; i * i <= groupSize; i++) {
            if (groupSize % i == 0) {
                if (elementIndexMap.containsKey(i)) {
                    minIndex = Math.min(minIndex, elementIndexMap.get(i));
                }
                if (i != groupSize / i && elementIndexMap.containsKey(groupSize / i)) {
                    minIndex = Math.min(minIndex, elementIndexMap.get(groupSize / i));
                }
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
