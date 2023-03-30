package g1901_2000.s1906_minimum_absolute_difference_queries;

// #Medium #Array #Hash_Table #2022_05_11_Time_176_ms_(71.61%)_Space_82.6_MB_(95.48%)
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        //Extract class refactoring technique
        SegmentTree segmentTree = new SegmentTree(nums, n);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int minAbsDiff = segmentTree.findMinAbsDiff(l - 1, r - 1, 0, n - 1, 0);
            System.out.println(minAbsDiff);
        }

        scanner.close();

    }
}


