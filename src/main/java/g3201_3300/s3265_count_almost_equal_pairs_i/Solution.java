package g3201_3300.s3265_count_almost_equal_pairs_i;

// #Medium #Array #Hash_Table #Sorting #Counting #Enumeration
// #2024_08_28_Time_5_ms_(100.00%)_Space_44.7_MB_(91.23%)

public class Solution {
    public int countPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]
                        || ((nums[j] - nums[i]) % 9 == 0 && check(nums[i], nums[j]))) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean check(int a, int b) {
        int[] ca = new int[10];
        int[] cb = new int[10];
        int d = 0;
        while (a > 0 || b > 0) {
            if (a % 10 != b % 10) {
                d++;
                if (d > 2) {
                    return false;
                }
            }
            ca[a % 10]++;
            cb[b % 10]++;
            a /= 10;
            b /= 10;
        }
        return d == 2 && areEqual(ca, cb);
    }

    private boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
