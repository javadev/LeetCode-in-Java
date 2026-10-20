package g3901_4000.s3947_maximum_number_of_items_from_sale_ii;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Staff #Weekly_Contest_504
// #2026_10_20_Time_20_ms_(82.93%)_Space_231.68_MB_(87.81%)

import java.util.Arrays;

public class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] count = new int[n + 1];
        long min = Long.MAX_VALUE;
        for (int[] item : items) {
            count[item[0]]++;
            if (item[1] < min) {
                min = item[1];
            }
        }
        int[] temp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (count[i] > 0) {
                int m = -1;
                for (int j = i; j <= n; j += i) {
                    m += count[j];
                }
                temp[i] = m;
            }
        }
        long[] deal = new long[n];
        int dealcount = 0;
        long limit = min * 2;
        for (int[] item : items) {
            int first = item[0];
            int second = item[1];
            if (second < limit) {
                int m = temp[first];
                if (m > 0) {
                    deal[dealcount++] = ((long) second << 32) | (m & 0xFFFFFFFFL);
                }
            }
        }
        Arrays.sort(deal, 0, dealcount);
        long total = 0;
        for (int i = 0; i < dealcount; i++) {
            long deals = deal[i];
            int m = (int) (deals >>> 32);
            int counts = (int) (deals & 0xFFFFFFFFL);
            if (budget >= m) {
                long time = Math.min((long) counts, budget / m);
                budget = (int) (budget - (time * m));
                total += 2 * time;
            }
        }
        total += budget / min;
        return (int) total;
    }
}
