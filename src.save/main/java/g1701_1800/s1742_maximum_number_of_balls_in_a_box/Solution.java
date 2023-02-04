package g1701_1800.s1742_maximum_number_of_balls_in_a_box;

// #Easy #Hash_Table #Math #Counting #2022_04_29_Time_7_ms_(98.87%)_Space_38.9_MB_(97.97%)

public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int maxValue;
        int[] countArray = new int[46];
        int currentSum = getDigitSum(lowLimit);
        countArray[currentSum]++;
        maxValue = 1;
        for (int i = lowLimit + 1; i <= highLimit; i++) {
            if (i % 10 == 0) {
                currentSum = getDigitSum(i);
            } else {
                currentSum++;
            }
            countArray[currentSum]++;
            if (countArray[currentSum] > maxValue) {
                maxValue = countArray[currentSum];
            }
        }
        return maxValue;
    }

    private int getDigitSum(int num) {
        int currentSum = 0;
        while (num > 0) {
            currentSum += num % 10;
            num = num / 10;
        }
        return currentSum;
    }
}
