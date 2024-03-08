package g2501_2600.s2517_maximum_tastiness_of_candy_basket;

// #Medium #Array #Sorting #Binary_Search #2023_04_18_Time_38_ms_(100.00%)_Space_51.8_MB_(53.92%)

import java.util.Arrays;

public class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int left = 1;
        int right = (price[n - 1] - price[0]) / (k - 1) + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(mid, price, k)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }

    private boolean check(int target, int[] price, int k) {
        int count = 1;
        int x0 = price[0];
        for (int x : price) {
            if (x >= x0 + target) {
                count++;
                if (count >= k) {
                    return true;
                }
                x0 = x;
            }
        }
        return false;
    }
}
