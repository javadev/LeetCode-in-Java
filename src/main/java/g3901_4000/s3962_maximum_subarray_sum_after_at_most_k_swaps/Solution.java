package g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps;

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Ordered_Set #Binary_Indexed_Tree
// #Senior_Staff #Weekly_Contest_506 #2026_10_20_Time_13_ms_(98.61%)_Space_44.94_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public long maxSum(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            long max = nums[0], cur = nums[0];
            for (int i = 1; i < n; i++) {
                cur = Math.max((long) nums[i], cur + nums[i]);
                max = Math.max(max, cur);
            }
            return max;
        }
        int pc = 0;
        int ps = 0;
        long mele = Long.MIN_VALUE;
        for (int x : nums) {
            if (x > 0) {
                ps += x;
                pc++;
            }
            if (x > mele) mele = x;
        }
        if (pc == 0) return mele;
        int mpiw = 0, cpos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) cpos++;
            if (i >= pc && nums[i - pc] > 0) cpos--;
            if (i >= pc - 1 && cpos > mpiw) {
                mpiw = cpos;
            }
        }
        if (k >= pc - mpiw) {
            return ps;
        }
        int[] v = new int[n];
        int[] s = nums.clone();
        Arrays.sort(s);
        int m = 0;
        for (int x : s) {
            if (m == 0 || v[m - 1] != x) {
                v[m++] = x;
            }
        }
        int[] t = new int[m];
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.binarySearch(v, 0, m, nums[i]);
            t[map[i]]++;
        }
        long ma = Long.MIN_VALUE;
        int[] ife = new int[m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ife, 0);
            long sum = 0;
            int mi = m;
            int mo = m - 1;
            for (int j = i; j < n; j++) {
                int mid = map[j];
                ife[mid]++;
                sum += nums[j];
                if (mid < mi) mi = mid;
                while (mo >= 0 && t[mo] == ife[mo]) {
                    mo--;
                }
                if (mo < 0 || v[mi] >= v[mo]) {
                    if (sum > ma) ma = sum;
                    continue;
                }
                if (sum + (long) k * (v[mo] - v[mi]) <= ma) {
                    continue;
                }
                long tsu = sum;
                int swaps = 0;
                int lp = mi;
                int r = mo;
                int inl = ife[lp], outr = r >= 0 ? t[r] - ife[r] : 0;
                while (swaps < k && lp < r) {
                    if (inl == 0) {
                        inl = ife[++lp];
                    } else if (outr == 0) {
                        if (--r >= 0) outr = t[r] - ife[r];
                    } else if (v[lp] >= v[r]) {
                        break;
                    } else {
                        int take = Math.min(k - swaps, Math.min(inl, outr));
                        tsu += (long) take * (v[r] - v[lp]);
                        swaps += take;
                        inl -= take;
                        outr -= take;
                    }
                }
                if (tsu > ma) {
                    ma = tsu;
                }
            }
        }
        return ma;
    }
}
