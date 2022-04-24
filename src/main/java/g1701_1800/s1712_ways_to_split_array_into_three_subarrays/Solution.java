package g1701_1800.s1712_ways_to_split_array_into_three_subarrays;

// #Medium #Array #Binary_Search #Two_Pointers #Prefix_Sum
// #2022_04_24_Time_121_ms_(29.71%)_Space_80_MB_(16.67%)

public class Solution {
    private int totalSum;
    private int[] sumArr;
    private final int mod = (int) Math.pow(10, 9) + 7;

    public int waysToSplit(int[] nums) {
        int localTotalSum = 0;
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            localTotalSum += nums[i];
            sum[i] = localTotalSum;
        }

        if (localTotalSum == 0) {
            return (int) (getPerm(nums.length) % mod);
        }
        this.totalSum = localTotalSum;
        sumArr = sum;

        long cnt = 0;

        int a1Ptr = 0;
        int a3Ptr = nums.length - 1;
        int sum3 = nums[a3Ptr];

        while (a3Ptr - a1Ptr > 1) {
            if (sum3 >= (localTotalSum - sum3) / 2) {
                int r = findMax(a3Ptr, sum3);
                if (r != -1) {
                    int l = findMin(a3Ptr, sum3);
                    if (l != -1) {
                        cnt += r - l + 1;
                    }
                }
            }
            a3Ptr--;
            sum3 += nums[a3Ptr];
        }
        return (int) (cnt % mod);
    }

    private long getPerm(long l) {
        long sumFirstnMin1 = (l * (l + 1) / 2) - 1 - l;
        return (l - 2) * l - sumFirstnMin1;
    }

    private int findMin(int a3Ptr, int sum3) {
        int lt = 0;
        int rt = a3Ptr - 1;
        while (lt <= rt) {
            int mid = lt + (rt - lt) / 2;
            int sum1 = sumArr[mid];
            int sum2 = totalSum - sum1 - sum3;
            if (sum1 <= sum2 && sum2 <= sum3) {
                if (mid == 0) {

                    return mid;
                }
                int tmpSum2 = totalSum - sumArr[mid - 1] - sum3;
                if (sumArr[mid - 1] > tmpSum2 || tmpSum2 > sum3) {
                    return mid;
                } else {
                    rt = mid - 1;
                }
            } else if (sum1 > sum2 || sum1 > sum3) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return -1;
    }

    private int findMax(int a3Ptr, int sum3) {
        int lt = 0;
        int rt = a3Ptr - 2;
        while (lt <= rt) {
            int mid = lt + (rt - lt) / 2;
            int sum1 = sumArr[mid];
            int sum2 = totalSum - sum1 - sum3;
            if (sum1 <= sum2 && sum2 <= sum3) {
                if (mid == a3Ptr - 2) {
                    return mid;
                }
                int tmpSum2 = totalSum - sumArr[mid + 1] - sum3;
                if (sumArr[mid + 1] > tmpSum2 || tmpSum2 > sum3) {
                    return mid;
                } else {
                    lt = mid + 1;
                }
            } else if (sum1 > sum2 || sum1 > sum3) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return -1;
    }
}
