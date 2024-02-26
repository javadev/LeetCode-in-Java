package g2101_2200.s2165_smallest_value_of_the_rearranged_number;

// #Medium #Math #Sorting #2022_06_05_Time_1_ms_(100.00%)_Space_41.6_MB_(33.45%)

public class Solution {
    public long smallestNumber(long num) {
        int[] count = new int[10];
        long tempNum;
        if (num > 0) {
            tempNum = num;
        } else {
            tempNum = num * -1;
        }
        int min = 10;
        while (tempNum > 0) {
            int rem = (int) (tempNum % 10);
            if (rem != 0) {
                min = Math.min(min, rem);
            }
            count[rem]++;
            tempNum = tempNum / 10;
        }
        long output = 0;
        if (num > 0) {
            output = output * 10 + min;
            count[min]--;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < count[i]; j++) {
                    output = output * 10 + i;
                }
            }
        } else {
            for (int i = 9; i >= 0; i--) {
                for (int j = 0; j < count[i]; j++) {
                    output = output * 10 + i;
                }
            }
            output = output * -1;
        }
        return output;
    }
}
