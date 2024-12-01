package g3301_3400.s3371_identify_the_largest_outlier_in_an_array;

// #Medium #2024_12_01_Time_633_ms_(100.00%)_Space_64.5_MB_(100.00%)

import java.util.TreeMap;

public class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            if ((sum - num) % 2 == 0) {
                int target = (sum - num) / 2;
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                if (frequencyMap.get(num) == 0) {
                    frequencyMap.remove(num);
                }
                if (frequencyMap.containsKey(target)) {
                    ans = Math.max(ans, num);
                }
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
