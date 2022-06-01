package g2101_2200.s2117_abbreviating_the_product_of_a_range;

// #Hard #Math #2022_06_01_Time_70_ms_(89.47%)_Space_42.2_MB_(78.95%)

public class Solution {
    public String abbreviateProduct(int left, int right) {
        long threshold0 = 100_000_000_000_000L;
        long threshold1 = 10_000_000_000L;
        long threshold2 = 100_000;
        long curr = 1;
        int i;
        int zerosCount = 0;
        for (i = left; i <= right && curr < threshold0; i++) {
            curr *= i;
            while (curr % 10 == 0) {
                curr /= 10;
                zerosCount++;
            }
        }
        if (curr < threshold1) {
            return String.format("%de%d", curr, zerosCount);
        }

        long low = curr % threshold1;
        double high = curr;
        while (high > threshold1) {
            high /= 10;
        }

        for (; i <= right; i++) {
            low *= i;
            high *= i;
            while (low % 10 == 0) {
                low /= 10;
                zerosCount++;
            }
            if (low >= threshold1) {
                low %= threshold1;
            }
            while (high > threshold1) {
                high /= 10;
            }
        }

        while (high >= threshold2) {
            high /= 10;
        }
        low %= threshold2;
        return String.format("%d...%05de%d", (int) high, low, zerosCount);
    }
}
