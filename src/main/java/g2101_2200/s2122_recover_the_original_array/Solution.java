package g2101_2200.s2122_recover_the_original_array;

// #Hard #Array #Hash_Table #Sorting #Enumeration
// #2022_06_02_Time_30_ms_(71.23%)_Space_55.2_MB_(35.62%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S135")
public class Solution {
    public int[] recoverArray(int[] nums) {
        int n2 = nums.length;
        int n = n2 / 2;
        int[] res = new int[n];
        boolean[] visited = new boolean[n2];
        Map<Integer, int[]> map = new HashMap<>();
        Arrays.sort(nums);
        map.put(nums[0], new int[] {0, 1});
        for (int i = 1; i < n2; i++) {
            if (nums[i] != nums[i - 1]) {
                map.get(nums[i - 1])[1] = i;
                map.put(nums[i], new int[] {i, i + 1});
            }
        }
        map.get(nums[n2 - 1])[1] = n2;
        for (int i = 1; i <= n; i++) {
            int k2 = nums[i] - nums[0];
            int k = k2 / 2;
            int idx = 0;
            if (k2 == 0 || k2 % 2 != 0) {
                continue;
            }
            Arrays.fill(visited, false);
            int itr;
            for (int j = 0; j < n2; j++) {
                if (visited[j]) {
                    continue;
                }
                if (!map.containsKey(nums[j] + k2)) {
                    break;
                }
                int[] pos = map.get(nums[j] + k2);
                itr = pos[0];
                while (itr < pos[1] && visited[itr]) {
                    itr++;
                }
                if (itr == pos[1]) {
                    break;
                }
                visited[j] = visited[itr] = true;
                res[idx++] = nums[j] + k;
            }
            if (idx == n) {
                break;
            }
        }
        return res;
    }
}
