package g0901_1000.s0991_broken_calculator;

// #Medium #Math #Greedy

public class Solution {
    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while (startValue != target) {
            if (target > startValue && target % 2 != 0) {
                target += 1;
                result++;
            } else if (target > startValue) {
                target /= 2;
                result++;
            } else {
                result += startValue - target;
                break;
            }
        }
        return result;
    }
}
