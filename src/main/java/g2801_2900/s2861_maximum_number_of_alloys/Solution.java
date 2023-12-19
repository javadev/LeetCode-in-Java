package g2801_2900.s2861_maximum_number_of_alloys;

// #Medium #Array #Binary_Search #2023_12_19_Time_16_ms_(91.51%)_Space_43.6_MB_(78.18%)

import java.util.List;

public class Solution {
    public int maxNumberOfAlloys(
            int n,
            int k,
            int budget,
            List<List<Integer>> composition,
            List<Integer> stock,
            List<Integer> cost) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(stock.get(i), max);
        }
        for (int i = 0; i < k; i++) {
            int temp = 0;
            int low = 0;
            int high = max + budget;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (isPos(i, mid, n, budget, composition, stock, cost)) {
                    low = mid + 1;
                    temp = mid;
                } else {
                    high = mid - 1;
                }
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }

    private boolean isPos(
            int idx,
            int mid,
            int n,
            int budget,
            List<List<Integer>> composition,
            List<Integer> stock,
            List<Integer> cost) {
        long paiSa = 0L;
        for (int i = 0; i < n; i++) {
            long require = ((long) composition.get(idx).get(i)) * (mid);
            long have = stock.get(i);
            long diff = require - have;
            if (diff > 0) {
                paiSa += diff * ((long) cost.get(i));
            }
            if (budget < paiSa) {
                return false;
            }
        }
        return budget >= paiSa;
    }
}
