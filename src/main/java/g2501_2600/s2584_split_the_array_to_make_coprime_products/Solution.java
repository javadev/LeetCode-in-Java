package g2501_2600.s2584_split_the_array_to_make_coprime_products;

// #Medium #Breadth_First_Search #Tree #Binary_Search
// #2023_08_22_Time_13_ms_(99.83%)_Space_60.3_MB_(92.18%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final int[] DIVIDE_TO = new int[(int) (1e6) + 1];

    private void fillDivideArray() {
        for (int i = 1; i < DIVIDE_TO.length; i++) {
            DIVIDE_TO[i] = i;
        }
        for (int i = 2; i * i < DIVIDE_TO.length; i++) {
            if (DIVIDE_TO[i] != i) {
                continue;
            }
            for (int j = i + i; j < DIVIDE_TO.length; j += i) {
                if (DIVIDE_TO[j] == j) {
                    DIVIDE_TO[j] = i;
                }
            }
        }
    }

    public int findValidSplit(int[] nums) {
        if (DIVIDE_TO[1] == 0) {
            fillDivideArray();
        }
        Map<Integer, Integer> dMap = new HashMap<>();
        List<Integer>[] dividers = new List[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dividers[i] = new ArrayList<>();
            while (nums[i] != 1) {
                dividers[i].add(DIVIDE_TO[nums[i]]);
                dMap.put(DIVIDE_TO[nums[i]], i);
                nums[i] = nums[i] / DIVIDE_TO[nums[i]];
            }
        }
        int nextEnd = 0;
        int i = 0;
        while (i <= nextEnd) {
            for (int j = 0; j < dividers[i].size(); j++) {
                nextEnd = Math.max(nextEnd, dMap.get(dividers[i].get(j)));
            }
            i++;
        }
        if (i == nums.length) {
            return -1;
        }
        return i - 1;
    }
}
