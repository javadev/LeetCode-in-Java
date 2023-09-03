package g2301_2400.s2321_maximum_score_of_spliced_array;

// #Hard #Array #Dynamic_Programming #2022_06_30_Time_3_ms_(99.68%)_Space_79.3_MB_(84.76%)

public class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        int n = nums1.length;
        for (int num : nums1) {
            sum1 += num;
        }
        for (int num : nums2) {
            sum2 += num;
        }
        if (sum2 > sum1) {
            int temp = sum2;
            sum2 = sum1;
            sum1 = temp;
            int[] temparr = nums2;
            nums2 = nums1;
            nums1 = temparr;
        }
        // now sum1>=sum2
        // maxEndingHere denotes the maximum sum subarray ending at current index(ie. element at
        // current index has to be included)
        // minEndingHere denotes the minimum sum subarray ending at current index
        int maxEndingHere;
        int minEndingHere;
        int maxSoFar;
        int minSoFar;
        int currEle;
        maxEndingHere = minEndingHere = maxSoFar = minSoFar = nums2[0] - nums1[0];
        for (int i = 1; i < n; i++) {
            currEle = nums2[i] - nums1[i];
            minEndingHere += currEle;
            maxEndingHere += currEle;
            if (maxEndingHere < currEle) {
                maxEndingHere = currEle;
            }
            if (minEndingHere > currEle) {
                minEndingHere = currEle;
            }
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
            minSoFar = Math.min(minEndingHere, minSoFar);
        }
        // return the maximum of the 2 possibilities dicussed
        // also keep care that maxSoFar>=0 and maxSoFar<=0
        return Math.max(sum1 + Math.max(maxSoFar, 0), sum2 - Math.min(0, minSoFar));
    }
}
