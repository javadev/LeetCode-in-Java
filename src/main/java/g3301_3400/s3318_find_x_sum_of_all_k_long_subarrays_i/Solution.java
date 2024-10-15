package g3301_3400.s3318_find_x_sum_of_all_k_long_subarrays_i;

// #Easy #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_10_15_Time_11_ms_(77.35%)_Space_45.4_MB_(54.28%)

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    private static class Pair {
        int num;
        int freq;

        Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Pair> pq =
                    new PriorityQueue<>(
                            (a, b) -> {
                                if (a.freq == b.freq) {
                                    return b.num - a.num;
                                }
                                return b.freq - a.freq;
                            });
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.add(new Pair(entry.getKey(), entry.getValue()));
            }
            int count = x;
            int sum = 0;
            while (!pq.isEmpty() && count > 0) {
                Pair pair = pq.remove();
                sum += pair.num * pair.freq;
                count--;
            }
            ans[i] = sum;
        }
        return ans;
    }
}
