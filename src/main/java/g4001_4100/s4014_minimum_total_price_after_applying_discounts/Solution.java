package g4001_4100.s4014_minimum_total_price_after_applying_discounts;

// #Medium #Array #Sorting #Greedy #Two_Pointers #Senior #Weekly_Contest_514
// #2026_11_17_Time_26_ms_(100.00%)_Space_140.09_MB_(97.57%)

public class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int[] discount = new int[101];
        for (int dis : discounts) {
            discount[dis]++;
        }
        int maxprice = 0;
        for (int price : prices) {
            if (maxprice < price) {
                maxprice = price;
            }
        }
        int[] price = new int[maxprice + 1];
        for (int p : prices) {
            price[p]++;
        }
        double ans = 0;
        int i = pos(price, maxprice);
        int j = pos(discount, 100);
        while (i > 0) {
            ans += i - (i * j) / 100.0;
            i = pos(price, i);
            j = pos(discount, j);
        }
        return ans;
    }

    private int pos(int[] arr, int p) {
        for (int i = p; i > 0; i--) {
            if (arr[i] > 0) {
                arr[i]--;
                return i;
            }
        }
        return 0;
    }
}
