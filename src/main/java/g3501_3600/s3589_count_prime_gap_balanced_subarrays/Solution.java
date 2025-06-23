package g3501_3600.s3589_count_prime_gap_balanced_subarrays;

// #Medium #Array #Math #Sliding_Window #Queue #Number_Theory #Monotonic_Queue
// #2025_06_23_Time_407_ms_(100.00%)_Space_56.17_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

@SuppressWarnings("java:S5413")
public class Solution {
    private static final int MAXN = 100005;
    private final boolean[] isPrime;

    public Solution() {
        isPrime = new boolean[MAXN];
        Arrays.fill(isPrime, true);
        sieve();
    }

    void sieve() {
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < MAXN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAXN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public int primeSubarray(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int res = 0;
        TreeMap<Integer, Integer> ms = new TreeMap<>();
        List<Integer> primeIndices = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            if (nums[r] < MAXN && isPrime[nums[r]]) {
                ms.put(nums[r], ms.getOrDefault(nums[r], 0) + 1);
                primeIndices.add(r);
            }
            while (!ms.isEmpty() && ms.lastKey() - ms.firstKey() > k) {
                if (nums[l] < MAXN && isPrime[nums[l]]) {
                    int count = ms.get(nums[l]);
                    if (count == 1) {
                        ms.remove(nums[l]);
                    } else {
                        ms.put(nums[l], count - 1);
                    }
                    if (!primeIndices.isEmpty() && primeIndices.get(0) == l) {
                        primeIndices.remove(0);
                    }
                }
                l++;
            }
            if (primeIndices.size() >= 2) {
                int prev = primeIndices.get(primeIndices.size() - 2);
                if (prev >= l) {
                    res += (prev - l + 1);
                }
            }
        }
        return res;
    }
}
