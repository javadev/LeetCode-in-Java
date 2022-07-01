package g1001_1100.s1073_adding_two_negabinary_numbers;

// #Medium #Array #Math #2022_02_27_Time_1_ms_(100.00%)_Space_42.4_MB_(57.83%)

public class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] reverseArr1 = new int[len1];
        for (int i = len1 - 1; i >= 0; i--) {
            reverseArr1[len1 - i - 1] = arr1[i];
        }
        int[] reverseArr2 = new int[len2];
        for (int i = len2 - 1; i >= 0; i--) {
            reverseArr2[len2 - i - 1] = arr2[i];
        }
        int[] sumArray = new int[Math.max(len1, len2) + 2];
        System.arraycopy(reverseArr1, 0, sumArray, 0, len1);
        for (int i = 0; i < sumArray.length; i++) {
            if (i < len2) {
                sumArray[i] += reverseArr2[i];
            }
            if (sumArray[i] > 1) {
                sumArray[i] -= 2;
                sumArray[i + 1]--;
            } else if (sumArray[i] == -1) {
                sumArray[i] = 1;
                sumArray[i + 1]++;
            }
        }
        int resultLen = sumArray.length;
        for (int i = sumArray.length - 1; i >= 0; i--) {
            if (sumArray[i] == 0) {
                resultLen--;
            } else {
                break;
            }
        }
        if (resultLen == 0) {
            return new int[] {0};
        }
        int[] result = new int[resultLen];
        for (int i = resultLen - 1; i >= 0; i--) {
            result[resultLen - i - 1] = sumArray[i];
        }
        return result;
    }
}
