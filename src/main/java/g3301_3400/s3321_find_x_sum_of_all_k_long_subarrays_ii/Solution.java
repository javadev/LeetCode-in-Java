package g3301_3400.s3321_find_x_sum_of_all_k_long_subarrays_ii;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_10_15_Time_410_ms_(94.03%)_Space_66.1_MB_(82.09%)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    private static class RC implements Comparable<RC> {
        int val;
        int cnt;

        RC(int v, int c) {
            val = v;
            cnt = c;
        }

        public int compareTo(RC o) {
            if (cnt != o.cnt) {
                return cnt - o.cnt;
            }
            return val - o.val;
        }
    }

    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];
        Map<Integer, Integer> cnt = new HashMap<>();
        TreeSet<RC> s1 = new TreeSet<>();
        TreeSet<RC> s2 = new TreeSet<>();
        long sum = 0;
        long xSum = 0;
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            int curCnt = cnt.getOrDefault(nums[i], 0);
            cnt.put(nums[i], curCnt + 1);
            RC tmp = new RC(nums[i], curCnt);
            if (s1.contains(tmp)) {
                s1.remove(tmp);
                s1.add(new RC(nums[i], curCnt + 1));
                xSum += nums[i];
            } else {
                s2.remove(tmp);
                s1.add(new RC(nums[i], curCnt + 1));
                xSum += (long) nums[i] * (curCnt + 1);
                while (s1.size() > x) {
                    RC l = s1.first();
                    s1.remove(l);
                    xSum -= (long) l.val * l.cnt;
                    s2.add(l);
                }
            }
            if (i >= k - 1) {
                ans[i - k + 1] = s1.size() == x ? xSum : sum;
                int v = nums[i - k + 1];
                sum -= v;
                curCnt = cnt.get(v);
                if (curCnt > 1) {
                    cnt.put(v, curCnt - 1);
                } else {
                    cnt.remove(v);
                }
                tmp = new RC(v, curCnt);
                if (s2.contains(tmp)) {
                    s2.remove(tmp);
                    if (curCnt > 1) {
                        s2.add(new RC(v, curCnt - 1));
                    }
                } else {
                    s1.remove(tmp);
                    xSum -= (long) v * curCnt;
                    if (curCnt > 1) {
                        s2.add(new RC(v, curCnt - 1));
                    }
                    while (s1.size() < x && !s2.isEmpty()) {
                        RC r = s2.last();
                        s2.remove(r);
                        s1.add(r);
                        xSum += (long) r.val * r.cnt;
                    }
                }
            }
        }
        return ans;
    }
}
