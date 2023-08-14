package g1201_1300.s1262_greatest_sum_divisible_by_three;

// #Medium #Array #Dynamic_Programming #Greedy #2022_03_13_Time_5_ms_(95.82%)_Space_54_MB_(52.09%)

public class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int smallestNumWithMod1 = 10001;
        int secondSmallestNumWithMod1 = 10002;
        int smallestNumWithMod2 = 10001;
        int secondSmallestNumWithMod2 = 10002;
        for (int i : nums) {
            sum += i;
            if (i % 3 == 1) {
                if (i <= smallestNumWithMod1) {
                    int temp = smallestNumWithMod1;
                    smallestNumWithMod1 = i;
                    secondSmallestNumWithMod1 = temp;
                } else if (i < secondSmallestNumWithMod1) {
                    secondSmallestNumWithMod1 = i;
                }
            }
            if (i % 3 == 2) {
                if (i <= smallestNumWithMod2) {
                    int temp = smallestNumWithMod2;
                    smallestNumWithMod2 = i;
                    secondSmallestNumWithMod2 = temp;
                } else if (i < secondSmallestNumWithMod2) {
                    secondSmallestNumWithMod2 = i;
                }
            }
        }
        if (sum % 3 == 0) {
            return sum;
        } else if (sum % 3 == 2) {
            int min =
                    Math.min(smallestNumWithMod2, smallestNumWithMod1 + secondSmallestNumWithMod1);
            return sum - min;
        } else if (sum % 3 == 1) {
            int min =
                    Math.min(smallestNumWithMod1, smallestNumWithMod2 + secondSmallestNumWithMod2);
            return sum - min;
        }
        return sum;
    }
}
