package g3901_4000.s3953_maximum_score_with_co_prime_element;

// #Hard #Array #Hash_Table #Math #Enumeration #Number_Theory #Combinatorics #Senior_Staff
// #Biweekly_Contest_184 #2026_10_20_Time_33_ms_(100.00%)_Space_86.44_MB_(96.88%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int maxScore(int[] nums, int maxVal) {
        int max = findMax(nums, maxVal);
        int[] cnt = countNumbers(nums, max);
        int[] groupCnt = buildGroupCounts(cnt, max);

        int best = findBestAboveMaxVal(max, maxVal, cnt, groupCnt);
        return findBestWithinMaxVal(maxVal, cnt, groupCnt, best);
    }

    private int findMax(int[] nums, int maxVal) {
        int max = maxVal;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private int[] countNumbers(int[] nums, int max) {
        int[] cnt = new int[max + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        return cnt;
    }

    private int[] buildGroupCounts(int[] cnt, int max) {
        int[] groupCnt = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j * i <= max; j++) {
                groupCnt[i] += cnt[j * i];
            }
        }

        return groupCnt;
    }

    private int findBestAboveMaxVal(int max, int maxVal, int[] cnt, int[] groupCnt) {
        int best = -1;

        for (int i = max; i > maxVal; i--) {
            if (cnt[i] == 0) {
                continue;
            }

            int change = countConflict(i, groupCnt);
            best = Math.max(best, i - change + 1);
        }

        return best;
    }

    private int findBestWithinMaxVal(int maxVal, int[] cnt, int[] groupCnt, int best) {

        for (int i = maxVal; i > 0; i--) {
            if (best != -1 && i <= best) {
                break;
            }

            int change = countConflict(i, groupCnt);
            change = adjustChange(i, change, cnt);

            best = Math.max(best, i - change);
        }

        return best;
    }

    private int adjustChange(int target, int change, int[] cnt) {
        if (change > 0 && cnt[target] != 0) {
            change--;
        }

        if (change == 0 && cnt[target] == 0) {
            change++;
        }

        return change;
    }

    private int countConflict(int target, int[] groupCnt) {
        List<Integer> primeFactors = getFactor(target);
        int change = 0;
        int subsetCount = 1 << primeFactors.size();

        for (int mask = 1; mask < subsetCount; mask++) {
            change += calculateSubsetContribution(mask, primeFactors, groupCnt);
        }

        return change;
    }

    private int calculateSubsetContribution(int mask, List<Integer> primeFactors, int[] groupCnt) {

        int product = 1;
        int bits = 0;

        for (int k = 0; k < primeFactors.size(); k++) {
            if ((mask & (1 << k)) == 0) {
                continue;
            }

            bits++;
            product *= primeFactors.get(k);
        }

        int contribution = groupCnt[product];
        return bits % 2 == 1 ? contribution : -contribution;
    }

    private List<Integer> getFactor(long number) {
        long n = number;
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= n / i; i++) {
            if (n % i != 0) {
                continue;
            }

            primeFactors.add(i);
            while (n % i == 0) {
                n /= i;
            }
        }

        if (n > 1) {
            primeFactors.add((int) n);
        }

        return primeFactors;
    }
}
