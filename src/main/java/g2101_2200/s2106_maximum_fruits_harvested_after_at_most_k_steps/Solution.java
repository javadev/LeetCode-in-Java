package g2101_2200.s2106_maximum_fruits_harvested_after_at_most_k_steps;

// #Hard #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_05_31_Time_27_ms_(48.57%)_Space_128.7_MB_(44.76%)

class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int posOfLastFruit = fruits[n - 1][0];
        int[] prefixArr = new int[posOfLastFruit + 1];
        int start = Math.max(startPos - k, 0);
        int end = Math.min(startPos + k, prefixArr.length - 1);

        if (startPos > posOfLastFruit) {
            int diff = startPos - posOfLastFruit;
            startPos = posOfLastFruit;
            k = k - diff;
            if (k == 0) {
                return fruits[posOfLastFruit][1];
            } else if (k < 0) {
                return 0;
            }
        }

        for (int[] fruit : fruits) {
            prefixArr[fruit[0]] = fruit[1];
        }

        int curr = 0;
        for (int i = startPos - 1; i >= start; i--) {
            curr += prefixArr[i];
            prefixArr[i] = curr;
        }

        curr = 0;
        for (int i = startPos + 1; i <= end; i++) {
            curr += prefixArr[i];
            prefixArr[i] = curr;
        }

        int minimum = prefixArr[startPos];
        prefixArr[startPos] = 0;
        int ans = 0;

        for (int i = start; i < startPos; i++) {
            int maxCurrPossible = prefixArr[i];
            int stepsAlreadyWalked = startPos - i;
            int stepsRemaining = k - stepsAlreadyWalked;
            int endIndex = i + stepsRemaining;

            if (endIndex > startPos && endIndex < prefixArr.length) {
                maxCurrPossible += prefixArr[endIndex];
            } else if (endIndex >= prefixArr.length) {
                maxCurrPossible += prefixArr[prefixArr.length - 1];
            }

            ans = Math.max(ans, maxCurrPossible);
        }

        for (int i = startPos + 1; i <= end; i++) {
            int maxCurrPossible = prefixArr[i];
            int stepsAlreadyWalked = i - startPos;
            int stepsRemaining = k - stepsAlreadyWalked;
            int endIndex = i - stepsRemaining;

            if (endIndex < startPos && endIndex >= 0) {
                maxCurrPossible += prefixArr[endIndex];
            } else if (endIndex < 0) {
                maxCurrPossible += prefixArr[0];
            }

            ans = Math.max(ans, maxCurrPossible);
        }

        return ans + minimum;
    }
}
