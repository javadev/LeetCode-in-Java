package g2101_2200.s2191_sort_the_jumbled_numbers;

// #Medium #Array #Sorting #2022_06_07_Time_117_ms_(96.53%)_Space_50.8_MB_(90.75%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static class RealNum {
        int index;
        int orig;
        int real = 0;

        public RealNum(int[] mapping, int orig, int index) {
            this.orig = orig;
            this.index = index;
            int mult = 1;
            if (orig == 0) {
                real = mapping[0];
            } else {
                while (orig > 0) {
                    int mod = orig % 10;
                    orig = orig / 10;
                    real += mapping[mod] * mult;
                    mult *= 10;
                }
            }
        }
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<RealNum> realNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            RealNum realNum = new RealNum(mapping, num, i);
            realNums.add(realNum);
        }
        realNums.sort(
                (a, b) -> {
                    int retval = a.real - b.real;
                    if (retval != 0) {
                        return retval;
                    }
                    return a.index - b.index;
                });
        int[] retval = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            retval[i] = realNums.get(i).orig;
        }
        return retval;
    }
}
