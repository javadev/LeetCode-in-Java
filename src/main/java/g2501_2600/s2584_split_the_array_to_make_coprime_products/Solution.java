package g2501_2600.s2584_split_the_array_to_make_coprime_products;

// #Hard #Array #Hash_Table #Math #Number_Theory
// #2023_08_28_Time_236_ms_(58.73%)_Space_56.2_MB_(15.87%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Solution {
    private final int[] divideTo = new int[(int) (1e6) + 1];

    private void fillDivideArray() {
        for (int i = 1; i < divideTo.length; i++) {
            divideTo[i] = i;
        }
        for (int i = 2; i * i < divideTo.length; i++) {
            if (divideTo[i] != i) {
                continue;
            }
            for (int j = i + i; j < divideTo.length; j += i) {
                if (divideTo[j] == j) {
                    divideTo[j] = i;
                }
            }
        }
    }

    public int findValidSplit(int[] nums) {
        if (divideTo[1] == 0) {
            fillDivideArray();
        }
        Map<Integer, Integer> dMap = new HashMap<>();
        List<Integer>[] dividers = new List[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dividers[i] = new ArrayList<>();
            while (nums[i] != 1) {
                dividers[i].add(divideTo[nums[i]]);
                dMap.put(divideTo[nums[i]], i);
                nums[i] = nums[i] / divideTo[nums[i]];
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
