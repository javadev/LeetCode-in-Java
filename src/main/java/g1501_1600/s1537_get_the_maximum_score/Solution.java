package g1501_1600.s1537_get_the_maximum_score;

// #Hard #Array #Dynamic_Programming #Greedy #Two_Pointers
// #2022_04_10_Time_6_ms_(58.14%)_Space_77.5_MB_(37.68%)

public class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int mod = 1000000007;
        long result = 0;
        int start1 = 0;
        int start2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        while (start1 < nums1.length && start2 < nums2.length) {
            if (nums1[start1] < nums2[start2]) {
                sum1 += nums1[start1];
                start1++;
            } else if (nums1[start1] > nums2[start2]) {
                sum2 += nums2[start2];
                start2++;
            } else {
                result += Math.max(sum1, sum2) + nums1[start1];
                start1++;
                start2++;
                sum1 = 0;
                sum2 = 0;
            }
        }
        while (start1 < nums1.length) {
            sum1 += nums1[start1];
            start1++;
        }
        while (start2 < nums2.length) {
            sum2 += nums2[start2];
            start2++;
        }
        return (int) ((Math.max(sum1, sum2) + result) % mod);
    }
}
