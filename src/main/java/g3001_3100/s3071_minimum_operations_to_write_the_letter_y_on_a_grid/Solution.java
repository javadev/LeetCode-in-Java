package g3001_3100.s3071_minimum_operations_to_write_the_letter_y_on_a_grid;

// #Medium #Array #Hash_Table #Matrix #Counting #2024_04_15_Time_1_ms_(100.00%)_Space_45_MB_(60.73%)

public class Solution {
    public int minimumOperationsToWriteY(int[][] arr) {
        int n = arr.length;
        int[] cnt1 = new int[3];
        int[] cnt2 = new int[3];
        int x = n / 2;
        int y = n / 2;
        for (int j = x; j < n; j++) {
            cnt1[arr[j][y]]++;
            arr[j][y] = 3;
        }
        for (int j = x; j >= 0; j--) {
            if (arr[j][j] != 3) {
                cnt1[arr[j][j]]++;
            }
            arr[j][j] = 3;
        }
        for (int j = x; j >= 0; j--) {
            if (arr[j][n - 1 - j] != 3) {
                cnt1[arr[j][n - 1 - j]]++;
            }
            arr[j][n - 1 - j] = 3;
        }
        for (int[] ints : arr) {
            for (int j = 0; j < n; j++) {
                if (ints[j] != 3) {
                    cnt2[ints[j]]++;
                }
            }
        }
        int s1 = cnt1[0] + cnt1[1] + cnt1[2];
        int s2 = cnt2[0] + cnt2[1] + cnt2[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i != j) {
                    min = Math.min(s1 - cnt1[i] + s2 - cnt2[j], min);
                }
            }
        }
        return min;
    }
}
